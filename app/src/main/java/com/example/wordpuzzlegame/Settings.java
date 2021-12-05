package com.example.wordpuzzlegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void backIcon (View view) {
        System.out.println("backIcon Clicked");
        onBackPressed();
    }

    public void helpIcon (View view) {
        System.out.println("helpIcon Clicked");
    }

    public void languageIcon (View view) {
        System.out.println("languageIcon Clicked");
    }

    public void soundIcon (View view) {
        System.out.println("soundIcon Clicked");
    }

    public void nightMode (View view) {
        System.out.println("nightMode Clicked");
    }

    public void gridIcon (View view) {
        System.out.println("gridIcon Clicked");
    }

    public void marqueeIcon (View view) {
        System.out.println("marqueeIcon Clicked");
    }

    public void letterAnimationIcon (View view) {
        System.out.println("letterAnimationIcon Clicked");
    }

    public void noOfWordColumnIcon (View view) {
        System.out.println("noOfWordColumnIcon Clicked");
    }

    public void logoutIcon (View view) {
        System.out.println("logoutIcon Clicked");
    }

    public void privacyIcon (View view) {
        System.out.println("privacyIcon Clicked");
    }


}