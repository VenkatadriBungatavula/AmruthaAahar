package com.talentinvest.AmruthaAahar.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Fruits")
public class Fruits {

	@Id
	private int fID;
	private String fName;
	private int fCost;
	
	public Fruits() {
		
	}

	public Fruits(int fID, String fName, int fCost) {
		super();
		this.fID = fID;
		this.fName = fName;
		this.fCost = fCost;
	}
	
	public int getfID() {
		return fID;
	}


	public void setfID(int fID) {
		this.fID = fID;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public int getfCost() {
		return fCost;
	}


	public void setfCost(int fCost) {
		this.fCost = fCost;
	}


	@Override
	public String toString() {
		return "Fruits [fID=" + fID + ", fName=" + fName + ", fCost=" + fCost + "]";
	}
	
}
