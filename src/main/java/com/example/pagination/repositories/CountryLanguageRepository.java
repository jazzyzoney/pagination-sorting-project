package com.example.pagination.repositories;

import com.example.pagination.models.CountryLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, Long> {
    List<CountryLanguage> findByCountryCode(String countryCode);
}
