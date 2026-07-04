package com.library.repository;

import org.springframework.data.jpa.repository.Query;
import java.util.List;
import com.library.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {

    Country findByCode(String code);

    @Query("FROM Country")
    List<Country> getAllCountries();

    @Query(value = "SELECT * FROM country", nativeQuery = true)
    List<Country> getCountriesNative();

}