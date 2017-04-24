package example.codeclan.com.foodtracker;

import java.util.ArrayList;

/**
 * Created by user on AD 2017/4/20.
 */

public class FoodList {

    private ArrayList<Food> list;

    public FoodList() {
        list = new ArrayList<Food>();
        list.add(new Food(1, "Breakfast", "Muesli"));
        list.add(new Food(1, "Lunch", "Sandwich"));
        list.add(new Food(1, "Dinner", "Steak & Chips"));
        list.add(new Food(1, "Snack", "Crisps"));

        list.add(new Food(2, "Breakfast", "Bacon & Eggs"));
        list.add(new Food(2, "Lunch", "Lasagna"));
        list.add(new Food(2, "Dinner", "Fish & Chips"));
        list.add(new Food(2, "Snack", "Nuts"));

    }

    public ArrayList<Food> getList() {
        return new ArrayList<Food>(list);
    }

}