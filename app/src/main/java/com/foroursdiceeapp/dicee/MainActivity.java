package com.foroursdiceeapp.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button rollButton;
    ImageView leftDice, rightDice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollButton = (Button)findViewById(R.id.roll_button);

        leftDice = (ImageView) findViewById(R.id.dicee_left);
        rightDice = (ImageView) findViewById(R.id.dicee_right);

        final int [] dicees = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random grNumber = new Random();

                int number = grNumber.nextInt(6);
                leftDice.setImageResource(dicees[number]);

                number = grNumber.nextInt(6);
                rightDice.setImageResource(dicees[number]);
            }
        });

    }
}
