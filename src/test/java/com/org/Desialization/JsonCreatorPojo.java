package com.org.Desialization;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class JsonCreatorPojo {
	private int id;
	private String name;
	private String email;
	
	@JsonCreator
	public JsonCreatorPojo(
			@JsonProperty("EmployeeID")
			int id,
			@JsonProperty("name")
			String name,
			@JsonSetter("email")
			String email) {
		this.id=id;
		this.name=name;
		this.email=email;
		
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
}
