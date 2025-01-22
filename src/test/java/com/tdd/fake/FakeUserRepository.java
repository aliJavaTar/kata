package com.tdd.fake;

import com.s.User;

import java.util.HashMap;
import java.util.Map;

// Fake repository using an in-memory data structure (H2 or HashMap)
public class FakeUserRepository implements UserRepository {
    private final Map<Integer, User> database = new HashMap<>();

    @Override
    public void save(User user) {
        database.put(user.getId(), user);
    }

    @Override
    public User findUserById(int id) {
        return database.get(id);
    }

//    @Override
//    public User findById(int id) {
//        return database.get(id);
//    }


}