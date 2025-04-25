package com.example.pagination.controllers;

import com.example.pagination.models.CountryLanguage;
import com.example.pagination.repositories.CountryLanguageRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {

    private final CountryLanguageRepository repo;

    public LanguageController(CountryLanguageRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/languages")
    public List<CountryLanguage> getAllLanguages() {
        return repo.findAll();
    }

    @GetMapping("/search")
    public List<CountryLanguage> byCountry(@RequestParam String country) {
        return repo.findByCountryCode(country); // search a language by country
    }
}