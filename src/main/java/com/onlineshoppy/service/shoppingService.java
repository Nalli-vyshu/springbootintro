package com.onlineshoppy.service;

import java.util.*;
import java.util.List;
import com.onlineshoppy.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
public class shoppingService {
	public List<laptop> laptoplist= new ArrayList<>(Arrays.asList(
			
			                        new laptop(101,"Asus Tuf Gaming","i5",5600),
			                        new laptop(102,"Lenova ideapad 330","i5",420),
			                        new laptop(103,"Acer Predator","i7",72000),
			                        new laptop(104,"MSI gaming duo","i5",5200)
			                                                                    ));
	private laptop lap;

			public List<laptop> getAllLaptops() {
				return laptoplist;
			}
		public laptop getlaptop(int id) {
			return laptoplist.stream().filter(lap-> lap.getLaptopId()==id).findFirst().get();
		}
		public String addLaptop(laptop l1) {
			laptoplist.add(l1);
			return "sucessfully added";
			
		}
		public void updateLaptop(int id,laptop l2) {
			int i=0;
			for(i=0;i<laptoplist.size ();i++) {
				 laptop lap=laptoplist.get(i);
				 
				 if(lap.getLaptopId()==id) {
					 laptoplist.set(i, l2);
					 
		
				 }
			}
		}
		
		public void deleteLaptop(int id) {
			laptoplist.removeIf(lap->lap.getLaptopId()==id);
		}
	}



	
