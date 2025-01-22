package com.tdd.fake;

import com.s.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceTest {
    @Test
    public void testCreateUserWithFakeRepository() {
        var fakeRepo = new FakeUserRepository();
        var userService = new UserService(fakeRepo);

        User user = new User(1, "John Doe");
        String response = userService.createUser(user);

        assertEquals("User created!", response);
    }

}
