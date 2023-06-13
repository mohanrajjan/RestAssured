package com.org.interview_ques;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CompareTwoJson {
  static String Json = "{\r\n"
			+ "    \"first_name\": \"Nayan\",\r\n"
			+ "    \"last_name\": \"v\",\r\n"
			+ "    \"email\": \"nayan@trail.com\"\r\n"
			+ "  }";
  static String Json1 = "{\r\n"
			+ "    \"first_name\": \"Nayan\",\r\n"
			+ "    \"last_name\": \"v\",\r\n"
			+ "    \"email\": \"nayan@trail.com\"\r\n"
			+ "  }";
 public static void main(String[] args) throws IOException {
	ObjectMapper mapper = new ObjectMapper();
	
	JsonNode node1 = mapper.readTree(Json);
	JsonNode node2 = mapper.readTree(Json1);
	
	System.out.println(node1.equals(node2));
}
}
