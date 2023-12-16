package com.abc.xyz.nearbyplaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public abstract class SpleshActivity extends AppCompatActivity {
    TextView NearBy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splesh);
        NearBy = findViewById(R.id.NearBy);
        NearBy.startAnimation(AnimationUtils.loadAnimation(SpleshActivity.this, R.anim.fade_in));


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SpleshActivity.this, MainActivity.class));
                finish();
            }
        }, 3000);
    }
}