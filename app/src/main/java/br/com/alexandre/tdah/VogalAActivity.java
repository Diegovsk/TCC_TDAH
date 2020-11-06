package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class VogalAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vogal_a);
        mp = MediaPlayer.create(VogalAActivity.this, R.raw.sombota);
    }

    MediaPlayer mp;

    public void somaa (View v){
        mp.start();
    }

    public void setae(View view){
        Intent intent = new Intent(this, VogalEActivity.class);
        startActivity(intent);
    }
}

