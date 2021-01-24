package com.example.login.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class MainController {

    @RequestMapping(path = "/test",method = RequestMethod.GET)
    public String getExchange() throws IOException {

        return "sss";
    }


}
