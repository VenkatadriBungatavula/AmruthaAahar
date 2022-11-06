package com.talentinvest.AmruthaAahar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.talentinvest.AmruthaAahar.model.Fruits;

@Repository
public interface FruitsRepo extends JpaRepository<Fruits, Integer> {

}
