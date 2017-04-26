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

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on AD 2017/4/20.
 */

    public class DaysActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.days);

        ListView listView = (ListView) findViewById(R.id.days_list);


        FoodDayEnum[] days = FoodDayEnum.values();

        ArrayList<FoodDayEnum> foodDays =  new ArrayList<FoodDayEnum>(Arrays.asList(days));

        DayAdaptor dayAdaptor = new DayAdaptor(this, foodDays);

        listView.setAdapter(dayAdaptor);
//            FoodList foodList = new FoodList();
//            ArrayList<Food> list = foodList.getList();


    }

    public void clickedDay(View view) {
        Intent intent = new Intent(this, FoodListActivity.class);
        intent.putExtra("DaySelect", view.getTag().toString());
        startActivity(intent);
    }

}

