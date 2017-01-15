package com.vadimrostov.order;

import com.vadimrostov.domain.Menu;
import com.vadimrostov.domain.MenuItem;
import com.vadimrostov.domain.Order;
import com.vadimrostov.domain.User;
import com.vadimrostov.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Алиса on 08.01.2017.
 */

@Component
public class BurgerOrder implements Serializable{



    public User user;

    @Autowired
    public OrderItems order;

    public Double price;

    public String phone;

    public String adress;

    public Date date;

    public String money;

    public String name;

    public void addItem(MenuItem menuItem){
        order.additem(menuItem);
    }

    public Double getPrice() {
        price=order.price();
        return price;
    }



    public List<MenuItem> getList(){
        return this.order.getList();
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrder(OrderItems order) {
        this.order = order;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
