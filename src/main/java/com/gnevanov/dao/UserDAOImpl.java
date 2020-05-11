package com.gnevanov.dao;

import com.gnevanov.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<User> getUsers() {

        return jdbcTemplate.query(
                "SELECT id, name FROM users_table",
                new RowMapper<User>() {
                    public User mapRow(ResultSet resultSet, int i) throws SQLException {
                        return new User(resultSet.getInt("id"), resultSet.getString("name"));
                    }
                }
        );
    }
}
