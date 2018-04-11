package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alex Ege
 */
@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String index(Model model) {

		model.addAttribute("name", "World!");

		return "greeting";
	}
}
