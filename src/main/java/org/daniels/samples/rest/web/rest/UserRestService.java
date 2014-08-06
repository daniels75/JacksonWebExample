package org.daniels.samples.rest.web.rest;

import com.google.inject.Inject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.daniels.samples.rest.domain.User;
import org.daniels.samples.rest.service.contract.UserService;

import java.io.IOException;
import java.util.List;

@Path("/users")
public class UserRestService {

    private final UserService userService;

    @Inject
    public UserRestService(UserService userService) {
        this.userService = userService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getAllUsersInJSON() {

        return userService.getAllUsers();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserById(@PathParam("id") int id) throws JsonGenerationException, JsonMappingException, IOException {
    	final User user = userService.getById(id);
    	ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(user);
        
        System.out.println("JSON string: " + jsonString);
    	
        return user;
    }

}
