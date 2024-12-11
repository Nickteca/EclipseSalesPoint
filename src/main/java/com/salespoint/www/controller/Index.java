package com.salespoint.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Index {
	@GetMapping({"/",""})
	public String sucursal() {
		return new String("sucursal");
	}
	
}
