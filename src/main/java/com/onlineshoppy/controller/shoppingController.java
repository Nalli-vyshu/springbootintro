package com.onlineshoppy.controller;

import java.util.List;

import com.onlineshoppy.model.laptop;
import com.onlineshoppy.service.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class shoppingController {
	
	shoppingService service=new shoppingService();
	
	@RequestMapping(method=RequestMethod.GET,value="/laptops")
	public List<laptop> getAlllaptops() {
		return service.getAllLaptops();
		
	}
	
	
	@RequestMapping(method=RequestMethod.GET,value="/laptops/(id)")
	public String getLaptop() {
	  return "will display specified laptop";
}
	@RequestMapping(method=RequestMethod.POST,value="/laptops")
	public String addLaptop() {
		return "one laptop added";
	}
	@RequestMapping(method=RequestMethod.PUT,value="/laptops/(id)")
	public String updateLaptop() {
		return "one laptop updated";
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/laptops/(id)")
	public String deleteLaptop() {
		return "one laptop deleted";
	}
}


