package com.hectorgallego.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/orders")
public class OrderController {

    @RequestMapping("/list")
    public ModelAndView getList() {
    	ModelAndView modelAndView = new ModelAndView();
    	modelAndView.setViewName("orderList");
    	return modelAndView;
    }
}
