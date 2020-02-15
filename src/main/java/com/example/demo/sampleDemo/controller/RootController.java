package com.example.demo.sampleDemo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RootController {
	
	@GetMapping("/")
	public String redirectRoot(Model model) {
		String message="Welcome Again";
		model.addAttribute("welcome_message", message);
		return "root";
	}
	
	@GetMapping("/home")
	public String redirectHome(Model model) {
		List<String> tasks = Arrays.asList("a", "b", "c", "d", "e", "f", "g");
		String message="Welcome Again";
		model.addAttribute("tasks",tasks);
		model.addAttribute("message",message);
		return "home";
	}

}
