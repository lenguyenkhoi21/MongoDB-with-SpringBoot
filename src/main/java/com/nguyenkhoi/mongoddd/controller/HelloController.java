package com.nguyenkhoi.mongoddd.controller;

import com.nguyenkhoi.mongoddd.document.Hello;
import com.nguyenkhoi.mongoddd.service.HelloSerivce;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloSerivce serivce;

    public HelloController(HelloSerivce serivce) {
        this.serivce = serivce;
    }

    @GetMapping("/hello/{id}")
    public Hello getHello(@PathVariable("id") int id) {
        return serivce.getHello(id);
    }
}
