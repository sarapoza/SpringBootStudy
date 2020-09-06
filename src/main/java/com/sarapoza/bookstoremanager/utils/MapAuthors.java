package com.sarapoza.bookstoremanager.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Component;

@Component
public class MapAuthors {
	
	public  Map<Integer, String>  ListAuthors(){
		
		Map<Integer, String> author = new HashMap<Integer, String>();

		author.put(1,"Allen Wood");
		author.put(2, "Michael Duque");
		author.put(3, "Victor Vieira");
		author.put(4, "Michael Duque");
		author.put(5, "Sam Sasser");
		author.put(6, "Judson Cornwall");
		author.put(7, "Benny Hinn");
		author.put(8, "J. K. Rowling");
		author.put(9, "Augusto Cury");
		author.put(10, "Dan Brown");
		author.put(11, "Fernando Pessoa");
		author.put(12, "Gustavo Cerbasi");
		author.put(13, "Geroge R. R. Martin");
		author.put(14, "Camões");
		author.put(15, "Ziraldo");
		author.put(16, "Michael Duque");
		author.put(17, "C. S Lewis");
		author.put(18, "Cecília Meireles");
		author.put(19, "Clarice Lispector");
		author.put(20, "Cora Coralina");
		return author;
			
		}
	}
