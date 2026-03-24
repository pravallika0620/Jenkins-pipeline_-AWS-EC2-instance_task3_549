package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class cse_taskcontroller {
	   @GetMapping("/home")
	   public String disk() {
		   return "I am Pravallika_23mh1a0549";
	   }
	   
	   @GetMapping("/cse")
	   public String cse() {
		   return "Creating the Jenkins pipeline and deploying the application on an AWS EC2 instance";
	   }


}
