package com.example.demo.Controller;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiControllers {
	@RequestMapping("/")
	
	public String show()
	{
		return "Welcome To Spring Boot!"
;	}

}