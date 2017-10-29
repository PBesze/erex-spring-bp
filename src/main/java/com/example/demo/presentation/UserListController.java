package com.example.demo.presentation;

import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.List;

@Scope (value = "session")
@Component (value = "userList")
public class UserListController {
    @Autowired
    private UserRepository userRepository;

    private List<User> users;


    public void loadData() {
        users = userRepository.findAll();
    }

    public List<User> getUsers() {
    	users = userRepository.findAll();
        return users;
    }
}