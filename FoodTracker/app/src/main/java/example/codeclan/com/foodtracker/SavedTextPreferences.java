package example.codeclan.com.foodtracker;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Array;
import java.util.ArrayList;


/**
 * Created by user on AD 2017/4/24.
 */

public class SavedTextPreferences {
    private static final String PREF_SAVEDTEXT = "savedText";

    public static void setStoredText(Context context, String text) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);

        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(PREF_SAVEDTEXT, text);
        editor.apply();
    }

    public static String getStoredText(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return sharedPreferences.getString(PREF_SAVEDTEXT, null);



    }


    public static void storeFood(Context context, Food food) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);

        SharedPreferences.Editor editor = sharedPreferences.edit();

        ArrayList<Food> allFood = getAllFoods(context);

        allFood.add(food);

        Gson gson = new Gson();

        String foodAsString = gson.toJson(allFood);

        editor.putString("Food", foodAsString);
        editor.apply();
    }

    public static ArrayList<Food> getAllFoods(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);

        String allFoodAsJson = sharedPreferences.getString("Food", null);

        if(allFoodAsJson == null) {
            return new ArrayList<Food>();
        }

        Gson gson = new Gson();
        TypeToken<ArrayList<Food>> typeToken = new TypeToken<ArrayList<Food>>(){};

        ArrayList<Food> allFoods = gson.fromJson(allFoodAsJson, typeToken.getType());

        return allFoods;
    }
}

