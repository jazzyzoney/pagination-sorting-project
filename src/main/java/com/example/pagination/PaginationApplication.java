package com.example.pagination;

import com.example.pagination.repositories.PagingCityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.PagingAndSortingRepository;

@SpringBootApplication
public class PaginationApplication {

    @Autowired
    PagingCityRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(PaginationApplication.class, args);
    }

}
