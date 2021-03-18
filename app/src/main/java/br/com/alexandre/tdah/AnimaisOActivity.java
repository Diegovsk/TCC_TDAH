package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class AnimaisOActivity extends AppCompatActivity {
    public MediaPlayer mp;
    public MediaPlayer mpp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animais_o);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.menu_letra_o);
        mp.start();
    }

    public void tocar1O (View view){
        MediaPlayer mp1 = MediaPlayer.create(this, R.raw.som_onca);
        mp1.start();
    }

    public void tocar2O (View view){
        MediaPlayer mp2 = MediaPlayer.create(this, R.raw.som_orang);
        mp2.start();
    }

    public void setaanimaisu(View view){
        MediaPlayer mpp = MediaPlayer.create(this, R.raw.click);
        mpp.start();

        Intent intent = new Intent(this,AnimaisUActivity.class);
        startActivity(intent);
    }
}
