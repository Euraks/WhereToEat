/**
 * @author @Euraks 24.06.2022
 */
package com.where_to_eat.repository;

import com.where_to_eat.model.Restaurant;

import java.util.List;

public interface RestaurantRepository {
    List<Restaurant> getAll();
    void addRestaurant(Restaurant restaurant);
}
