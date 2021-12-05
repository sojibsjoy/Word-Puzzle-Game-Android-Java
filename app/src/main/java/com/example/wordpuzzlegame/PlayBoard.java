package com.example.wordpuzzlegame;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ankushgrover.hourglass.Hourglass;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class PlayBoard extends AppCompatActivity {
    Intent resultIntent;
    ImageView pauseIcon;

    Hourglass hourglass;
    boolean pauseFlag = false;

    int playMode;
    int timeMode;


    TextView timeTextView;
    String timeText;
    long min;
    long sec=0;
    long actualSec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_board);
        timeTextView = findViewById(R.id.timeView);
        pauseIcon = findViewById(R.id.pauseIcon);

        playMode = getIntent().getExtras().getInt("playMode");
        timeMode = getIntent().getExtras().getInt("timeMode");

        resultIntent = new Intent(PlayBoard.this, ResultView.class);
        if(timeMode==0) {
            startCountDown();
        } else {
            startCountUp();
        }
    }

    public void startCountUp() {
        hourglass = new Hourglass(600000, 1000) {
            @Override
            public void onTimerTick(long timeRemaining) {
                if(sec>=10) {
                    timeText = min + ":" + sec;
                } else {
                    timeText = min + ":0" + sec;
                }

                timeTextView.setText(timeText);
                sec += 1;
                if(sec == 60) {
                    min++;
                    sec = 0;
                }
            }

            @Override
            public void onTimerFinish() {
                timeTextView.setText("--:--");
                startActivity(resultIntent);
            }
        };
        hourglass.startTimer();
    }

    public void startCountDown() {
        hourglass = new Hourglass(120000, 1000) {
            @Override
            public void onTimerTick(long millisUntilFinished) {
                min = TimeUnit.MILLISECONDS.toMinutes( millisUntilFinished);
                sec = TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished);
                actualSec = sec - TimeUnit.MINUTES.toSeconds(min);
                if(actualSec<10) {
                    timeText = String.format("0%d:0%d", min, sec - TimeUnit.MINUTES.toSeconds(min));
                } else {
                    timeText = String.format("0%d:%d", min, actualSec);
                }

                timeTextView.setText(timeText);
            }

            @Override
            public void onTimerFinish() {
                timeTextView.setText("--:--");
                startActivity(resultIntent);
            }
        };
        hourglass.startTimer();
    }

    public void pauseView(View view) {
        System.out.println("Pause Menu Clicked");
        pauseFlag = !pauseFlag;
        if (pauseFlag) {
            hourglass.pauseTimer();
            pauseIcon.setImageResource(R.drawable.play);
        } else {
            hourglass.resumeTimer();
            pauseIcon.setImageResource(R.drawable.pause);
        }
    }

    public void backSpace(View view) {
        System.out.println("Backspace Clicked");

    }

    public void tempWordReset(View view) {
        System.out.println("Reset Icon Clicked");

    }
    public void helpIcon(View view) {
        System.out.println("Help Icon Clicked");

    }
    public void hintIcon(View view) {
        System.out.println("Hint Icon Clicked");
    }
    public void settingsIcon(View view) {
        System.out.println("Settings Icon Clicked");

    }
}