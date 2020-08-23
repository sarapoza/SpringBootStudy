package com.sarapoza.bookstoremanager.utils;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;


public class Counter implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int id;
	private int number;
	
	public Counter()  {
	}

	@Autowired
	public Counter(int id, int number) {
		this.id = id;
		this.number = number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}

