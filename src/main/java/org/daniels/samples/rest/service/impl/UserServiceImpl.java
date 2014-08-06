package org.daniels.samples.rest.service.impl;

import java.util.List;

import org.daniels.samples.rest.domain.User;
import org.daniels.samples.rest.repositories.contract.UserRepository;
import org.daniels.samples.rest.service.contract.UserService;

import com.google.inject.Inject;
import com.google.inject.Singleton;
@Singleton
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Inject
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    
    @Override
    public List getAllUsers() {
        return this.userRepository.getAll();
    }

    @Override
    public User getById(int id) {
        return this.userRepository.getById(id);
    }


}
