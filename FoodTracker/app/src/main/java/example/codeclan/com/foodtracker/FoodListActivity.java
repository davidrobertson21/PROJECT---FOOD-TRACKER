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

import java.util.ArrayList;

/**
 * Created by user on AD 2017/4/20.
 */

    public class FoodListActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.food_list);

//            FoodList foodList = new FoodList();
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
            FoodListAdapter foodListAdapter = new FoodListAdapter(this, list);

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


    }


