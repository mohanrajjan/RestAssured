package com.org.Json_Path_with_Java;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.JsonPath;

public class InlinePredictes {
	File JsonFile = new File("src/test/resources/bookshop.json");
	public void predicateInline() throws IOException {
		List<Object> read = JsonPath
				.parse(JsonFile)
				.read("$.store.book[?(@.price>10 && @.category == 'fiction')].author");
		System.out.println(read);
		
	//	                  price>10  or category=fiction
		//$.store.book[?(@.price>10 // @.category == "fiction")] if we know exact value then""
	}

	public static void main(String[] args) throws IOException {
		InlinePredictes jj = new InlinePredictes();
		jj.predicateInline();
	}

}
