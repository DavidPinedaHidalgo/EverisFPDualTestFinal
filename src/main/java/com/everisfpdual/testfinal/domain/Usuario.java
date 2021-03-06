package com.everisfpdual.testfinal.domain;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

import javax.persistence.GeneratedValue;

@Entity
@Table(name = "users")
public class Usuario implements Serializable{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(name="email", unique=true)
	@NonNull
	private String email;
	
	@Column(name="firstname")
	@NonNull
	private String firstname;
	
	@Column(name="lastname")
	@NonNull
	private String lastname;
	
	@Column(name="password")
	@NonNull
	private String password;
	
	private static final long serialVersionUID = 1L;

	public Usuario(  String email, String firstname, String lastname,String password) {
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
	}

	public Usuario() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	//Enunciado: Desarrolla la entidad para obtener los datos de BBDD
	
	
	
}
