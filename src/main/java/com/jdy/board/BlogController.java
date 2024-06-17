package com.jdy.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.jdy.blog.dto.*;
import org.springframework.*;

@Controller
public class BlogController {

	@RequestMapping(value = "/write")
	public String write() {
		return "write";
	}
	
	@RequestMapping(value = "/writeOk")
	public String writeOk(BlogDto blogDto, Model model) {
		
		model.addAttribute("blogdto", blogDto);		
		
		return "writeOk";
	}
}
