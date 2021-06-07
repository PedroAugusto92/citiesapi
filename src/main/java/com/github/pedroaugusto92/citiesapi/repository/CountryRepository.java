package com.github.pedroaugusto92.citiesapi.repository;


import com.github.pedroaugusto92.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
