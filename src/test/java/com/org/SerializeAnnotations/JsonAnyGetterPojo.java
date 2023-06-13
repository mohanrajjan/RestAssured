package com.org.SerializeAnnotations;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

public class JsonAnyGetterPojo {
  
	private Map<String,Object> EmployeeProperties;

	@JsonAnyGetter
	public Map<String, Object> getEmployeeProperties() {
		return EmployeeProperties;
	}

	public void setEmployeeProperties(Map<String, Object> employeeProperties) {
		EmployeeProperties = employeeProperties;
	}
	
}
