package com.vadimrostov.dao;

import com.vadimrostov.domain.MenuItem;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Алиса on 09.01.2017.
 */

@Repository
public class MenuItemDAOImpl implements MenuItemDAO{

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void save(Object o) {
        sessionFactory.getCurrentSession().save(o);

    }

    @Override
    public List<MenuItem> loadlist() {
        return sessionFactory.getCurrentSession().createQuery("from MenuItem").list();
    }

    @Override
    public MenuItem get(Long id) {
        MenuItem menuItem=sessionFactory.getCurrentSession().get(MenuItem.class, id);

        return menuItem;
    }
}
