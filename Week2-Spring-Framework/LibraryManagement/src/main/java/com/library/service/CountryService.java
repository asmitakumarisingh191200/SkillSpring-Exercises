package com.library.service;

import com.library.entity.Country;
import com.library.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    // Add country
    public Country addCountry(Country country) {
        return repository.save(country);
    }

    // Get all countries
    public List<Country> getAllCountries() {
        return repository.findAll();
    }

    // Find by code
    public Country getCountryByCode(String code) {
        return repository.findByCode(code);
    }
}