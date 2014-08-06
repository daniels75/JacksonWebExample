package org.daniels.samples.rest.domain.serializer;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.daniels.samples.rest.domain.User;


public class UserSerializer extends JsonSerializer<User>{

	@Override
	public void serialize(User value, JsonGenerator generator,
			SerializerProvider provider) throws IOException,
			JsonProcessingException {

			generator.writeStartObject();
			
		    generator.writeFieldName("name");
	        generator.writeString(value.getFirstName());
	        generator.writeStringField("lastName", value.getLastName());
	        
	        generator.writeEndObject();
		
	}

}
