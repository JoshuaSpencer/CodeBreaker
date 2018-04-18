package com.example.a614002.codebreaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class GameActivity extends AppCompatActivity {

    TextView randomText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        randomText = (TextView)findViewById(R.id.randomTextView);
    }


    public void randomButton(View view){
        //Random code test
        Random randomNumber = new Random();
        int randomInt = randomNumber.nextInt(50);
        randomText.setText(randomInt);

    }
}