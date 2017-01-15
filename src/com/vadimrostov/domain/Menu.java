package com.vadimrostov.domain;

import com.vadimrostov.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Алиса on 09.01.2017.
 */
@Component
public class Menu {



    @Autowired
    MenuService menuService;




    public List<MenuItem> getItemList() {
        return menuService.loadmenu();
    }
}
