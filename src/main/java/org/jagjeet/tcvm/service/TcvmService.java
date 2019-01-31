package org.jagjeet.tcvm.service;

import org.jagjeet.tcvm.model.Coffee;
import org.jagjeet.tcvm.model.Tea;

/**
 * @author Jagjeet
 *
 */
public interface TcvmService {

	/**
	 * @param tea
	 * @return
	 */
	public int createTea(Tea tea);

	/**
	 * @param coffee
	 * @return
	 */
	public int createCoffee(Coffee coffee);

}
