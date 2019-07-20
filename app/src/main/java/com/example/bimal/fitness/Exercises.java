package com.example.bimal.fitness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Exercises extends AppCompatActivity implements View.OnClickListener{
    private CardView chest1,back1,bicep1,tricep1,shoulder1,legs1,abs1,cardio1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);
        // defining cards
        chest1 = (CardView) findViewById(R.id.chest);
        back1 = (CardView) findViewById(R.id.back);
        bicep1 = (CardView) findViewById(R.id.bicep);
        tricep1 = (CardView) findViewById(R.id.tricep);
        shoulder1 = (CardView) findViewById(R.id.shoulder);
        legs1 = (CardView) findViewById(R.id.legs);
        abs1= (CardView) findViewById(R.id.abs);
        cardio1= (CardView) findViewById(R.id.cardio);
        //Add Click listener to the cards
        chest1.setOnClickListener(this);
        back1.setOnClickListener(this);
        bicep1.setOnClickListener(this);
        tricep1.setOnClickListener(this);
        shoulder1.setOnClickListener(this);
        legs1.setOnClickListener(this);
        abs1.setOnClickListener(this);
        cardio1.setOnClickListener(this);
    }
    @Override
    public void  onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.chest :i = new Intent(this,Chest.class);startActivity(i);break;
            case R.id.back :i = new Intent(this,Back.class);startActivity(i);break;
            case R.id.bicep :i = new Intent(this,Bicep.class);startActivity(i);break;
            case R.id.tricep :i = new Intent(this,Tricep.class);startActivity(i);break;
            case R.id.shoulder :i = new Intent(this,Shoulder.class);startActivity(i);break;
            case R.id.legs :i = new Intent(this,Legs.class);startActivity(i);break;
            case R.id.abs :i = new Intent(this,Abs.class);startActivity(i);break;
            case R.id.cardio :i = new Intent(this,Cardio.class);startActivity(i);break;
            default:break;
        }
    }
}
