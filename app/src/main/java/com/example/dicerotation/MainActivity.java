package com.example.dicerotation;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    protected ImageView diceImage;
    private Random  randNumber=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diceImage=findViewById(R.id.image_view_dice);

        diceImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });

    }

    private void rollDice(){
        int choiceNo=randNumber.nextInt(6);

        switch(choiceNo){

            case 1:diceImage.setImageResource(R.drawable.dice1);
                break;
            case 2:diceImage.setImageResource(R.drawable.dice2);
                break;
            case 3:diceImage.setImageResource(R.drawable.dice3);
                break;
            case 4:diceImage.setImageResource(R.drawable.dice4);
                break;
            case 5:diceImage.setImageResource(R.drawable.dice5);
                break;
            case 6:diceImage.setImageResource(R.drawable.dice6);
                break;
        }
    }
}