package com.example.a614002.codebreaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class GameActivity extends AppCompatActivity {

    TextView randomText;
    Button randomButton;

    int max = 50;
    int min = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        randomText = findViewById(R.id.randomTextView);
        randomButton = findViewById(R.id.randomButton);
    }

    public void randomButton(View view){
        //Random code test
        Random randomNumber = new Random();
        int randomInt = randomNumber.nextInt((max - min) + 1) + min;
        randomText.setText(randomInt);
    }
}