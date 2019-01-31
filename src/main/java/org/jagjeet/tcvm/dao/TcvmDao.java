package org.jagjeet.tcvm.dao;

import org.jagjeet.tcvm.model.Coffee;
import org.jagjeet.tcvm.model.Tea;

/**
 * @author Jagjeet
 *
 */
public interface TcvmDao {

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
