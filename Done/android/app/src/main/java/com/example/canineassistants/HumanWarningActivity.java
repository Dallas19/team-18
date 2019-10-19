package com.example.canineassistants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.provider.MediaStore;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Locale;

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
        Intent intent = new Intent(Intent.ACTION_DIAL);

        startActivity(intent);
        //AudioManager audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
    }

    public void rightPath(View view){
        hideButtons();

        TextView text = (TextView) findViewById(R.id.textId);

        text.setText("Warning! You're about to have a seizure");
        text.setVisibility(View.VISIBLE);
    }

    public void hideButtons(){
        ImageButton emergencyButton = (ImageButton) findViewById(R.id.emergId);
        ImageButton seizureButton = (ImageButton) findViewById(R.id.warnId);

        emergencyButton.setVisibility(View.GONE);
        seizureButton.setVisibility(View.GONE);
    }
}
