package com.talentinvest.AmruthaAahar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talentinvest.AmruthaAahar.model.Veggies;
import com.talentinvest.AmruthaAahar.repo.VeggiesRepo;

@Service
public class VeggiesService {
	
	@Autowired
	private VeggiesRepo veggiesRepo;

	public List<Veggies> getAllVeggies() {
		return veggiesRepo.findAll();
	}

	public void deleteVegie(int vID) {
		veggiesRepo.deleteById(vID);
		
	}

}
