package com.example.client;

import com.example.client.fallback.UserClientImpl;
import com.example.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-service", fallback = UserClientImpl.class)
public interface UserClient {

    @GetMapping("/user/{id}")
    User getUserById(@PathVariable("id") int id);
}
