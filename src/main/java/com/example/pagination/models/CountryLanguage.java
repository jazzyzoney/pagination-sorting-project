package com.example.pagination.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "countrylanguage")
public class CountryLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CountryCode")
    private String countryCode;

    @Column(name = "Language")
    private String language;

    @Column(name = "IsOfficial")
    private String isOfficial;    // 'T' or 'F'

    @Column(name = "Percentage")
    private Double percentage;
}
