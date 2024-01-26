package com.example.thymeleaf.controller;

import java.io.File;
import java.io.IOException;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestMainController {

	File file = new File("G:\\Java Projects\\Java Spring\\Dev Project\\music.txt"); //initialize File object and passing path as argument  
	boolean result; 
	
	 @GetMapping("/get") public String home() {
		    return "This is the get request";
		  }
	 

	 @PostMapping("/register")
	 public String submitForm(@ModelAttribute("user") User user) {
	     System.out.println("inside register");
	     
	     try   
	     {  
	     result = file.createNewFile();  //creates a new file  
	     if(result)      // test if successfully created a new file  
	     {  
	     System.out.println("file created "+file.getCanonicalPath()); //returns the path string  
	     }  
	     else  
	     {  
	     System.out.println("File already exist at location: "+file.getCanonicalPath());  
	     }  
	     }   
	     catch (IOException e)   
	     {  
	     e.printStackTrace();    //prints exception if any  
	     }         
	     
	     return "register_success";
	 }
}
