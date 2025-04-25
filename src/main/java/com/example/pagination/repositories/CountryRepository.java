package com.example.pagination.repositories;

import com.example.pagination.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, String> {
    List<Country> findByNameContainingIgnoreCase(String name);

    List<Country> findByContinent(String continent);

    List<Country> findAllByOrderByPopulation(long population); //
}