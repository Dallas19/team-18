package com.example.canineassistants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FlowStartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flow_start);
    }

    public void leftPath(View view){
        Intent intent = new Intent(this, HumanWarningActivity.class);
        startActivity(intent);
    }

    public void rightPath(View view){
        Intent intent = new Intent(this, DogActivity.class);
        startActivity(intent);
    }

}