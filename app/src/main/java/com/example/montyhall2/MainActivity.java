package com.example.montyhall2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.montyhall2.Activity2;
import com.example.montyhall2.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


    }
    public void goToA2(View view){
        Intent intent= new Intent(MainActivity.this, Activity2.class);
        startActivity(intent);
        finish();
    }


}
