package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.model.Product;
import com.example.demo.repository.HibernateProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private HibernateProduct hibernateProduct;

    //controller để test vs config sử dụng class Java, view là display.html
//    @RequestMapping(value = "", method = RequestMethod.GET)
//    public ModelAndView findAll() {
//        ModelAndView modelAndView = new ModelAndView("display");
//        List<Product> products = hibernateProduct.findAll();
//        modelAndView.addObject("products", products);
//        return modelAndView;
//    }

    //controller để test vs config sử dụng xml, view là display2.html
    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public ModelAndView findAll() {
        ModelAndView modelAndView = new ModelAndView("display2");
        List<Person> person = hibernateProduct.findAll();
        modelAndView.addObject("persons", person);
        return modelAndView;
    }
}
