package example.codeclan.com.foodtracker;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by user on AD 2017/4/20.
 */

public class FoodListAdapter extends ArrayAdapter<Food> {

    public FoodListAdapter(Context context, ArrayList<Food> food){
        super(context, 0, food);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.layout, parent, false);
        }

        Food currentFood = getItem(position);

        TextView day = (TextView) listItemView.findViewById(R.id.mealTime);
        day.setText(currentFood.getMealTime().toString());

//        TextView mealTime = (TextView) listItemView.findViewById(R.id.mealTime);
//        mealTime.setText(currentFood.getMealTime().toString());

        TextView dish = (TextView) listItemView.findViewById(R.id.dish);
        dish.setText(currentFood.getDish().toString());

        Button deleteButton = (Button) listItemView.findViewById(R.id.delete_button);
        deleteButton.setTag(currentFood);

        listItemView.setTag(currentFood);


        return listItemView;



    }
}
