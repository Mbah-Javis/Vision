package com.mbahjavis.vision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Animation animation;
    Button btnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = findViewById(R.id.btnStart);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SelectorActivity.class);
                overridePendingTransition(R.anim.anim_toggle, R.anim.anim_toggle);
                startActivity(intent);
            }
        });

      animation = AnimationUtils.loadAnimation(this, R.anim.load2);

      btnStart.startAnimation(animation);
    }
}
