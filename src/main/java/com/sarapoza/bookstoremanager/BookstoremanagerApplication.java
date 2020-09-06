package com.sarapoza.bookstoremanager;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class BookstoremanagerApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(BookstoremanagerApplication.class, args);
	}
}
