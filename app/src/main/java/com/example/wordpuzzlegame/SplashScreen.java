package com.example.wordpuzzlegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        thread.start();
    }
    public void doWork() {
        for(int i=10; i<=30; i+=10) {
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                Toast.makeText(getApplicationContext(),"Application Error!",Toast.LENGTH_SHORT).show();
            }
        }
    }
}