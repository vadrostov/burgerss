package com.vadimrostov.order;

import com.vadimrostov.domain.MenuItem;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Алиса on 09.01.2017.
 */
@Component
public class OrderItems implements Serializable{

    private List<MenuItem> list;


    public OrderItems() {
        this.list=new ArrayList<>();
    }

    public List<MenuItem> getList() {
        return list;
    }

    public void setList(List<MenuItem> list) {
        this.list = list;
    }

    public void additem(MenuItem item){
        list.add(item);
    }

    public Double price(){
        double price=0.0;
        for(MenuItem menuItem:this.list){
            price+=menuItem.getCost();
        }
        return new Double(price);
    }



}
