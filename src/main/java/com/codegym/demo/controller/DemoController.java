package com.codegym.demo.controller;

import com.codegym.demo.service.NewProductServiceImpl;
import com.codegym.demo.service.ProductService;
import com.codegym.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class DemoController {
    @Autowired
    ProductService productService = new ProductServiceImpl();
//    @RequestMapping("/home")
    @GetMapping
    public String demo() {
        productService.save();
        return "product/home";
    }

    @PostMapping
    public String getValue() {
        return "redirect:/yasuo";
    }

    @GetMapping("/yasuo")
    public String yasuo() {
        return "product/lastwhisper";
    }
}
