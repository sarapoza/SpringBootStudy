package com.sarapoza.bookstoremanager.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sarapoza.bookstoremanager.utils.Counter;

@RestController
public class PrincipalController {

	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/counter")
	public int[] counter(@RequestParam(value = "numero", defaultValue = "0") int num) {
		Counter countera = new Counter(counter.incrementAndGet(), num);
		return countera.inputNumber();
	}

}
