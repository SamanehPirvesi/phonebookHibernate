package com.samane.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String via;
	private int num;
	public Address(String via, int num) {
		
		this.via = via;
		this.num = num;
	}
	public Address() {
		
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	

}
