package com.nguyenkhoi.mongoddd.service;

import com.nguyenkhoi.mongoddd.document.Me;
import com.nguyenkhoi.mongoddd.repo.MeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeService {

    private final MeRepo meRepo;

    public MeService(MeRepo meRepo) {
        this.meRepo = meRepo;
    }

    public void insert(Me me) {
        meRepo.insert(me);
    }

    public List<Me> srchByRegx (String name) {
        return meRepo.findByNameRegex(name);
    }

    public List<Me> srchLike (String name) {
        return meRepo.findByNameLike(name);
    }

    public List<Me> srchByRegxNameInCases(String name) {
        return meRepo.findByNameInCases(name);
    }
}
