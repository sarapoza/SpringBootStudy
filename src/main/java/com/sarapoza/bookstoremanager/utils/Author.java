package com.sarapoza.bookstoremanager.utils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Author implements IAuthor{

	@Autowired
	MapAuthors author;
	
	public Map<Integer, String> ReturnAuthor(int key) {

		 Map<Integer, String> lista  = author.ListAuthors();
		 Map<Integer, String> listaAuthorOrdenada = new HashMap<Integer, String>();
		
		for (int i : lista.keySet()) {
			if(listaAuthorOrdenada.size() < key) {
			listaAuthorOrdenada.put(i,lista.get(i));
			}
		}
		return listaAuthorOrdenada;
	}
	
}
