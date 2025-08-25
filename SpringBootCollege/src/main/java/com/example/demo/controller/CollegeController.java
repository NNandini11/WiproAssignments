package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.College;
import com.example.demo.services.CollegeService;

@Controller
public class CollegeController {
	
@Autowired
	private CollegeService cserv;
@GetMapping("/")
public String viewHome(Model model) {
	model.addAttribute("list",cserv.getAll());
	model.addAttribute("college", new College());
	return "index";
	
}
@PostMapping("/save")
public String saveCollege(@ModelAttribute College c) {
	cserv.save(c);
	return "redirect:/"; 
	
}
}
