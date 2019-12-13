package com.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    //parameters saying when there's a request coming in the root context
    // for any of the "" below, they'll all come in thru the RequestMapping
    @RequestMapping({"", "/", "index", "index.html"})
    public String index(){
        return "index";
    }
}
