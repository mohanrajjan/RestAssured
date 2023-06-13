package com.org.json_schema_validation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class HamcrestJsonSchemaValidator {
@Test

	public void validate() throws IOException {
		File injson = new File("src/test/resources/input.json");
		String input = FileUtils.readFileToString(injson,"UTF-8");
		File schema = new File("src/test/resources/schema.json");
		MatcherAssert.assertThat(input, JsonSchemaValidator.matchesJsonSchema(schema));
	}
}
