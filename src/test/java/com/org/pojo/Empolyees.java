package com.org.pojo;

import java.util.List;

public class Empolyees {
private String FirstName;
private String LastName;
private String Email;
private List Skills;
public String getFirstName() {
	//System.out.println("get firstname");
	return FirstName;
}
public void setFirstName(String firstName) {
	//System.out.println("set fname");
	FirstName = firstName;
}
public String getLastName() {
	//System.out.println("get lastname");
	return LastName;
}
public void setLastName(String lastName) {
	//System.out.println("set lname");
	LastName = lastName;
}
public String getEmail() {
	//System.out.println("get mail");
	return Email;
}
public void setEmail(String email) {
	//System.out.println("set email");
	Email = email;
}
public List getSkills() {
	//System.out.println("get skills");
	return Skills;
}
public void setSkills(List skills) {
	//System.out.println("set skill");
	Skills = skills;
}

}
