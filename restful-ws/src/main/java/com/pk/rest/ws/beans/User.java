package com.pk.rest.ws.beans;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class User {
	private int id;

	@NotNull
	@Size(min = 2, message = "Name should have at least 2 characters")
	private String name;

	@NotNull
	@Past
	private Date birthDate;

	User() {
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, Date date) {
		this.id = id;
		this.name = name;
		this.birthDate = date;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

}
