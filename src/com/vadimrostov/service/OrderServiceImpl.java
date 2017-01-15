package com.vadimrostov.service;

import com.vadimrostov.dao.OrdersDAO;
import com.vadimrostov.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Алиса on 11.01.2017.
 */

@Service
@Transactional
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrdersDAO ordersDAO;

    @Override
    public void save(Order order) {
        ordersDAO.save(order);
    }

    @Override
    public List<Order> getListOrder() {
        return ordersDAO.getOrders();
    }
}
