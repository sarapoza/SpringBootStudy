package com.sarapoza.bookstoremanager.utils;

import java.util.List;
import java.util.Map;

public interface IAuthor {
	
	public Map<Integer, String> ReturnAuthor(int key);
	
	public List RetornaAutorBd(int name);

}
