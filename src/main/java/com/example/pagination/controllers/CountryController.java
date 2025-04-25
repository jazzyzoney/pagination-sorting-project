package com.example.pagination.controllers;

import com.example.pagination.models.Country;
import com.example.pagination.repositories.CountryRepository;
import com.example.pagination.services.PopulationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CountryController {

    private final CountryRepository repo;
    private final PopulationService popService;

    public CountryController(CountryRepository repo, PopulationService popService) {
        this.repo = repo;
        this.popService = popService;
    }

    @GetMapping("/search")
    public List<Country> searchCountries(@RequestParam String name) {
        return repo.findByNameContainingIgnoreCase(name);
    }

    @GetMapping("/continent")
    public List<Country> countriesByContinent(@RequestParam String continent) {
        return repo.findByContinent(continent);
    }

    //Example: localhost:8080/api/countries/average?continent=asia
    @GetMapping("/average")
    public ResponseEntity<Double> averagePopulationByContinent(@RequestParam String continent) {
        Double average = popService.averageCountryPopulationByContinent(continent);
        if(average == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(average);
    }

    @GetMapping("/byPopulation")
    public List<Country> countriesByPopulation(@RequestParam long population) {
        return repo.findAllByOrderByPopulation(population);
    }
}