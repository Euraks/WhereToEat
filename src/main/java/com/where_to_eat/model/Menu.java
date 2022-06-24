/**
 * @author @Euraks 24.06.2022
 */
package com.where_to_eat.model;

import java.util.List;

public class Menu {
    private Integer number;
    private List<Meal> mealList;

    public Menu(Integer number, List<Meal> mealList) {
        this.number = number;
        this.mealList = mealList;
    }
}
