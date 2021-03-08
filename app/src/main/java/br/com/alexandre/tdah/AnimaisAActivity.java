package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;

public class AnimaisAActivity extends AppCompatActivity {
    public MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animais_a);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.menu_letra_a);
        mp.start();
    }

    public void tocar1A (View view){
        MediaPlayer mp1 = MediaPlayer.create(this, R.raw.som_abelha);
        mp1.start();
    }

    public void tocar2A (View view){
        MediaPlayer mp2 = MediaPlayer.create(this, R.raw.som_aranha);
        mp2.start();
    }

    public void tocar3A (View view){
        MediaPlayer mp3 = MediaPlayer.create(this, R.raw.som_arara);
        mp3.start();
    }

    public void setaanimaise(View view){
        Intent intent = new Intent(this, AnimaisEActivity.class);
        startActivity(intent);
    }
}
