package com.samane.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

@Entity(name="PHONEBOOK")
public class PhoneBook {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String ownerName;
	@OneToMany(mappedBy="phoneBook",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	List<Contact> listContact=new ArrayList<>();
	@ManyToMany(mappedBy="phoneBooks",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	Set<User>  users=new HashSet<>();

	public PhoneBook() {
		
	}

	public PhoneBook(String ownerName) {
		
		this.ownerName = ownerName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void addContact(Contact c) {
		listContact.add(c);
	}
public void addUser(User u) {
	users.add(u);
}
	public List<Contact> getListContact() {
		return listContact;
	}
	

}
