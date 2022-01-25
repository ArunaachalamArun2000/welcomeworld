package com.example.welcomedemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value = "/")
	public static String Welcome() {
		return "Welcome to the world";

	}

}
