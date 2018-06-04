package com.samane.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.samane.model.User;

import hibernateUtil.HibernateUtil;

public class UserDao {

	// 1- Create

	public boolean createUser(User u) {
		boolean res = false;
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();

			session.persist(u);

			tx.commit();
			res = true;
		} catch (Exception ex) {

			tx.rollback();

		} finally {
			session.close();
		}

		return res;

	}
	// 2- Read

	public User getUserById(long id) {
		User u = null;
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();

			u=session.get(User.class, id);

			tx.commit();
			
		} catch (Exception ex) {

			tx.rollback();

		} finally {
			session.close();
		}

		return u;

	}
	public List<User> getUserByName(String name) {
		List<User> list = null;
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();

			Query query=session.createQuery("from User where name=:var");
			query.setString("var", name);
             list=query.getResultList();
			tx.commit();
			
		} catch (Exception ex) {

			tx.rollback();

		} finally {
			session.close();
		}

		return list;

	}
	// 3- Update

	public boolean updateUser(User u) {
		boolean res = false;
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();

			session.update(u);

			tx.commit();
			res = true;
		} catch (Exception ex) {

			tx.rollback();

		} finally {
			session.close();
		}

		return res;

	}
	@SuppressWarnings("deprecation")
	public boolean updateUserById(long id , String name) {
		boolean res = false;
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();

			Query query=session.createQuery("UPDATE User SET name=:firstname WHERE user_id=:idnumber");
			query.setString("firstname",name);
			query.setLong("idnumber", id);
		query.executeUpdate();
			res = true;
		} catch (Exception ex) {

			tx.rollback();

		} finally {
			session.close();
		}

		return res;

	}
	// 4- Delete

		public boolean deleteUser(User u) {
			boolean res = false;
			Session session = HibernateUtil.openSession();
			Transaction tx = null;
			try {
				tx = session.getTransaction();
				tx.begin();

				session.delete(u);

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
