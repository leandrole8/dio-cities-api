package com.github.leandroreis.citiesapi.states.repository;

import com.github.leandroreis.citiesapi.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
