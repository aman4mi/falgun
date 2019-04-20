package com.bits.bitsDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by aman.ullah on 2/12/2019.
 */

@Controller
public class IndexController {

//    @GetMapping("/")
//    public String getIndex() {
//        return "view/firstindex";
//    }
//
//    @GetMapping("/login")
//    public String loginDemo() {
//
//        return "login/login";
//    }
//
//    @GetMapping("/registration")
//    public String userRegistrationDemo() {
//
//        return "login/userregistration";
//    }
//
//    // it will hit custom firstindex.html page
//    @GetMapping("/admin/home")
//    public String getIndexHome() {
//        return "view/firstindex";
//    }

    @GetMapping("/logout")
    public String logoutDemo() {

        return "login/logout";
    }

    @GetMapping("/access-denied")
    public String accessDeniedDemo() {

        return "login/accessdenied";
    }


}

