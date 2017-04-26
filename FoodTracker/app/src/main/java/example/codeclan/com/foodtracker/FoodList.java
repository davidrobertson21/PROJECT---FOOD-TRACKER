package example.codeclan.com.foodtracker;

import java.util.ArrayList;

/**
 * Created by user on AD 2017/4/20.
 */

public class FoodList {

    private ArrayList<Food> list;

    public FoodList() {
        list = new ArrayList<Food>();
        list.add(new Food(FoodDayEnum.MONDAY, FoodMealtimeEnum.BREAKFAST, "Muesli"));
        list.add(new Food(FoodDayEnum.MONDAY, FoodMealtimeEnum.LUNCH, "Sandwich"));
        list.add(new Food(FoodDayEnum.MONDAY, FoodMealtimeEnum.DINNER, "Steak & Chips"));
        list.add(new Food(FoodDayEnum.MONDAY, FoodMealtimeEnum.SNACK, "Crisps"));

        list.add(new Food(FoodDayEnum.TUESDAY, FoodMealtimeEnum.BREAKFAST, "Bacon & Eggs"));
        list.add(new Food(FoodDayEnum.TUESDAY, FoodMealtimeEnum.LUNCH, "Lasagna"));
        list.add(new Food(FoodDayEnum.TUESDAY, FoodMealtimeEnum.DINNER, "Fish & Chips"));
        list.add(new Food(FoodDayEnum.TUESDAY, FoodMealtimeEnum.SNACK, "Nuts"));

    }

    public ArrayList<Food> getList() {
        return new ArrayList<Food>(list);
    }

}