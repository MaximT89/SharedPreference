package com.example.javatestersomelogic;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreference {

    private static final String PREFS_FILE = "Account";
    public static final String PREF_NAME = "Name";

    public static void saveNameShared(Context context, String name){
        SharedPreferences settings = context.getSharedPreferences(PREFS_FILE, MODE_PRIVATE);
        SharedPreferences.Editor prefEditor = settings.edit();
        prefEditor.putString(PREF_NAME, name);
        prefEditor.apply();
    }

    public static String getNameShared(Context context) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_FILE, MODE_PRIVATE);
        return settings.getString(PREF_NAME,"");
    }
}
