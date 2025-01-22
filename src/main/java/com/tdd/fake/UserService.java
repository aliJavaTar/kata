package com.tdd.fake;

import com.s.User;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String createUser(User user) {
        userRepository.save(user);
        return "User created!";
    }
}