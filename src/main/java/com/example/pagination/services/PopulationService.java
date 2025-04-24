package com.example.pagination.services;

import com.example.pagination.models.City;
import com.example.pagination.models.Country;
import com.example.pagination.repositories.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PopulationService {

    private final CountryRepository countryRepository;

    /**
     * Calculates the average population of countries in a given continent.
     * @param continent name of the continent
     * @return average population of its countries
     */
    public double averageCountryPopulationByContinent(String continent) {
        List<Country> countries = countryRepository.findByContinent(continent);
        double totalPopulation = 0;
        for (Country country : countries) {
            totalPopulation += country.getPopulation();
            totalPopulation += country.getPopulation();
        }
        return totalPopulation / countries.size();
    }
}