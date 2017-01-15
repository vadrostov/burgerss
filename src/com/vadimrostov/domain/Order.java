package com.vadimrostov.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Алиса on 11.01.2017.
 */

@Entity
@Table(name = "burgerorders")
public class Order {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="username")
    public String name;

    @Column(name = "orderis")
    public String orderis;

    @Column(name = "price")
    public Double price;

    @Column(name = "phone")
    public String phone;

    @Column(name = "adress")
    public String adress;

    @Column(name = "date")
    public Date date;

    @Column(name = "money")
    public String money;

    public Long getId() {
        return id;
    }

    public String getOrderis() {
        return orderis;
    }

    public void setOrderis(String orderis) {
        this.orderis = orderis;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
}
