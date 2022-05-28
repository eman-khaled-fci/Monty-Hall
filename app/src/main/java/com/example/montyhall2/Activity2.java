package com.example.montyhall2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


    }



    public void goToA3(View view) {

        CheckBox hintCheckBox = (CheckBox) findViewById(R.id.hint);
        boolean hasChecked = hintCheckBox.isChecked();
        if (hasChecked) {

            Intent intent = new Intent(Activity2.this, Activity3.class);
            startActivity(intent);
            finish();
        }
        if (hasChecked == false) {

            Intent intent = new Intent(Activity2.this, Activity4.class);
            startActivity(intent);
            finish();


            }
        }
        public void test(View view){
            CheckBox hintCheckBox = (CheckBox) findViewById(R.id.hint);
            boolean hasChecked = hintCheckBox.isChecked();
            if (hasChecked) {

                Intent intent = new Intent(Activity2.this, Activity3.class);
                startActivity(intent);
                finish();
            }
            if (hasChecked == false) {

                Intent intent = new Intent(Activity2.this, Activity5.class);
                startActivity(intent);
                finish();


            }

    }
}

























