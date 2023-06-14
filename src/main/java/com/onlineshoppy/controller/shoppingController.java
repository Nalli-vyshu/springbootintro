package com.onlineshoppy.controller;

import java.util.List;

import com.onlineshoppy.model.laptop;
import com.onlineshoppy.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class shoppingController {
	@Autowired
	shoppingService service;
	
	@RequestMapping(method=RequestMethod.GET,value="/laptops")
	public List<laptop> getAlllaptops() {
		return service.getAllLaptops();
		
	}
	
	
	@RequestMapping(method=RequestMethod.GET,value="/laptops/(id)")
	public laptop getLaptop(@PathVariable int id) {
		return service.getlaptop(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/laptops")
	public String addLaptop(@RequestBody laptop l1) {
		return service.addLaptop(l1);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/laptops/(id)")
	public void updateLaptop(@RequestBody laptop l2,@PathVariable int id) {
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/laptops/(id)")
	public void deleteLaptop(@PathVariable int id) {
		service.deleteLaptop(id);
	}
}


