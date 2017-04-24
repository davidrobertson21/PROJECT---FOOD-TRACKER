package example.codeclan.com.foodtracker;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;


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

}

