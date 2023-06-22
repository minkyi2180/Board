package com.mysite.prac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@GetMapping("/prac")
	@ResponseBody
	public String index() {
		return "메뚜기월드에 오신걸 환영합니다";
	}
	
	@GetMapping("/")
	public String root() {
		return "redirect:/question/list";
	}
}
