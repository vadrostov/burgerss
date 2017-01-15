package com.vadimrostov.controller;

import com.vadimrostov.domain.User;
import com.vadimrostov.maitnance.LoginBean;
import com.vadimrostov.order.BurgerOrder;
import com.vadimrostov.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Алиса on 10.01.2017.
 */

@Controller
@RequestMapping(value = "login")
public class LoginController {

    @Autowired
    ModelAndView modelAndView;

    @Autowired
    UserService userService;

    @Autowired
    BurgerOrder burgerOrder;



    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView loginform(){
        modelAndView.addObject("loginBean", new LoginBean());
        modelAndView.setViewName("loginform");
        return modelAndView;
    }



}
