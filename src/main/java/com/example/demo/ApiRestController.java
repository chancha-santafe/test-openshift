package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiRestController {

	@GetMapping(value = "/test")
	public String prueba() {
		return String.valueOf("Testing");
	}
	
}
