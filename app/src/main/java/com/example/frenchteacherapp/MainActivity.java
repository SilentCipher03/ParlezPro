package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;


import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button blackbtn, greenbtn, redbtn, purplebtn, yellowbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blackbtn = findViewById(R.id.black);
        greenbtn = findViewById(R.id.green);
        purplebtn = findViewById(R.id.purple);
        redbtn = findViewById(R.id.red);
        yellowbtn = findViewById(R.id.yellow);


        blackbtn.setOnClickListener(this);
        greenbtn.setOnClickListener(this);
        purplebtn.setOnClickListener(this);
        redbtn.setOnClickListener(this);
        yellowbtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        int clickedbtnid = view.getId();

        if (clickedbtnid == R.id.red) {
            PlaySounds(R.raw.red);
        } else if (clickedbtnid == R.id.black) {
            PlaySounds(R.raw.black);
        } else if (clickedbtnid == R.id.green) {
            PlaySounds(R.raw.green);
        } else if (clickedbtnid == R.id.purple) {
            PlaySounds(R.raw.purple);
        } else if(clickedbtnid == R.id.yellow) {
            PlaySounds(R.raw.yellow);
        }

    }


    public void PlaySounds(int id){
        MediaPlayer mediaPlayer = MediaPlayer.create(
                this,
                id
        );
        mediaPlayer.start();
    }
}