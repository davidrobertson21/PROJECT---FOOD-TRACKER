package example.codeclan.com.foodtracker;

/**
 * Created by user on AD 2017/4/20.
 */

public class Food {

    private FoodDayEnum day;
    private FoodMealtimeEnum mealTime;
    private String dish;

    public Food(Integer day, FoodMealtimeEnum mealTime, FoodDayEnum dish) {
        this.day = day;
        this.mealTime = mealTime;
        this.dish = dish;

}

    public Integer getDay() {
        return day;
    }

    public String getMealTime() {
        return mealTime;
    }

    public String getDish() { return dish;  }

    

}

