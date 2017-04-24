package example.codeclan.com.foodtracker;

import android.content.Intent;
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

            FoodList foodList = new FoodList();
            ArrayList<Food> list = foodList.getList();

            FoodListAdapter foodListAdapter = new FoodListAdapter(this, list);

            ListView listView = (ListView)findViewById(R.id.list);
            listView.setAdapter(foodListAdapter);

        }

        public void getFood(View listItem){
            Food food = (Food) listItem.getTag();
            Log.d("Meal ", food.getMealTime() + "Dish " + food.getDish());

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
    }


