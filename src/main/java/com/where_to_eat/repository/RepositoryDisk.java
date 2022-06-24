/**
 * @author @Euraks 24.06.2022
 */
package com.where_to_eat.repository;

import com.where_to_eat.model.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RepositoryDisk implements RestaurantRepository {
    private List<Restaurant> restaurantList = new ArrayList<>();

    @Override
    public List<Restaurant> getAll() {
        return restaurantList;
    }

    @Override
    public void addRestaurant(Restaurant restaurant) {
        restaurantList.add(restaurant);
    }
}
