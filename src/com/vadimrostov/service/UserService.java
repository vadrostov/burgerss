package com.vadimrostov.service;

import com.vadimrostov.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Алиса on 10.01.2017.
 */
@Service
public interface UserService {

    public void save(User user);

    public User loadbyname(String username);

    public List<User> getUsers();
}
