package com.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringHelloWorld {
	
	
	@GetMapping("/print")
	public String hi()
	{
		return "<h2>Hello world!!!</h2>";
	}

}
