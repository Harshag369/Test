package edu.jsp.btm.BasicsOfSpringBoot1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoController {
	@GetMapping("/getmessage")
	public String getMessage() {
		return "Hi";
	}
	

}
