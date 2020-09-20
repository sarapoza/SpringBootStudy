package com.sarapoza.bookstoremanager.utils;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class MapAuthors {
	
	public  Map<Integer, String>  ListAuthors(){
		
		Map<Integer, String> author = new HashMap<Integer, String>();

		author.put(null,"Allen Wood");
		author.put(null, "Michael Duque");
		author.put(null, "Victor Vieira");
		author.put(null, "Michael Duque");
		author.put(null, "Sam Sasser");
		author.put(null, "Judson Cornwall");
		author.put(null, "Benny Hinn");
		author.put(null, "J. K. Rowling");
		author.put(null, "Augusto Cury");
		author.put(null, "Dan Brown");
		author.put(null, "Fernando Pessoa");
		author.put(null, "Gustavo Cerbasi");
		author.put(null, "Geroge R. R. Martin");
		author.put(null, "Camões");
		author.put(null, "Ziraldo");
		author.put(null, "Michael Duque");
		author.put(null, "C. S Lewis");
		author.put(null, "Cecília Meireles");
		author.put(null, "Clarice Lispector");
		author.put(null, "Cora Coralina");
		return author;
			
		}
	}
