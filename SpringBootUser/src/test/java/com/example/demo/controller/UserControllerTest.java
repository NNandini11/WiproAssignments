package com.example.demo.controller;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.entities.User;
import com.example.demo.services.UserService;
@WebMvcTest
//Loads only the given class (UserController) into the Spring test context.
@ContextConfiguration(classes = {UserController.class}) // Only load the controller
@Import(org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration.class)
class UserControllerTest {
	
	@Autowired    //fake Http request we use mock mvc
	private MockMvc mockMvc;

	@MockitoBean
	private UserService userv;   //It will create Dummy Object
	
	
	@Test
	@DisplayName("addNewUSerTest")
	void addUserTest() throws Exception {
		
		//creating our own user object
		User u=new User(1L,"nandini","nandini123@gmail.com");
		
		//whenever someone calling userv.addUser i am simply returning that object
		Mockito.when(userv.addUser(Mockito.any())).thenReturn(u);

	    mockMvc.perform(
			   post("/add")    //post is coming from mockmvc
			   .contentType("application/json")
			   .content("""
                  {
                      "name":"nandini",
                       "email":"nandini123@gmail.com"
                  }
                  
			   		"""))
	    .andExpect(status().isOk())
	    .andExpect(jsonPath("$.name").value("nandini"));

	}
}
