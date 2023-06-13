package com.org.Desialization;

import com.fasterxml.jackson.annotation.JsonAlias;

public class JsonAliasPojo {
	@JsonAlias({"EmployeeID","EmpID","empid"})
	private int id;
	private String name;
	private String email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
