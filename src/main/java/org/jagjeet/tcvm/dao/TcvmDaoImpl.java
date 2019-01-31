package org.jagjeet.tcvm.dao;

import javax.persistence.EntityManager;

import org.jagjeet.tcvm.model.Coffee;
import org.jagjeet.tcvm.model.Tea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Jagjeet
 *
 */
@Repository
public class TcvmDaoImpl implements TcvmDao {

	/**
	 * 
	 */
	@Autowired
	org.hibernate.SessionFactory sessionFactory;

	/**
	 * @return
	 */
	private EntityManager getEntityManager() {
		return sessionFactory.getCurrentSession().getEntityManagerFactory().createEntityManager();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.tcvm.dao.TcvmDao#createTea(org.jagjeet.tcvm.model.Tea)
	 */
	@Override
	public int createTea(Tea tea) {
		return (int) sessionFactory.getCurrentSession().save(tea);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.tcvm.dao.TcvmDao#createCoffee(org.jagjeet.tcvm.model.Coffee)
	 */
	@Override
	public int createCoffee(Coffee coffee) {
		return (int) sessionFactory.getCurrentSession().save(coffee);
	}

}
