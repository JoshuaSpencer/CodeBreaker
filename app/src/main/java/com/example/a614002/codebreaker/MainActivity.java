package com.example.a614002.codebreaker;

import android.content.DialogInterface;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Button btnStart = (Button) findViewById(R.id.status);
        btnStart.setOnClickListener(new View.OnClickListener());
            public void onClick(View arg0) {
                // TODO Here I should generate the random code
                // I created the toast to see if it worked
                Toast.makeText(MainActivity.this, " start click", Toast.LENGTH_LONG).show();

            }
}
