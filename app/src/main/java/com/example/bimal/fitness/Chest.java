package com.example.bimal.fitness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Chest extends AppCompatActivity implements View.OnClickListener{
    private CardView benchpress1,inclinebarbellpress1,dumbellpress1,inclinedumbellpress1,cablecrossover1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);
        // defining cards
        benchpress1 = (CardView) findViewById(R.id.benchpress);
        inclinebarbellpress1 = (CardView) findViewById(R.id.inclinebarbellpress);
        dumbellpress1 = (CardView) findViewById(R.id.dumbellpress);
        inclinedumbellpress1 = (CardView) findViewById(R.id.inclinedumbellpress);
        cablecrossover1 = (CardView) findViewById(R.id.cablecrossover);

        //Add Click listener to the cards
        benchpress1.setOnClickListener(this);
        inclinebarbellpress1.setOnClickListener(this);
        dumbellpress1.setOnClickListener(this);
        inclinedumbellpress1.setOnClickListener(this);
        cablecrossover1.setOnClickListener(this);
    }
    @Override
    public void  onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.benchpress :i = new Intent(this,benchpress.class);startActivity(i);break;
            case R.id.inclinebarbellpress :i = new Intent(this,Back.class);startActivity(i);break;
            case R.id.dumbellpress :i = new Intent(this,Bicep.class);startActivity(i);break;
            case R.id.inclinedumbellpress :i = new Intent(this,Tricep.class);startActivity(i);break;
            case R.id.cablecrossover :i = new Intent(this,Shoulder.class);startActivity(i);break;
            default:break;
        }
    }
}
