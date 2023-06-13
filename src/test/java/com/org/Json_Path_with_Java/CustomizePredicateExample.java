package com.org.Json_Path_with_Java;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Predicate;
import com.jayway.jsonpath.Predicate.PredicateContext;

public class CustomizePredicateExample {
	File JsonFile = new File("src/test/resources/bookshop.json");
	public void predicateExample() throws IOException {
		/*
		 * Predicate bookswithISBN = new Predicate() {
		 * 
		 * public boolean apply(PredicateContext ctx) { // TODO Auto-generated method
		 * stub boolean predicate=ctx.item(Map.class).containsKey("isbn"); return
		 * predicate; } };
		 */
		Predicate bookswithISBN = ctx->ctx.item(Map.class).containsKey("isbn");
		List<Map<String,Object>> read = JsonPath.parse(JsonFile)
		.read("$.store.book[?].isbn",List.class,bookswithISBN);
		System.out.println(read);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
CustomizePredicateExample cus = new CustomizePredicateExample();
cus.predicateExample();
	}

}
