package com.cos.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	// http://localhost:8080/
	// http://localhost:8080
	@GetMapping({"","/"})
	public @ResponseBody String index() {
		
		// Viewresolver -> @ResponseBody가 있다면 문자열을 전송한다 / @ResponseBody가 없다면 파일명을 찾아서 전송한다.
		return "hello"; 
	}
	
	@GetMapping({"/user"})
	public @ResponseBody String user() {
		
		return "User";
	}
}

