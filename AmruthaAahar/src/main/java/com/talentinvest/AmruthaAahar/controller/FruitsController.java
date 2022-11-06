package com.talentinvest.AmruthaAahar.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.talentinvest.AmruthaAahar.model.Fruits;
import com.talentinvest.AmruthaAahar.service.FruitsService;

@Controller
public class FruitsController {
	
	@Autowired
	private FruitsService fruitsService;

	
	@RequestMapping ("/fruits")
	public ModelAndView VeggiesPage() {
		ModelAndView mav = new ModelAndView("fruits");
		

//		Fruits f1 = new Fruits(1,"Mango",100);
//		Fruits f2= new Fruits(2,"Guava",60);
//		Fruits f3 = new Fruits(3,"Pappaya",80);
//		Fruits f4 = new Fruits(4,"Pomegranate",150);
//		Fruits f5 = new Fruits(5,"CustardApple",120);
//		    
//		fruitsList.add(f1);
//		fruitsList.add(f2);
//		fruitsList.add(f3);
//		fruitsList.add(f4);
//		fruitsList.add(f5);
		
		List<Fruits> fruitsList = fruitsService.getAllFruits();
		
		mav.setViewName("fruits");
		mav.addObject(fruitsList);
		
		return mav;
		
	}
	
	@RequestMapping("/createFruits")
	public ModelAndView HomePage() {
		ModelAndView mav = new ModelAndView("createFruits");
		
		return mav;
	}
	
	
	@RequestMapping("/deleteFruits/{fID}")
	public ModelAndView deleteFruits(@PathVariable("fID") int fID) {
		ModelAndView mav = new ModelAndView();
		fruitsService.deleteFruit(fID);
		List<Fruits> fruitsList = fruitsService.getAllFruits();
		mav.setViewName("fruits");
		mav.addObject(fruitsList);
		return mav;
	}

}

