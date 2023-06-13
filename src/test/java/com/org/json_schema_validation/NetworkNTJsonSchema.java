package com.org.json_schema_validation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

import javax.print.DocFlavor.INPUT_STREAM;

import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.SpecVersion.VersionFlag;
import com.networknt.schema.ValidationMessage;

import gherkin.deps.net.iharder.Base64.InputStream;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.core.TreeNode;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.JsonNode;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.ObjectMapper;

public class NetworkNTJsonSchema {

	public void validateJsonSchema() throws JsonProcessingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		com.networknt.schema.JsonSchemaFactory factory = com.networknt.schema.JsonSchemaFactory.getInstance(VersionFlag.V4);
		File input = new File("src/test/resources/input.json");
		JsonNode readTree = mapper.readTree(input);
		java.io.InputStream vSchema = new FileInputStream("src/test/resources/schema.json");
		JsonSchema schema = factory.getSchema(vSchema);
		
		
		//  Set<ValidationMessage> result=schema.validate(readTree);
		  //if(result.isEmpty())
		  { 
			  System.out.println("no errors");
			  }
		  //else {
			//  for (ValidationMessage validationMessage : result) 
			  {
				 // System.out.println(validationMessage);
			  }
}
	}
