package com.example.android.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int count = 0;

    public void slide(View v) {
        setContentView(R.layout.slide_1);
    }

    public void slide1(View v) {
        setContentView(R.layout.page1);
        boolean option1 = findViewById(R.id.option11).isChecked();
        if (option1) {
            count++;
        }
/*
        public void onRadioButtonClicked(View view) {
            // Is the button now checked?
            boolean checked = ((RadioButton) view).isChecked();

            // Check which radio button was clicked
            switch(view.getId()) {
                case R.id.radio_pirates:
                    if (checked)
                        // Pirates are the best
                        break;
                case R.id.radio_ninjas:
                    if (checked)
                        // Ninjas rule
                        break;
            }
        }*/
        score(count);
    }

    public void slide2(View v) {
        setContentView(R.layout.page2);
        /*boolean option21 = ((RadioButton) v).isChecked();
        if (option21) {
            count++;
        }*/
    }

    public void slide3(View v) {
        setContentView(R.layout.page3);
      /*  boolean option31 = ((RadioButton) v).isChecked();
        if (option31) {
            count++;
        }*/
    }

    public void answers(View v) {
        setContentView(R.layout.answer);
    }

   /* public void points(View v) {
        boolean option11 = ((RadioButton) v).isChecked();
        if(option11){
            count ++;
        }
    }*/
   /*public void score(int points) {
       TextView point = (TextView) findViewById(R.id.score);
       point.setText(points);
   }*/

}
