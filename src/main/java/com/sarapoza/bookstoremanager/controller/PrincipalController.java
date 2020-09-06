package com.sarapoza.bookstoremanager.controller;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sarapoza.bookstoremanager.utils.Author;
import com.sarapoza.bookstoremanager.utils.Counter;

@RestController
public class PrincipalController {

	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private Counter countera;
	
	@Autowired
	private Author author;
	
	@RequestMapping("/counter")
	public int[] counter(@RequestParam(value = "numero", defaultValue = "0") int num) {
		return countera.inputNumber(num);
	}
	
	@RequestMapping("/author")
	public Map<Integer, String> ListAuthor(@RequestParam(value = "id", defaultValue = "") int num) {
		return author.ReturnAuthor(num);
	}

}
