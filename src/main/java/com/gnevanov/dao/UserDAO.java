package com.gnevanov.dao;

import com.gnevanov.models.User;

import java.util.List;

public interface UserDAO {
    List<User> getUsers();
}
