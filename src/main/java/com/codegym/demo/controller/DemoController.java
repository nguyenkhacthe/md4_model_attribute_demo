package com.codegym.demo.controller;

import com.codegym.demo.model.Product;
import com.codegym.demo.service.NewProductServiceImpl;
import com.codegym.demo.service.ProductService;
import com.codegym.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class DemoController {
    @Autowired
    ProductService productService = new ProductServiceImpl();
//    @RequestMapping("/home")
    @GetMapping
    public ModelAndView demo() {
        ModelAndView modelAndView = new ModelAndView("product/home");
        modelAndView.addObject("product", new Product(14, "Automated Kalasnikov model 47"));
        return modelAndView;
    }

    @PostMapping
    public String getValue(@ModelAttribute Product product)
    {
        System.out.println(product);
        return "redirect:/home/yasuo";
    }

    @GetMapping("/yasuo")
    public String yasuo() {
        return "product/lastwhisper";
    }
}
