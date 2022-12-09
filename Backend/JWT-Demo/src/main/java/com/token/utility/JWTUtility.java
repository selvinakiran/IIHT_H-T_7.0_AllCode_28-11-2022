package com.token.utility;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;
import java.util.function.*;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JWTUtility implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 22334445657L;
	public static final long JWT_TOKEN_VALIDITY = 5*60*60;
	
	public static final String secretkey = "Selvina";
	
	//To retrieve username from JWT Token
	public String getUsernameFromToken(String token) {
		return getclaimFromToken(token, Claims::getSubject);
	}
	
	//To retrieve the expiration date from the token 
	public Date getExpirationDateFromToken(String token) {
		return getclaimFromToken(token, Claims::getExpiration);
	}
	
	private <T> T getclaimFromToken(String token, Function<Claims,T> claimsResolver) {
		final Claims claims = getAllClaimsFromTokenClaims(token);
		return claimsResolver.apply(claims);
		
	}
	
	//for retreiving any information from the token we will need for the secret Key
	private Claims getAllClaimsFromTokenClaims(String token) {
		return Jwts.parser().setSigningKey(secretkey).parseClaimsJws(token).getBody();
	}
	
	//method to check if the token is expired
	private Boolean isTokenExpired(String token)
	{
		final Date expiration =getExpirationDateFromToken(token);
		return expiration.before(new Date());
	}
	
	//generate token for User
	public String generateToken(UserDetails userDetails) {
		Map<String, Object> claims=new HashMap<>();
		return doGenerateToken(claims, userDetails.getUsername());
	}
	
	private String doGenerateToken(Map<String,Object> claims,String subject) {
		return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY*1000))
				.signWith(SignatureAlgorithm.HS512, secretkey).compact();
	}
	
	
	
	//Validate the token
	
	public boolean validateToken (String token ,UserDetails userDetails) {
		final String username =getUsernameFromToken(token);
		return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
