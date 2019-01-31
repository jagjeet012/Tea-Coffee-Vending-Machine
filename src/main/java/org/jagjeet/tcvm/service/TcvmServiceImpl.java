package org.jagjeet.tcvm.service;

import org.jagjeet.tcvm.dao.TcvmDao;
import org.jagjeet.tcvm.model.Coffee;
import org.jagjeet.tcvm.model.Tea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Jagjeet
 *
 */
@Service
public class TcvmServiceImpl implements TcvmService {

	/**
	 * 
	 */
	@Autowired
	TcvmDao tcvmDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jagjeet.tcvm.service.TcvmService#createTea(org.jagjeet.tcvm.model.Tea)
	 */
	@Override
	@Transactional
	public int createTea(Tea tea) {
		return tcvmDao.createTea(tea);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jagjeet.tcvm.service.TcvmService#createCoffee(org.jagjeet.tcvm.model.
	 * Coffee)
	 */
	@Override
	@Transactional
	public int createCoffee(Coffee coffee) {
		return tcvmDao.createCoffee(coffee);
	}

}
