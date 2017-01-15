package com.vadimrostov.dao;

import com.vadimrostov.domain.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Алиса on 11.01.2017.
 */
@Repository
public interface OrdersDAO {

    public void save(Object o);

    public List<Order> getOrders();
}
