package com.example.pagination.controllers;

import com.example.pagination.models.City;
import com.example.pagination.repositories.PagingCityRepository;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping("/api/cities")
public class CityController {

    private final PagingCityRepository pageRepo;

    public CityController(PagingCityRepository pageRepo) {
        this.pageRepo = pageRepo;
    }

    @GetMapping("/all")
    public ResponseEntity<Page<City>> page(Pageable pageable) {
        Page<City> page = pageRepo.findAll(pageable);
        return ResponseEntity.ok(page);
    }
}