package example.codeclan.com.foodtracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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

    }

