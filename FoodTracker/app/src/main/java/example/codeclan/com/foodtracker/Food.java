package example.codeclan.com.foodtracker;

/**
 * Created by user on AD 2017/4/20.
 */

public class Food {

    private FoodDayEnum day;
    private FoodMealtimeEnum mealTime;
    private String dish;

    public Food(FoodDayEnum day, FoodMealtimeEnum mealTime, String dish) {
        this.day = day;
        this.mealTime = mealTime;
        this.dish = dish;

}

    public FoodDayEnum getDay() {
        return day;
    }
    public FoodMealtimeEnum getMealTime() {
        return mealTime;
    }
    public String getDish() { return dish;  }



}

