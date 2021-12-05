package com.example.wordpuzzlegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PlayModeSelect extends AppCompatActivity {

    int playMode;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_mode_select);
        intent = new Intent(PlayModeSelect.this, TimeSelection.class);
    }

    public void extremelyEasy(View view) {
        System.out.println("Extremely Easy Mode Selected");
        playMode = 0;
        intent.putExtra("playMode", playMode);
        startActivity(intent);
    }
    public void veryEasy(View view) {
        System.out.println("Very Easy Mode Selected");
        playMode = 1;
        intent.putExtra("playMode", playMode);
        startActivity(intent);
    }
    public void easy(View view) {
        System.out.println("Easy Mode Selected");
        playMode = 2;
        intent.putExtra("playMode", playMode);
        startActivity(intent);
    }
    public void medium(View view) {
        System.out.println("Medium Mode Selected");
        playMode = 3;
        intent.putExtra("playMode", playMode);
        startActivity(intent);
    }
    public void difficult(View view) {
        System.out.println("Difficult Mode Selected");
        playMode = 4;
        intent.putExtra("playMode", playMode);
        startActivity(intent);
    }
    public void veryDifficult(View view) {
        System.out.println("Very Difficult Mode Selected");
        playMode = 5;
        intent.putExtra("playMode", playMode);
        startActivity(intent);
    }
    public void extremelyDifficult(View view) {
        System.out.println("Extremely Difficult Mode Selected");
        playMode = 6;
        intent.putExtra("playMode", playMode);
        startActivity(intent);
    }
}