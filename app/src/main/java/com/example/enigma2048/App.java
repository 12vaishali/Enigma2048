package com.example.enigma2048;

import android.app.Application;

import com.google.android.material.color.DynamicColors;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Apply dynamic color
        DynamicColors.applyToActivitiesIfAvailable(this);
    }
}
