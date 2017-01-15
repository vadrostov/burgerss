package com.vadimrostov.controller;

import com.vadimrostov.domain.User;
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
@RequestMapping(value = "registration")
public class RegistrationController {

    ModelAndView modelAndView=new ModelAndView();

    @Autowired
    UserService userService;

    @Autowired
    BurgerOrder burgerOrder;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView regform(){
        modelAndView.addObject("newUser", new User());
        modelAndView.setViewName("regform");
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView regformsent(User newUser){
       newUser.setMoneysgoes(new Double(0.0));
        newUser.setRole("user");
        userService.save(newUser);
        burgerOrder.setUser(newUser);
        modelAndView.setViewName("showmenu");
        return modelAndView;

    }
}
