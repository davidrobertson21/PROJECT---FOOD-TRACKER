package example.codeclan.com.foodtracker;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Movie;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by user on AD 2017/4/20.
 */

    public class FoodListActivity extends AppCompatActivity {

        private FoodDayEnum selectedDay;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.food_list);

            String selected = getIntent().getExtras().getString("DaySelect");

            selectedDay = Enum.valueOf(FoodDayEnum.class, selected);

//           FoodList foodList = new FoodList();
//            ArrayList<Food> list = foodList.getList();




        }

        public void getFood(View listItem){
            Food food = (Food) listItem.getTag();
            Log.d("Meal ", food.getMealTime() + "Dish " + food.getDish() + "Date " + food.getDay());
            Intent intent = new Intent(this, FoodListActivity.class);
            intent.putExtra("Food", food);

            startActivity(intent);

        }

        @Override
        public void onResume() {
            super.onResume();



            ArrayList<Food> list = SavedTextPreferences.getAllFoods(this);

            ArrayList<Food> selectedFood = new ArrayList<>();

            for(Food food : list) {
                if(food.getDay() == selectedDay) {
                    selectedFood.add(food);
                }
            }

            FoodListAdapter foodListAdapter = new FoodListAdapter(this, selectedFood);

            ListView listView = (ListView)findViewById(R.id.list);
            listView.setAdapter(foodListAdapter);
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater menuInflater = getMenuInflater();
            menuInflater.inflate(R.menu.activity_main, menu);
            return true;
        }


        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            Intent intent = new Intent(this, MenuActivity.class);

            startActivity(intent);
            return true;
        }

        public void deleteFood(View button) {
            Food foundFood = (Food) button.getTag();
            Food foodToDelete = null;
            ArrayList<Food> foodList = SavedTextPreferences.getAllFoods(this);
            for (Food food : foodList){
                if(food.getDish().equals(foundFood.getDish()) && food.getMealTime().equals(foundFood.getMealTime())){
                    foodToDelete = food;
                }
            }
            foodList.remove(foodToDelete);
            SavedTextPreferences.storeFoodList(this, foodList);

            Toast.makeText(FoodListActivity.this, R.string.delete, Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, DaysActivity.class);
            startActivity(intent);
        }
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_my);
//        ContactAdapter ca = new ContactAdapter(createContact(20), this);
//        ListView lv = (ListView) findViewById(R.id.contact_list);
//        lv.setAdapter(ca);
    }




//    SharedPreferences sharedPref = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
//    String  = sharedPref.getString("MyFavourites", new ArrayList<Food>().toString());
//    Log.d("Favourites String", FoodListActivity);
//
//    Gson gson = new Gson();
//    TypeToken<ArrayList<Movie>> movieArrayList = new TypeToken<ArrayList<Movie>>(){};
//    ArrayList<Movie> myFavourites = gson.fromJson(favouriteMovies, movieArrayList.getType());
//    Log.d("myFavourites", myFavourites);
//
//    Movie newFavourite = (Movie) getIntent().getSerializableExtra("movie");
//    myFavourites.add(newFavourite);
//    Log.d("myFavourites", myFavourites);

//}


