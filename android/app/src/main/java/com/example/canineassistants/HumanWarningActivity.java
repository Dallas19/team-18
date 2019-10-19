package com.example.canineassistants;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HumanWarningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human_warning);
    }

    public void leftPath(View view){
        hideButtons();
        TextView text = (TextView) findViewById(R.id.textId);

        text.setText("Calling Emergency Number...");

        text.setVisibility(View.VISIBLE);

    }

    public void rightPath(View view){
        hideButtons();

        TextView text = (TextView) findViewById(R.id.textId);

        text.setText("Warning! You're about to have a seizure");
        text.setVisibility(View.VISIBLE);
    }

    public void hideButtons(){
        Button emergencyButton = (Button) findViewById(R.id.emergId);
        Button seizureButton = (Button) findViewById(R.id.warnId);

        emergencyButton.setVisibility(View.GONE);
        seizureButton.setVisibility(View.GONE);
    }
}
