package com.example.demo.seed;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) {
        User user1 = new User("John Doe", "john.doe@example.com");
        User user2 = new User("Jane Smith", "jane.smith@example.com");

        this.userService.save(user1);
        this.userService.save(user2);
    }
}