package com.pozasar.bookstoremanager.entities;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sarapoza.bookstoremanager.utils.IAuthor;
//import javax.persistence.Table;

@Entity
public class AuthorDb {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nomeAutor;

	public AuthorDb() {
	}

	public AuthorDb(Long id, String nomeAutor) {
		this.id = id;
		this.nomeAutor = nomeAutor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	@Override
	public String toString() {
		return "AuthorDb [id=" + id + ", nomeAutor=" + nomeAutor + "]";
	}
	
}

