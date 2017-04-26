package example.codeclan.com.foodtracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on AD 2017/4/20.
 */

public class DayAdaptor extends ArrayAdapter<FoodDayEnum> {

    public DayAdaptor(Context context, ArrayList<FoodDayEnum> food){
        super(context, 0, food);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.day, parent, false);
        }

        FoodDayEnum foodday = (FoodDayEnum) getItem(position);

        TextView day = (TextView) listItemView.findViewById(R.id.day_name);
        day.setText(foodday.toString());


        listItemView.setTag(foodday);


        return listItemView;



    }
}
