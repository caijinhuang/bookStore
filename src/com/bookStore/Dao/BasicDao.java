package com.bookStore.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * @author Caijh
 * 2017年5月21日 下午2:14:56
 * dao基类，用于获取sessionFactory;
 */
public class BasicDao {
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
}
