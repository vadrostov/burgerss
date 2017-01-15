package com.vadimrostov.controller;

import com.vadimrostov.domain.MenuItem;
import com.vadimrostov.service.MenuService;
import com.vadimrostov.service.OrderService;
import com.vadimrostov.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Алиса on 09.01.2017.
 */

@Controller
@RequestMapping(value = "admin")
public class AdminController {


    ModelAndView modelAndView= new ModelAndView();

    @Autowired
    MenuService menuService;

    @Autowired
    UserService userService;

    @Autowired
    OrderService orderService;


    @RequestMapping(  method = RequestMethod.GET)
    public ModelAndView adminka(){
        modelAndView.setViewName("adminka");
        return modelAndView;}

@RequestMapping( value = "/menu", method = RequestMethod.GET)
    public ModelAndView menu(){
        modelAndView.addObject("menuitem", new MenuItem());
        modelAndView.setViewName("showmenuadmin");
        return modelAndView;
    }

    @RequestMapping ( value = "/menu", method = RequestMethod.POST)
    public ModelAndView savemenuadmin(MenuItem menuItem){
       menuService.save(menuItem);
        return modelAndView;
    }

    @RequestMapping(value = "/users")
    public ModelAndView usersshow(){
        modelAndView.addObject("userslist", userService.getUsers());
        modelAndView.setViewName("showusers");
        return modelAndView;
    }

    @RequestMapping(value = "/orders")
    public ModelAndView ordersshow(){
        modelAndView.addObject("orderlist", orderService.getListOrder());
        modelAndView.setViewName("showorders");
        return modelAndView;
    }

}
