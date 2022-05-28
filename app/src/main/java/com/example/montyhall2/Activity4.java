package com.example.montyhall2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
    }
    public void onClick1(View view) {
        Intent intent = new Intent(Activity4.this, Activity4.class);
        startActivity(intent);
        finish();
    }
    public void playAgain(View view) {
        Intent intent = new Intent(Activity4.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}
