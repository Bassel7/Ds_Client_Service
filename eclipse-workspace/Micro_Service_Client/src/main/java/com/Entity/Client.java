package com.Entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Client implements Serializable {

	@Id
	private String Code;
	private String Nom;
	private String Prenom;
	private Date DateNaissance;
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public Date getDateNaissance() {
		return DateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		DateNaissance = dateNaissance;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String code, String nom, String prenom, Date dateNaissance) {
		super();
		Code = code;
		Nom = nom;
		Prenom = prenom;
		DateNaissance = dateNaissance;
	}
	
	
	
}
