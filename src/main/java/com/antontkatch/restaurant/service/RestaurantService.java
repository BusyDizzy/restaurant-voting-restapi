package com.antontkatch.restaurant.service;

import com.antontkatch.restaurant.repository.RestaurantRepository;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

    private final RestaurantRepository repository;

    public RestaurantService(RestaurantRepository repository) {
        this.repository = repository;
    }
}
