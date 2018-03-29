package com.example.a614002.codebreaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    public void randomButton(View view){
        //Random code test
        EditText random = findViewById(R.id.random);

        Random rand = new Random();
        int randomInt = rand.nextInt(50);
        random.setText(randomInt);

    }
}
