package com.example.client.fallback;

import com.example.client.UserClient;
import com.example.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserClientImpl implements UserClient {

    @Override
    public User getUserById(int id) {
        User user = new User();
        user.setName("help user");
        return user;
    }
}
