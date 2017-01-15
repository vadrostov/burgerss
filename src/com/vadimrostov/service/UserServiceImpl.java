package com.vadimrostov.service;

import com.vadimrostov.dao.UserDAO;
import com.vadimrostov.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Алиса on 10.01.2017.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    UserDAO userDAO;

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    @Override
    public User loadbyname(String username) {
        return userDAO.loadbyname(username);


    }
}
