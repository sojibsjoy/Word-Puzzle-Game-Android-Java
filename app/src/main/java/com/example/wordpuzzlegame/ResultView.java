package com.example.wordpuzzlegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;

import nl.dionsegijn.konfetti.KonfettiView;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;

public class ResultView extends AppCompatActivity {

    Intent homeIntent;
    KonfettiView konfettiView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_view);
        homeIntent = new Intent(ResultView.this, MainActivity.class);

        konfettiView = findViewById(R.id.viewKonfetti);
        showKonfetti();
    }

    public void showKonfetti() {
        DisplayMetrics display = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(display);
        konfettiView.build()
                .addColors(Color.YELLOW, Color.GREEN, Color.MAGENTA)
                .setDirection(0.0, 359.0)
                .setSpeed(1f, 5f)
                .setFadeOutEnabled(true)
                .setTimeToLive(2000L)
                .addShapes(Shape.Square.INSTANCE, Shape.Circle.INSTANCE)
                .addSizes(new Size(12, 5f))
                .setPosition(-50f, display.widthPixels + 50f, -50f, -50f)
                .streamFor(300, 2500L);

    }

    public void celebrateIcon(View view) {
        System.out.println("Celebrate Icon Clicked");
        showKonfetti();
    }

    public void homeIcon(View view) {
        System.out.println("Home Icon Clicked");
        startActivity(homeIntent);
    }

    public void playAgainButton(View view) {
        System.out.println("Play Again Button Clicked");
    }
}