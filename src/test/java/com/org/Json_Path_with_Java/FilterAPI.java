package com.org.Json_Path_with_Java;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;

public class FilterAPI {
	File JsonFile = new File("src/test/resources/bookshop.json");
public void firstQuery() throws IOException {
	Filter one = Filter.filter(Criteria
			.where("price")
			.lt(10));
	List<Map<String,Object>> read = JsonPath.parse(JsonFile)
	.read("$.store.book[?]", one);
	System.out.println(read.get(0).get("author"));
	
}
public void secondQuery() throws IOException {
	Filter two = Filter.filter(Criteria
			.where("price")
			.lt(10)
			.and("category")
			.is("reference")
			);
	
	List<Object> read1 = JsonPath
			.parse(JsonFile)
	        .read("$.store.book[?]",two);
	System.out.println(read1);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FilterAPI gg = new FilterAPI();
gg.firstQuery();
gg.secondQuery();
	}

}
