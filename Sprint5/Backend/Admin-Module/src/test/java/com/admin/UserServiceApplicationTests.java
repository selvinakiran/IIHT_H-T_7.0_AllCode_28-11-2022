package com.admin;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.admin.entity.User;
import com.admin.models.Role;
import com.admin.repository.UserRepository;
import com.admin.services.IUserService;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UserServiceApplicationTests {
	
	@Autowired
	private IUserService userservice;
	@MockBean
	private UserRepository userrepo;

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
	
	

}
