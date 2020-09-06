package com.sarapoza.bookstoremanager.utils;

import java.io.Serializable;
import org.springframework.stereotype.Service;

@Service
public class Counter implements Serializable {
	private static final long serialVersionUID = 1L;

	private long id;
	private int number;

	public Counter() {
	}

	public Counter(long id, int number) {
		this.id = id;
		this.number = number;
	}

	public long getId() {
		return id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int[] inputNumber(int num) {
		int [] recebeNum = new int[10];
		for (int i = 0; i < 10; i++) {
			recebeNum[i] = num;
		}
		return recebeNum;
		
	}
}
