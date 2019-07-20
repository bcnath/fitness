package com.example.bimal.fitness;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Window window = getWindow();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.setStatusBarColor(getColor(R.color.mystatusbarColor));
        }
        else
        {
            window.setStatusBarColor(getResources().getColor(R.color.mystatusbarColor));
        }
    }
}
