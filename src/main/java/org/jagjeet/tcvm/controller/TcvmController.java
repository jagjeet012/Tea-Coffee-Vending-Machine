package org.jagjeet.tcvm.controller;

import java.util.Map;

import org.jagjeet.tcvm.container.MaterialContainer;
import org.jagjeet.tcvm.model.Coffee;
import org.jagjeet.tcvm.model.Tea;
import org.jagjeet.tcvm.service.TcvmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Jagjeet
 *
 */
@Controller
public class TcvmController {

	/**
	 * 
	 */
	@Autowired
	private TcvmService tcvmService;

	/**
	 * 
	 */
	@Autowired
	private Tea tea;

	/**
	 * 
	 */
	@Autowired
	private Coffee coffee;

	/**
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "index";
	}

	/**
	 * @return
	 */
	@RequestMapping(value = "/vender", method = RequestMethod.GET)
	public String showVenderForm() {
		return "vender";
	}

	/**
	 * @return
	 */
	@RequestMapping(value = "/createTea", method = RequestMethod.POST)
	public String showTeaForm() {
		return "tea";
	}

	/**
	 * @return
	 */
	@RequestMapping(value = "/createCoffee", method = RequestMethod.POST)
	public String showCoffeeForm() {
		return "coffee";
	}

	/**
	 * @param noOfTea
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/makeTea", method = RequestMethod.POST)
	public String createTea(@RequestParam(value = "noOfTea", required = true) Integer noOfTea, Map model) {

		if ((MaterialContainer.sugarQuantity - noOfTea * 20) < 0
				|| (MaterialContainer.waterQuantity - noOfTea * 50) < 0
				|| (MaterialContainer.milkQuantity - noOfTea * 50) < 0
				|| (MaterialContainer.teaLeavesQuantity - noOfTea * 10) < 0) {
			model.put("emptyTea", "Sorry, your order can't be delivered<br>The Material is out of stocks");

			return "tea";

		} else {
			MaterialContainer.sugarQuantity = MaterialContainer.sugarQuantity - noOfTea * 20;
			MaterialContainer.waterQuantity = MaterialContainer.waterQuantity - noOfTea * 50;
			MaterialContainer.milkQuantity = MaterialContainer.milkQuantity - noOfTea * 50;
			MaterialContainer.teaLeavesQuantity = MaterialContainer.teaLeavesQuantity - noOfTea * 10;
		}

		tcvmService.createTea(tea);

		model.put("displayMessage", "Your Tea is ready...<br>Thankyou, Have a nice Day!!");
		model.put("sugar", "Sugar Left in container" + " = " + MaterialContainer.sugarQuantity);
		model.put("water", "water Left in container" + " = " + MaterialContainer.waterQuantity);
		model.put("milk", "milk Left in container" + " = " + MaterialContainer.milkQuantity);
		model.put("teaLeaves", "Tea Leaves Left in container" + " = " + MaterialContainer.teaLeavesQuantity);

		return "tea";
	}

	/**
	 * @param noOfCoffee
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/makeCoffee", method = RequestMethod.POST)
	public String createCoffee(@RequestParam(value = "noOfCoffee", required = true) Integer noOfCoffee, Map model) {

		if ((MaterialContainer.sugarQuantity - noOfCoffee * 20) < 0
				|| (MaterialContainer.waterQuantity - noOfCoffee * 50) < 0
				|| (MaterialContainer.milkQuantity - noOfCoffee * 50) < 0
				|| (MaterialContainer.coffeePowderQuantity - noOfCoffee * 10) < 0) {
			model.put("emptyCoffee", "Sorry, your order can't be delivered<br>The Material is out of stock");

			return "coffee";

		} else {

			MaterialContainer.sugarQuantity = MaterialContainer.sugarQuantity - noOfCoffee * 20;
			MaterialContainer.waterQuantity = MaterialContainer.waterQuantity - noOfCoffee * 50;
			MaterialContainer.milkQuantity = MaterialContainer.milkQuantity - noOfCoffee * 50;
			MaterialContainer.coffeePowderQuantity = MaterialContainer.coffeePowderQuantity - noOfCoffee * 10;
		}

		tcvmService.createCoffee(coffee);

		model.put("displayMessage", "Your Coffee is ready...<br>Thankyou, Have a nice Day!!");
		model.put("sugar", "Sugar Left in container" + " = " + MaterialContainer.sugarQuantity);
		model.put("water", "water Left in container" + " = " + MaterialContainer.waterQuantity);
		model.put("milk", "milk Left in container" + " = " + MaterialContainer.milkQuantity);
		model.put("coffeePowder", "coffee Powder Left in container" + " = " + MaterialContainer.coffeePowderQuantity);

		return "coffee";
	}

}