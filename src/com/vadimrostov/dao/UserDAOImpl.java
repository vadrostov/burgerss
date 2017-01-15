package com.vadimrostov.dao;

import com.vadimrostov.domain.User;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by Алиса on 10.01.2017.
 */
@Repository
public class UserDAOImpl implements UserDAO{

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void save(Object o)


    {



        sessionFactory.getCurrentSession().save(o);
    }

    @Override
    public List<User> getUsers() {
        return sessionFactory.getCurrentSession().createQuery("from User").list();
    }

    @Override
    public User loadbyname(String name) {
        User user=(User)sessionFactory.getCurrentSession().createQuery("from User where login=:login").setParameter("login", name).uniqueResult();
        return user;
    }
}
