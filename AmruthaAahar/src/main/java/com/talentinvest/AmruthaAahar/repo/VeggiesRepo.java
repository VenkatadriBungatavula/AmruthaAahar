package com.talentinvest.AmruthaAahar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.talentinvest.AmruthaAahar.model.Veggies;

@Repository
public interface VeggiesRepo extends JpaRepository<Veggies, Integer>{

}
