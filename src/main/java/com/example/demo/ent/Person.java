package com.example.demo.ent;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Person.findAll", query = "SELECT p FROM Person p")
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int cin;

	private String email;

	private String nom;

	private String prenom;

	private String tel;

	public Person() {
	}

	public Person(int cin, String nom, String tel) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.tel = tel;
	}

	public Person(int id, int cin, String nom, String tel) {
		super();
		this.id = id;
		this.cin = cin;
		this.nom = nom;
		this.tel = tel;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCin() {
		return this.cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", cin=" + cin + ", email=" + email + ", nom=" + nom + ", prenom=" + prenom
				+ ", tel=" + tel + "]";
	}

}