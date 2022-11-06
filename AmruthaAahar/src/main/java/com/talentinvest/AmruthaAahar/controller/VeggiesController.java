package com.talentinvest.AmruthaAahar.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.talentinvest.AmruthaAahar.model.Veggies;
import com.talentinvest.AmruthaAahar.service.VeggiesService;

@Controller
public class VeggiesController {
	
	@Autowired
	private VeggiesService veggiesService;

	static ArrayList<Veggies> veggiesList = new ArrayList<>();
	
	@RequestMapping ("/veggies")
	public ModelAndView VeggiesPage() {
		ModelAndView mav = new ModelAndView("veggies");
		

//		Veggies v1 = new Veggies(1,"Potato",35);
//		Veggies v2= new Veggies(2,"Tomato",25);
//		Veggies v3 = new Veggies(3,"Onion",40);
//		Veggies v4 = new Veggies(4,"Carrot",35);
//		Veggies v5 = new Veggies(5,"Brinjal",20);
//		
//		veggiesList.add(v1);
//		veggiesList.add(v2);
//		veggiesList.add(v3);
//		veggiesList.add(v4);
//		veggiesList.add(v5);
		
		List<Veggies> veggiesList = veggiesService.getAllVeggies();
		
		mav.setViewName("veggies");
		mav.addObject(veggiesList);
		
		return mav;
		
	}
	
	@RequestMapping("/createVeggies")
	public ModelAndView HomePage() {
		ModelAndView mav = new ModelAndView("createVeggies");
		
		return mav;
	}
	
	
	@RequestMapping("/deleteVeggies/{vID}")
	public ModelAndView deleteVeggies(@PathVariable("vID") int vID) {
		ModelAndView mav = new ModelAndView();
		veggiesService.deleteVegie(vID);
		List<Veggies> veggiesList = veggiesService.getAllVeggies();
		mav.setViewName("veggies");
		mav.addObject(veggiesList);
		return mav;
	}

}
