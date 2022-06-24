/**
 * @author @Euraks 24.06.2022
 */
package com.where_to_eat;

import com.where_to_eat.model.Meal;
import com.where_to_eat.model.Menu;
import com.where_to_eat.model.Restaurant;
import com.where_to_eat.repository.RepositoryDisk;
import com.where_to_eat.repository.RestaurantRepository;
import com.where_to_eat.service.RestaurantService;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Meal> mealList = new ArrayList<>();
        mealList.add(new Meal("Dinner",100));
        mealList.add(new Meal("Dinner2",200));
        mealList.add(new Meal("Breakfast",300));
        RepositoryDisk repositoryDisk = new RepositoryDisk();
        RestaurantService service = new RestaurantService(repositoryDisk);
        Restaurant restaurant = new Restaurant(1,"Razliv",new Menu(1,mealList));
        service.addRestaurant(restaurant);
        service.addRestaurant(new Restaurant(2,"Razliv2",new Menu(1,mealList)));
        service.addRestaurant(new Restaurant(3,"Razliv3",new Menu(1,mealList)));
        System.out.println(service.getAll());
    }
}
