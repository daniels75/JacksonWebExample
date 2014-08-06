package org.daniels.samples.rest.service.contract;

import java.util.List;

import org.daniels.samples.rest.domain.User;

public interface UserService {

    List<User> getAllUsers();

    User getById(int id);


}
