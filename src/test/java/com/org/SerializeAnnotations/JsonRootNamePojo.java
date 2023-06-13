package com.org.SerializeAnnotations;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value="employess")
public class JsonRootNamePojo {
	private String firstname;
	private String lastname;
	private String email;
	private List<String> skills;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
}
