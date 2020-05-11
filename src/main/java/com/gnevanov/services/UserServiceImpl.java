package com.gnevanov.services;

import com.gnevanov.dao.UserDAO;
import com.gnevanov.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    public List<User> getUsers() {
        return userDAO.getUsers();
    }
}
