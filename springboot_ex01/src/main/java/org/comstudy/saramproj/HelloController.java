package org.comstudy.saramproj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/") 
//	/ 뒤에 아무것도 안적혀있으니 port 8080 으로 들어가면 Hello world 가 보임 !
	
	
	public String hello() {
		return "Hello world";
	}
}
