package com.stovall.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
		 @RequestMapping("/{dojo}")
		    public String dojo(@PathVariable("dojo")String dojo){
		 
		 String output = "";
		 
		 if(dojo.equals("burbank-dojo")) {
			 output ="Burbank Dojo is located in Southern California";
		 }
		 
		 else if (dojo.equals("san_jose")) {
			 output = "SJ dojo is the headquarters";
		 } else {
			 output =  "dojo" + " is awesome";
		 }
		return output;
		 }
	}
