package com.vadimrostov.dao;

import com.vadimrostov.domain.User;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Алиса on 10.01.2017.
 */
@Repository
public interface UserDAO {

    public void save(Object o);

    public User loadbyname(String name);

    public List<User> getUsers();

}
