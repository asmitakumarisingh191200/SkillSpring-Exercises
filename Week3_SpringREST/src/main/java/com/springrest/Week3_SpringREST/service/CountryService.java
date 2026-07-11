package com.springrest.Week3_SpringREST.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.springrest.Week3_SpringREST.model.Country;

@Service
public class CountryService {

    public Country getCountry() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Country country = (Country) context.getBean("country");

        return country;
    }
}