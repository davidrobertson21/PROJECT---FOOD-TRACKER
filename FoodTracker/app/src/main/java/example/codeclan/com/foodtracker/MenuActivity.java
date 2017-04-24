package example.codeclan.com.foodtracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by user on 24/04/2017.
 */

public class MenuActivity extends AppCompatActivity {
    EditText textToSaveDish;
    EditText textToSaveMealTime;
    EditText textToSaveDate;
    Button saveButton;
    TextView savedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_post);

        textToSaveDish = (EditText) findViewById(R.id.new_post_dish);
        textToSaveMealTime = (EditText) findViewById(R.id.new_post_mealTime);
        textToSaveDate = (EditText) findViewById(R.id.new_post_date);
        saveButton = (Button) findViewById(R.id.save_button);
        savedText = (TextView) findViewById(R.id.saved_post);
        savedText.setVisibility(View.INVISIBLE);

        String returnedText = SavedTextPreferences.getStoredText(this);

        if (returnedText != null) {
//            saveButton.setVisibility(View.INVISIBLE);
//            textToSave.setVisibility(View.INVISIBLE);
            savedText.setVisibility(View.VISIBLE);
            savedText.setText(returnedText);

        }

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
        String stringToSave = textToSave.getText().toString();
        Log.d("PersistenceExample:", "Save Button Clicked!");
        Log.d("PersistenceExample:", "The text to save is: '" + textToSave + "'");
//        saveButton.setVisibility(View.INVISIBLE);
//        textToSave.setVisibility(View.INVISIBLE);
//        savedText.setVisibility(View.VISIBLE);
        savedText.setText(stringToSave);

        SavedTextPreferences.setStoredText(this, stringToSave);

    }

}

