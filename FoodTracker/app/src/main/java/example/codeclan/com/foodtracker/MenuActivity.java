package example.codeclan.com.foodtracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by user on 24/04/2017.
 */

public class MenuActivity extends AppCompatActivity {
    EditText textToSaveDish;
    Spinner textToSaveMealTime;
    Spinner textToSaveDate;
    Button saveButton;
    TextView savedText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_post);

        textToSaveDish = (EditText) findViewById(R.id.new_post_dish);
        textToSaveMealTime = (Spinner) findViewById(R.id.new_post_mealTime);
        textToSaveDate = (Spinner) findViewById(R.id.new_post_date);
        saveButton = (Button) findViewById(R.id.save_button);
        savedText = (TextView) findViewById(R.id.saved_post);
        savedText.setVisibility(View.INVISIBLE);

        String returnedText = SavedTextPreferences.getStoredText(this);

        if (returnedText != null) {
//            saveButton.setVisibility(View.INVISIBLE);
//            textToSave.setVisibility(View.INVISIBLE);
            savedText.setVisibility(View.INVISIBLE);
            savedText.setText(returnedText);

        }


        Spinner mealDropdown = (Spinner)findViewById(R.id.new_post_mealTime);
        FoodMealtimeEnum[] items = new FoodMealtimeEnum[]{FoodMealtimeEnum.BREAKFAST, FoodMealtimeEnum.LUNCH, FoodMealtimeEnum.DINNER, FoodMealtimeEnum.SNACK};
        ArrayAdapter<FoodMealtimeEnum> mealTimeAdapter = new ArrayAdapter<FoodMealtimeEnum>(this, R.layout.support_simple_spinner_dropdown_item, items);
        mealDropdown.setAdapter(mealTimeAdapter);



        Spinner dropdown = (Spinner)findViewById(R.id.new_post_date);
        FoodDayEnum[] dayItems = new FoodDayEnum[]{FoodDayEnum.MONDAY, FoodDayEnum.TUESDAY,FoodDayEnum.WEDNESDAY,FoodDayEnum.THURSDAY,FoodDayEnum.FRIDAY,FoodDayEnum.SATURDAY,FoodDayEnum.SUNDAY,};
        ArrayAdapter<FoodDayEnum> dayAdapter = new ArrayAdapter<FoodDayEnum>(this, R.layout.support_simple_spinner_dropdown_item, dayItems);
        dropdown.setAdapter(dayAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == R.id.menu){
            Toast.makeText(MenuActivity.this, R.string.menu, Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);

    }



    public void onSaveButtonClick(View view) {
        String stringToSaveDish = textToSaveDish.getText().toString();
        String stringToSaveMealtime = textToSaveMealTime.getSelectedItem().toString();
        String stringToSaveDate = textToSaveDate.getSelectedItem().toString();
        Log.d("PersistenceExample:", "Save Button Clicked!");
        Log.d("PersistenceExample:", "The dish to save is: '" + textToSaveDish + "'");
//        saveButton.setVisibility(View.INVISIBLE);
//        textToSave.setVisibility(View.INVISIBLE);
//        savedText.setVisibility(View.VISIBLE);

        Food food = new Food(Enum.valueOf(FoodDayEnum.class,  stringToSaveDate), Enum.valueOf(FoodMealtimeEnum.class, stringToSaveMealtime), stringToSaveDish);

        SavedTextPreferences.storeFood(this, food);


        //goback
        Intent intent = new Intent(MenuActivity.this,FoodListActivity.class);
        startActivity(intent);


    }

}

