package com.nguyenkhoi.mongoddd.controller;

import com.nguyenkhoi.mongoddd.document.Me;
import com.nguyenkhoi.mongoddd.service.MeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MeController {
    private final MeService meService;

    public MeController(MeService meService) {
        this.meService = meService;
    }

    @PostMapping("/insert")
    public void insert (@RequestBody Me me) {
        meService.insert(me);
    }

    @GetMapping("/find/{name}")
    public List<Me> findByNameRegex(@PathVariable("name") String name) {
        return meService.srchByRegx(name);
    }

    @GetMapping("/findlike/{name}")
    public List<Me> findByNameLike(@PathVariable("name") String name) {
        return meService.srchLike(name);
    }

    @GetMapping("/findincase/{name}")
    public List<Me> findByInCase(@PathVariable("name") String name) {
        return meService.srchByRegxNameInCases(name);
    }
}
