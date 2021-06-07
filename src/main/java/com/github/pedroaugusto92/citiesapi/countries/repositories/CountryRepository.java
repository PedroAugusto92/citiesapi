package com.github.pedroaugusto92.citiesapi.countries.repositories;


import com.github.pedroaugusto92.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
