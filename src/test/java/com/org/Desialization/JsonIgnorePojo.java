package com.org.Desialization;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

//@JsonIgnoreProperties({"age","Id"}) (value="age")
//@JsonInclude(Include.NON_NULL)
@JsonInclude(Include.NON_DEFAULT)
public class JsonIgnorePojo {
private int Id;
private String name;
private Date date;
//@JsonIgnore
private int age;
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
