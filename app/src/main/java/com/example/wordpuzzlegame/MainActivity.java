package com.example.wordpuzzlegame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.StackView;

public class MainActivity extends AppCompatActivity {

    Button playButton;
    Intent intent;
    AlertDialog alertDialog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = findViewById(R.id.play_button);

        alertDialogGenerator();
    }



    @Override
    public void onBackPressed() {
        alertDialog.show();
    }

    public void alertDialogGenerator() {
        alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Exit");
        alertDialog.setMessage("Are you sure want to exit?");
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE,"Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE,"No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        alertDialog.setIcon(android.R.drawable.ic_dialog_alert);
    }

    public void playButtonEvent(View view) {
        // Navigating to SplashScreen
        intent = new Intent(getApplicationContext(), PlayModeSelect.class);
        startActivity(intent);
    }

    public void helpIcon(View view) {
        System.out.println("Help Icon Clicked");
    }

    public void settingsIcon(View view) {
        System.out.println("Settings Icon Clicked");
        intent = new Intent(getApplicationContext(), Settings.class);
        startActivity(intent);
    }

    public void starIcon(View view) {
        System.out.println("Star Icon Clicked");
    }


}