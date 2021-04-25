package com.example.exemple1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reading")
public class ReadingBooksController {
	
	@RequestMapping("/standard")
	public String standardBooks() {
		
		return "standard";
	}

}
