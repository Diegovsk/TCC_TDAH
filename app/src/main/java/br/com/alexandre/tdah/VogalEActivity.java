package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class VogalEActivity extends AppCompatActivity {
    public MediaPlayer mp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vogal_e);
        mp = MediaPlayer.create(VogalEActivity.this, R.raw.sombote);
    }

    MediaPlayer mp;

    public void some (View v){
        mp.start();
    }

    public void setai(View view){
        Intent intent = new Intent(this, VogalIActivity.class);
        startActivity(intent);

        MediaPlayer mp1 = MediaPlayer.create(this, R.raw.click);
        mp1.start();
    }
}
