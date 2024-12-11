package com.salespoint.www.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/user")
public class Starter {
	@GetMapping({"/",""})
	public String getMethodName() {
		return new String("@");
	}
	
}
