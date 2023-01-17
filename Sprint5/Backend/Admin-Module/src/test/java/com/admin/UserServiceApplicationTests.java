package com.admin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.admin.entity.Compensation;
import com.admin.entity.User;
import com.admin.models.Role;
import com.admin.repository.CompensationRepository;
import com.admin.repository.UserRepository;
import com.admin.services.ICompensationService;
import com.admin.services.IUserService;

@SpringBootTest
class UserServiceApplicationTests {
	
	@Autowired
	private IUserService userservice;
	@MockBean
	private UserRepository userrepo;
	
	@Autowired
	private ICompensationService compservice;
	@MockBean
	private CompensationRepository comprepo;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void createuserTest() {
	User userObj = new User(1L,"selu","Selvina","kiran","selu@2022",Role.COMPENSATION_USER,LocalDateTime.now(),"chennai","Engineer","IT");
	when(this.userrepo.save(userObj)).thenReturn(userObj);
	assertEquals(userObj,userservice.createuser(userObj));
	}
	
	@Test
	public void getAllUserTest() {
	User userObj1 = new User(2L,"selu","Selvina","kiran","selu@2022",Role.COMPENSATION_USER,LocalDateTime.now(),"chennai","Engineer","IT");
	User userObj2 = new User(3L,"selu","Selvina","kiran","selu@2022",Role.COMPENSATION_USER,LocalDateTime.now(),"chennai","Engineer","IT");
	User userObj3 = new User(4L,"selu","Selvina","kiran","selu@2022",Role.COMPENSATION_USER,LocalDateTime.now(),"chennai","Engineer","IT");
	User userObj4 = new User(1L,"selu","Selvina","kiran","selu@2022",Role.COMPENSATION_USER,LocalDateTime.now(),"chennai","Engineer","IT");
	List<User> listofusers = List.of(userObj1,userObj2,userObj3,userObj4);
	when(this.userrepo.findAll()).thenReturn(listofusers);
	assertEquals(4,userservice.getAllUser().size());
		
	}
	
	@Test
	public void signupTest() {
	User userObj = new User(1L,"selu","Selvina","kiran","selu@2022",Role.ADMIN,LocalDateTime.now(),"chennai","Engineer","IT");
	when(this.userrepo.save(userObj)).thenReturn(userObj);
	assertEquals(userObj,userservice.signup(userObj));
	}
	
	@Test
	public void getUserByNameTest() {
		User userObj = new User(2L,"selu","Selvina","kiran","selu@2022",Role.ADMIN,LocalDateTime.now(),"chennai","Engineer","IT");
		String user ="selu";
		when(this.userrepo.findByUsername(user)).thenReturn(userObj);
		assertEquals(userObj,userrepo.findByUsername(user));
	}
	
	@Test
	public void createcompensationTest() {
	Compensation compObj = new Compensation(1L,"Harsh","Purecommission",new Date(2022,01,18),new Date(2022,01,19),"volume","20");
	when(this.comprepo.save(compObj)).thenReturn(compObj);
	assertEquals(compObj,compservice.createcompensation(compObj));
	}
	
	
	@Test
	public void getAllCompensationTest() {
	Compensation compObj1 = new Compensation(1L,"Harsh","Purecommission",new Date(2022,01,18),new Date(2022,01,19),"volume","20");
	Compensation compObj2 = new Compensation(1L,"Harsh","Purecommission",new Date(2022,01,18),new Date(2022,01,19),"volume","20");
	Compensation compObj3 = new Compensation(1L,"Harsh","Purecommission",new Date(2022,01,18),new Date(2022,01,19),"volume","20");
	Compensation compObj4 = new Compensation(1L,"Harsh","Purecommission",new Date(2022,01,18),new Date(2022,01,19),"volume","20");
		
	List<Compensation> listofcomp = List.of(compObj1,compObj2,compObj3,compObj4);
	when(this.comprepo.findAll()).thenReturn(listofcomp);
	assertEquals(4,compservice.getAllCompensation().size());
		
	}
	

}
