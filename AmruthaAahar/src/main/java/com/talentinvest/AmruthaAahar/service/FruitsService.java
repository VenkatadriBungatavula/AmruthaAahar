package com.talentinvest.AmruthaAahar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talentinvest.AmruthaAahar.model.Fruits;
import com.talentinvest.AmruthaAahar.repo.FruitsRepo;

@Service
public class FruitsService {
	
	@Autowired
	private FruitsRepo fruitsRepo;

	public List<Fruits> getAllFruits() {
		return fruitsRepo.findAll();
		
	}

	public void deleteFruit(int fID) {
		fruitsRepo.deleteById(fID);
		
	}

}
