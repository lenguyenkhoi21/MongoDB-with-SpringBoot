package com.nguyenkhoi.mongoddd.service;

import com.nguyenkhoi.mongoddd.document.Hello;
import com.nguyenkhoi.mongoddd.jpa.HelloRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HelloSerivce {
    private final HelloRepo repo;

    public HelloSerivce(HelloRepo repo) {
        this.repo = repo;
    }

    @Transactional
    public Hello getHello(int id) {
        return  repo.findById(id).get();
    }
}
