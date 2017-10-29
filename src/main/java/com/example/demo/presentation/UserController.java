package com.example.demo.presentation;

import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "userController")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    private User user = new User();

    public String save() {
        userRepository.save(user);
        user = new User();
        return "/user-list.xhtml?faces-redirect=true";
    }

    public User getUser() {
        return user;
    }
}
