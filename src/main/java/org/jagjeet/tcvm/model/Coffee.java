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
public class Coffee {

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int coffeeId;
	private int sugar;
	private int water;
	private int milk;
	private int coffeePowder;

	public int getCoffeeId() {
		return coffeeId;
	}

	public void setCoffeeId(int coffeeId) {
		this.coffeeId = coffeeId;
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

	public int getCoffeePowder() {
		return coffeePowder;
	}

	public void setCoffeePowder(int coffeePowder) {
		this.coffeePowder = coffeePowder;
	}

}
