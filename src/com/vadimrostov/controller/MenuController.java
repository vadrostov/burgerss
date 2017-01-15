package com.vadimrostov.controller;

import com.vadimrostov.domain.Menu;
import com.vadimrostov.domain.MenuItem;
import com.vadimrostov.order.BurgerOrder;
import com.vadimrostov.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Алиса on 09.01.2017.
 */

@Controller
@RequestMapping(value = "menu")
public class MenuController {

    ModelAndView modelAndView= new ModelAndView();

    @Autowired
    Menu menu;

    @Autowired
    BurgerOrder burgerOrder;

    @Autowired
    MenuService menuService;



    @RequestMapping(value = "/{itemtype}")
    public ModelAndView showmenu(@PathVariable String itemtype){
        modelAndView.addObject("bgorder", burgerOrder);
        modelAndView.addObject("menulist", takemenu(itemtype));
        modelAndView.setViewName("showmenu");
        return modelAndView;
    }

    @RequestMapping(value = "/add")
    public ModelAndView addeditem(@RequestParam Long menuitem){
        MenuItem menuItem=menuService.getMenuItem(menuitem);
        burgerOrder.addItem(menuItem);
        modelAndView.setViewName("/showmenu");
        return modelAndView;
    }


    private List<List<MenuItem>> takemenu(String itemtype){
        List<MenuItem> list=new ArrayList<>();
        for(MenuItem menuItem: menu.getItemList()){
            if(menuItem.getType().equals(itemtype)) list.add(menuItem);
        }

        List<List<MenuItem>> listList = new ArrayList<>();
        int i=0;
        for (MenuItem menuItem:list){
            if(i%3==0){
                List list1=new ArrayList<>();
                listList.add(0, list1);}

            listList.get(0).add(menuItem);
            i++;
            }

        return listList;
    }
}
