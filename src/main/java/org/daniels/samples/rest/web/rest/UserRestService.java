package org.daniels.samples.rest.web.rest;

import com.google.inject.Inject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.daniels.samples.rest.domain.User;
import org.daniels.samples.rest.service.contract.UserService;

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
    public User getUserById(@PathParam("id") int id) {
        return userService.getById(id);
    }

}
