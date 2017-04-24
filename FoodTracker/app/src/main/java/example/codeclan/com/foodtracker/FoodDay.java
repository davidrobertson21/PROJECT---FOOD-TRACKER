package example.codeclan.com.foodtracker;

import java.util.ArrayList;

/**
 * Created by user on 20/04/2017.
 */

public class FoodDay {
    private ArrayList<Food> foods;
    private Integer day;

    public FoodDay(Integer day, ArrayList<Food> foods) {
        this.foods = foods;
        this.day = day;
    }

    public ArrayList<Food> getFoods() {
        return this.foods;
    }

    public Integer getDay() {
        return this.day;
    }
}
