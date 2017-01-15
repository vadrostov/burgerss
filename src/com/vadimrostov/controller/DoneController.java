package com.vadimrostov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Алиса on 09.01.2017.
 */

@Controller
public class DoneController {

    @RequestMapping(value = "order_done")
    public String redirectToFlow(){
        return "redirect:/burgers";
    }

}
