package com.resourse.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.resourse.entity.Resourse;




@Service
public class ResourseServiceImpl implements IResourseService {

	
	
	// Facke HR List
		List<Resourse> list = List.of(
			new Resourse(1L,"robi@gmail.com","Robi","IT",1000L),
			new Resourse(2L,"sobi@gmail.com","sobi","Testing",2000L),
			new Resourse(3L,"jobi@gmail.com","jobi","IT",3000L),
			new Resourse(4L,"kobi@gmail.com","kobi","famer",4000L),
			new Resourse(5L,"mobi@gmail.com","mobi","Painter",5000L),
			new Resourse(6L,"vobi@gmail.com","vobi","Artist",6000L),						
			new Resourse(7L,"yobi@gmail.com","yobi","driver",7000L),
			new Resourse(8L,"eobi@gmail.com","eobi","Manager",8000L),
			new Resourse(9L,"wobi@gmail.com","wobi","clerk",9000L),				
			new Resourse(10L,"john@gmail.com","john","Testing",10000L));


	
	
		@Override
		public List<Resourse> getResourse(Long userID) {
			
			return list.stream().filter(resourse -> resourse.getUserID().equals(userID)).collect(Collectors.toList());
			
		}

	

	

}
