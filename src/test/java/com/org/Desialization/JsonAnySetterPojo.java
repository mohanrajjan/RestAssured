package com.org.Desialization;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;

public class JsonAnySetterPojo {
private Map<String,Object> employee = new HashMap<String,Object>();

public Map<String, Object> getEmployee() {
	return employee;
}
@JsonAnySetter
public void setEmployee(String key, Object value) {
	//this.employee = employee;
	employee.put(key, value);
}




}
