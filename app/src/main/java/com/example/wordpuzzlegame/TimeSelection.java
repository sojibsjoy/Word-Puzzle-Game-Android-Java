package com.example.wordpuzzlegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TimeSelection extends AppCompatActivity {
    int playMode;
    int timeMode;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_selection);
        playMode = getIntent().getExtras().getInt("playMode");
        intent = new Intent(TimeSelection.this, PlayBoard.class);
    }

    public  void limitedTime(View view) {
        System.out.println("Limited Time Selected");
        timeMode = 0;
        intent.putExtra("playMode", playMode);
        intent.putExtra("timeMode", timeMode);
        startActivity(intent);
    }

    public  void unlimitedTime(View view) {
        System.out.println("Unlimited Time Selected");
        timeMode = 1;
        intent.putExtra("playMode", playMode);
        intent.putExtra("timeMode", timeMode);
        startActivity(intent);
    }
}