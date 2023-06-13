package com.org.SerializeAnnotations;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class CustomizeSerializer extends StdSerializer<JsonSerializeAnnotations> {

	public CustomizeSerializer(Class<JsonSerializeAnnotations> t ) {
		super(t);
		// TODO Auto-generated constructor stub
	}
	
	public CustomizeSerializer() {
		this(null);
	}

	@Override
	public void serialize(JsonSerializeAnnotations value,
			JsonGenerator gen,
			SerializerProvider provider)
			throws IOException {
		gen.writeStartObject();
		gen.writeStringField("firstname", value.getFirstname());
		gen.writeStringField("email", value.getEmail());
		gen.writeEndObject();
	}

}
