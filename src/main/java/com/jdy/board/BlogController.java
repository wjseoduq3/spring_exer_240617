package com.jdy.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jdy.blog.dto.*;

import javax.servlet.http.HttpServletRequest;

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
	
	@RequestMapping(value = "/keyword")
	public String keyword() {
		return "keyword";
	}
	
	@RequestMapping(value = "/keywordOk")
	public String keywordOk(HttpServletRequest request) {
		String keyword = request.getParameter("keyword");
		
			if(keyword.equals("abc")) {
				return "redirect:keywordGood";
				// return "keywordGood";
			} else {
				return "redirect:keywordBad";
				// return "keywordGood";
			}
		}
	
	@RequestMapping(value = "/keywordBad")
	public String keywordBad(Model model) {
		model.addAttribute("keyword","xxx");
		return "keywordBad";
	}
		
	@RequestMapping(value = "/keywordGood")
	public String keywordGood(Model model) {
		System.out.println("redirect 실행됨.");
		return "keywordGood";
	}
	
	
}
