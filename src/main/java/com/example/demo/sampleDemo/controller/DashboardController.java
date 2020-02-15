package com.example.demo.sampleDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class DashboardController {
	@GetMapping("")
	public String renderDashboard() {
		return "dashboard";
	}

}
