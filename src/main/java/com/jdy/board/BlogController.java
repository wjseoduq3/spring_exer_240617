package com.jdy.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jdy.blog.dto.*;
import org.springframework.*;

@Controller
public class BlogController {

	@RequestMapping(value = "/write")
	public String write() {
		return "write";
	}
	
	@RequestMapping(value = "/writeOk", method = RequestMethod.GET)
	// public String writeOk(BlogDto blogDto, Model model) {
	public String writeOk(@ModelAttribute("bdto") BlogDto blogDto, Model model) {
	//	model.addAttribute("blogdto", blogDto);		
		return "writeOk";
	}
	
	@RequestMapping(value = "/writeOk", method = RequestMethod.POST)
	public String writeOk() {
		System.out.println("POST 방식 실행");	
		return "writeOk";
	}
	
}
