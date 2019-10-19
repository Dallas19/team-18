package com.example.canineassistants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class DogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog);
    }

    public void leftPath(View view){
        hideButtons();
        TextView text = (TextView) findViewById(R.id.textId);

        text.setText("I need more food/water!");

        text.setVisibility(View.VISIBLE);

    }

    public void rightPath(View view){
        hideButtons();

        TextView text = (TextView) findViewById(R.id.textId);

        text.setText("I would like to play!");
        text.setVisibility(View.VISIBLE);
    }

    public void hideButtons(){
        ImageButton foodButton = findViewById(R.id.foodId);
        ImageButton playButton = findViewById(R.id.playId);

        foodButton.setVisibility(View.GONE);
        playButton.setVisibility(View.GONE);
    }
}
