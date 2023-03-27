package com.example.pizzaserver23.controller;

import com.example.pizzaserver23.model.Pizza;
import com.example.pizzaserver23.model.PizzaDatas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @Autowired
    PizzaDatas datas;

    @GetMapping("/add")
    public @ResponseBody String add(@RequestParam String name, @RequestParam Integer size) {
        Pizza pizza = new Pizza(name, size);
        datas.save(pizza); // insert
        return "Saved successfull!";
    }

    @GetMapping("/list")
    public @ResponseBody Iterable<Pizza> getAll() {
        return datas.findAll(); // select * from
    }
}
