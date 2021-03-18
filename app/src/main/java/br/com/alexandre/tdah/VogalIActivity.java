package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class VogalIActivity extends AppCompatActivity {
    public MediaPlayer mp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vogal_i);
        mp = MediaPlayer.create(VogalIActivity.this, R.raw.somboti);
    }

    MediaPlayer mp;

    public void somi (View v){
        mp.start();
    }

    public void setao(View view) {
        Intent intent = new Intent(this, VogalOActivity.class);
        startActivity(intent);

        MediaPlayer mp1 = MediaPlayer.create(this, R.raw.click);
        mp1.start();
    }
}
