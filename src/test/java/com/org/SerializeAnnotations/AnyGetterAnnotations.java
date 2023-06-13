package com.org.SerializeAnnotations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.plexus.interpolation.MapBasedValueSource;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AnyGetterAnnotations {
	
	public static void main(String[] args) throws JsonProcessingException {
		
		
		JsonAnyGetterPojo anyGP = new JsonAnyGetterPojo();
		 
		 Map<String,Object> mapvalues = new HashMap<String,Object>();
		 mapvalues.put("firstname", "vaishnavi");
		 mapvalues.put("lastname", "arul");
		 mapvalues.put("email", "vaishnavi@arul.com");
		 mapvalues.put("skills", Arrays.asList("serial","movies"));
		 
		 anyGP.setEmployeeProperties(mapvalues);
		 
		 ObjectMapper mapper = new ObjectMapper();
		 String json = mapper.writerWithDefaultPrettyPrinter()
		 .writeValueAsString(anyGP);
		 System.out.println(json);
	}
 
}
