package com.samane.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long contact_id;
	private String name;
	private int tellnumber;
	@ManyToOne
	private PhoneBook phoneBook;

	public Contact() {
	}

	public Contact(String name, int tellnumber) {
		this.name = name;
		this.tellnumber = tellnumber;
	}

	public long getContact_id() {
		return contact_id;
	}

	public void setContact_id(long contact_id) {
		this.contact_id = contact_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTellnumber() {
		return tellnumber;
	}

	public void setTellnumber(int tellnumber) {
		this.tellnumber = tellnumber;
	}

	public PhoneBook getPhoneBook() {
		return phoneBook;
	}

	public void setPhoneBook(PhoneBook phoneBook) {
		this.phoneBook = phoneBook;
	}

}
