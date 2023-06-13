package com.org.SerializeAnnotations;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonRawValue;

public class JsonRawValuePojo {
private String firstname;
private String Lastname;
private String email;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return Lastname;
}
public void setLastname(String lastname) {
	Lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

@JsonRawValue
//private String Skill="java";
private String Skill="{[\"java\"],[\"selenium\"]}";




}
