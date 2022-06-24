/**
 * @author @Euraks 24.06.2022
 */
package com.where_to_eat.service;

import com.where_to_eat.model.Restaurant;
import com.where_to_eat.repository.RestaurantRepository;

import java.util.List;

public class RestaurantService {
    private final RestaurantRepository repository;

    public RestaurantService(RestaurantRepository repository) {
        this.repository = repository;
    }

    public List<Restaurant> getAll(){
        return repository.getAll();
    }
    public void addRestaurant(Restaurant restaurant){
        repository.addRestaurant(restaurant);
    }

}
