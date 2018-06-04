package com.samane.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import com.samane.model.Contact;
import com.samane.model.PhoneBook;

import hibernateUtil.HibernateUtil;

public class PhoneBookDao {
	// 1- Create

		public boolean createPhoneBook(PhoneBook ph) {
			boolean res = false;
			Session session = HibernateUtil.openSession();
			Transaction tx = null;
			try {
				tx = session.getTransaction();
				tx.begin();

				session.persist(ph);

				tx.commit();
				res = true;
			} catch (Exception ex) {

				tx.rollback();

			} finally {
				session.close();
			}

			return res;

		}
		public PhoneBook getPhoneBookById(long id) {
			PhoneBook p = null;
			Session session = HibernateUtil.openSession();
			Transaction tx = null;
			try {
				tx = session.getTransaction();
				tx.begin();

				p=session.get(PhoneBook.class, id);

				tx.commit();
				
			} catch (Exception ex) {

				tx.rollback();

			} finally {
				session.close();
			}

			return p;

		}
		public boolean updatePhoneBook(PhoneBook p ){
			boolean res = false;
			Session session = HibernateUtil.openSession();
			Transaction tx = null;
			try {
				tx = session.getTransaction();
				tx.begin();

				session.update(p);

				tx.commit();
				res = true;
			} catch (Exception ex) {

				tx.rollback();

			} finally {
				session.close();
			}

			return res;

		}
		public boolean deletePhoneBook(PhoneBook p) {
			boolean res = false;
			Session session = HibernateUtil.openSession();
			Transaction tx = null;
			try {
				tx = session.getTransaction();
				tx.begin();

				session.delete(p);

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
