package com.example.montyhall2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }

        public void onClick1(View view) {



                Intent intent = new Intent(Activity3.this, Activity4.class);
                startActivity(intent);
                finish();
            }
    public void onClick3(View view) {



        Intent intent = new Intent(Activity3.this, Activity5.class);
        startActivity(intent);
        finish();
    }


        }


