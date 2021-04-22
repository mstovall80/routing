package com.stovall.routing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CodeController {
	 @RequestMapping("/coding")
	    public String index(){
	      return "Hello Coding Dojo!";
	 }
	 
	 @RequestMapping("/coding/python")
		 public String python() {
			 return "Django was awesome!";
		 }
	@RequestMapping("/coding/java")
		public String java() {
			return "Spring is better!";
		}
}
