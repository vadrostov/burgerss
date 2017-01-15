package com.vadimrostov.burgersflow;

import com.vadimrostov.domain.MenuItem;
import com.vadimrostov.domain.Order;
import com.vadimrostov.domain.User;
import com.vadimrostov.order.BurgerOrder;
import com.vadimrostov.service.OrderService;
import com.vadimrostov.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.security.Principal;
import java.util.Date;

/**
 * Created by Алиса on 10.01.2017.
 */

@Component
public class FlowActions {



    @Autowired
    OrderService orderService;

    @Autowired
    BurgerOrder burgerOrder;

    @Autowired
    UserService userService;

    public boolean ifLogged(){
        String s=SecurityContextHolder.getContext().getAuthentication().getName();
        boolean a=!s.equals("anonymousUser");
        if(a){
            return true;
        }
        return false;
    }

    public String validphone(String phone){
        return phone;
    }

    public String validadress(String adress){
        return adress;
    }

    public String validname(String name){
        return name;
    }

    public String getinPhone(){
        return burgerOrder.getUser().getPhonenumber();
    }

    public String getinName(){
        return burgerOrder.getUser().getLogin();
    }

    public boolean moneychoose(String moneytype){
        if (moneytype.equals("nal")){
            return true;
        }
        return false;
    }

    public String validmoney(String money){
        return money;
    }

    public void saveOrder(BurgerOrder bOrder){
        Order order=new Order();
        order.setName("ghg");
        order.setPhone("7366977");

        StringBuilder stringBuilder=new StringBuilder();
        for (Object menuItem:bOrder.getList()){

            MenuItem item=(MenuItem) menuItem;
            stringBuilder.append(item.getName()+" ;");
        }
        order.setOrderis(stringBuilder.toString());

        order.setPrice(bOrder.getPrice());
        order.setPhone(bOrder.getPhone());
        if(bOrder.getAdress().equals(null)){
            order.setAdress("adress or shit");
        }
        order.setAdress(bOrder.getAdress());
        order.setDate(new Date());
        order.setMoney(bOrder.getMoney());
            orderService.save(order);

    }

    public void nullorder(BurgerOrder bOrder){
        bOrder.setName(null);
        bOrder.setPhone(null);
        bOrder.setMoney(null);
        bOrder.setDate(null);
        bOrder.setPrice(null);
        bOrder.getList().clear();
    }

    public User thisuser(){
        User user=userService.loadbyname(SecurityContextHolder.getContext().getAuthentication().getName());
        return user;
    }



}
