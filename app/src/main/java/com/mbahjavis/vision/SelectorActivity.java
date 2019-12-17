package com.mbahjavis.vision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mbahjavis.vision.SpeechToText.SpeechToTextActivity;
import com.mbahjavis.vision.TextToSpeech.TextToSpeechActivity;


public class SelectorActivity extends AppCompatActivity {

    Button detectObject, textToSpeech, speechToText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);

        detectObject = findViewById(R.id.btnObjectDetection);
        textToSpeech = findViewById(R.id.btnTextToSpeech);
        speechToText = findViewById(R.id.btnSpeechToText);

        detectObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectorActivity.this, DetectorActivity.class);
                overridePendingTransition(R.anim.anim_toggle, R.anim.anim_toggle);
                startActivity(intent);
            }
        });

        textToSpeech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectorActivity.this, TextToSpeechActivity.class);
                overridePendingTransition(R.anim.anim_toggle, R.anim.anim_toggle);
                startActivity(intent);
            }
        });

        speechToText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectorActivity.this, SpeechToTextActivity.class);
                overridePendingTransition(R.anim.anim_toggle, R.anim.anim_toggle);
                startActivity(intent);
            }
        });

    }
}
