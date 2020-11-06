package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class VogalOActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vogal_o);
        mp = MediaPlayer.create(VogalOActivity.this, R.raw.somboto);
    }

    MediaPlayer mp;

    public void somo (View v){
        mp.start();
    }

    public void setau(View view){
        Intent intent = new Intent(this, VogalUActivity.class);
        startActivity(intent);
    }
}
