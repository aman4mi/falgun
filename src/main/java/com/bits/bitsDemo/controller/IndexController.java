package com.bits.bitsDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by aman.ullah on 2/12/2019.
 */

@Controller
public class IndexController {

    // it will hit custom firstindex.html page
    @GetMapping("/")
    public String getIndex() {

        return "view/firstindex";
    }

//    // it will hit custom home.html page (carousol theme)
//    @GetMapping("/")
//    public String showHome() {
//        return "view/home";
//    }
}

