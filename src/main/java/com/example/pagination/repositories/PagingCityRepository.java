package com.example.pagination.repositories;

import com.example.pagination.models.City;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PagingCityRepository extends PagingAndSortingRepository<City, Long> {
    City findById(long id);
}
