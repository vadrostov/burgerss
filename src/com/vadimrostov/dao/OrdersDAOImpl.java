package com.vadimrostov.dao;

import com.vadimrostov.domain.Order;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Алиса on 11.01.2017.
 */
@Repository
public class OrdersDAOImpl implements OrdersDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void save(Object o) {
        sessionFactory.getCurrentSession().save(o);
    }

    @Override
    public List<Order> getOrders() {
        return sessionFactory.getCurrentSession().createQuery("from Order ").list();
    }
}
