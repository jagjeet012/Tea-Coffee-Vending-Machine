package org.jagjeet.tcvm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

/**
 * @author Jagjeet
 *
 */
@Entity
@Component
public class Tea {

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teaId;
	private int sugar;
	private int water;
	private int milk;
	private int teaLeaves;

	public int getTeaId() {
		return teaId;
	}

	public void setTeaId(int teaId) {
		this.teaId = teaId;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public int getMilk() {
		return milk;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}

	public int getTeaLeaves() {
		return teaLeaves;
	}

	public void setTeaLeaves(int teaLeaves) {
		this.teaLeaves = teaLeaves;
	}

}
