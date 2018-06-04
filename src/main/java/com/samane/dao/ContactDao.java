package com.samane.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.samane.model.Contact;

import hibernateUtil.HibernateUtil;

public class ContactDao {

	// 1- Create

	public boolean createUser(Contact c) {
		boolean res = false;
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();

			session.persist(c);

			tx.commit();
			res = true;
		} catch (Exception ex) {

			tx.rollback();

		} finally {
			session.close();
		}

		return res;

	}

}
