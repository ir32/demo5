package com.example5.demo5;

import com.example5.demo5.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo5Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Demo5Application.class, args);
		
		UserService userService = context.getBean(UserService.class);
		userService.insertUser("asdasd", "sasA@gmail1.com");
	}

}
