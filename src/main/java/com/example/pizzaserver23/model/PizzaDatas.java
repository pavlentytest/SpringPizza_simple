package com.example.pizzaserver23.model;

import org.springframework.data.repository.CrudRepository;

// CRUD - Create Read Update Delete

public interface PizzaDatas extends CrudRepository<Pizza, Integer> {
}
