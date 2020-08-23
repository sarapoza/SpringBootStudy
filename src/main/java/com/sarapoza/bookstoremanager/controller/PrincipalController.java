package com.sarapoza.bookstoremanager.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarapoza.bookstoremanager.utils.Counter;

@RestController
@RequestMapping(value = "/counter")
public class PrincipalController {
	
	@GetMapping
	public ResponseEntity <Counter> findAll() {
		Counter n = new Counter(1, 1);
		return ResponseEntity.ok().body(n);
	}
		

}
