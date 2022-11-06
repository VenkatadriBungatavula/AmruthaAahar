
package com.talentinvest.AmruthaAahar.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Veggies")
public class Veggies {

	@Id
	private int vID;
	private String vName;
	private int vCost;
	
	public Veggies() {
		
	}

	public Veggies(int vID, String vName, int vCost) {
		super();
		this.vID = vID;
		this.vName = vName;
		this.vCost = vCost;
	}

	public int getvID() {
		return vID;
	}

	public void setvID(int vID) {
		this.vID = vID;
	}

	public String getvName() {
		return vName;
	}

	public void setvName(String vName) {
		this.vName = vName;
	}

	public int getvCost() {
		return vCost;
	}

	public void setvCost(int vCost) {
		this.vCost = vCost;
	}

	@Override
	public String toString() {
		return "Veggies [vID=" + vID + ", vName=" + vName + ", vCost=" + vCost + "]";
	}
	
	
}
