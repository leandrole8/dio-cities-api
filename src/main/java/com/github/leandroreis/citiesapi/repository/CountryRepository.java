package com.github.leandroreis.citiesapi.repository;

import com.github.leandroreis.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
