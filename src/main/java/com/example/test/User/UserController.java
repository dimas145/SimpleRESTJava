package com.example.test.User;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/login")
    public Status login(@RequestBody User user) {
        if (user.getUsername().equals("test-user") && user.getPassword().equals("test-user-password")) {
            return Status.SUCCESS;
        } else {
            return Status.FAILURE;
        }
    }
}
