package com.springrest.Week3_SpringREST.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.springrest.Week3_SpringREST.model.Country;

@Service
public class CountryService {

    private Country country;

    public CountryService() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        country = context.getBean("country", Country.class);
    }

    public Country getCountry() {
        return country;
    }
}