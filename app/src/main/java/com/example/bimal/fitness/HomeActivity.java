package com.example.bimal.fitness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView exercise1,diet1,advice1,help1,about1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        // defining cards
        exercise1 = (CardView) findViewById(R.id.exercise);
        diet1 = (CardView) findViewById(R.id.diet);
        advice1 = (CardView) findViewById(R.id.advice);
        help1 = (CardView) findViewById(R.id.help);
        about1 = (CardView) findViewById(R.id.about);
        //Add Click listener to the cards
        exercise1.setOnClickListener(this);
        diet1.setOnClickListener(this);
        advice1.setOnClickListener(this);
        help1.setOnClickListener(this);
        about1.setOnClickListener(this);
    }
    @Override
    public void  onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.exercise :i = new Intent(this,Exercises.class);startActivity(i);break;
            case R.id.diet :i = new Intent(this,Diet.class);startActivity(i);break;
            case R.id.advice :i = new Intent(this,Advice.class);startActivity(i);break;
            case R.id.help :i = new Intent(this,Help.class);startActivity(i);break;
            case R.id.about :i = new Intent(this,About.class);startActivity(i);break;
            default:break;
        }
    }
}
