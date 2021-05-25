package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;
import android.widget.ImageView;
import android.widget.Toast;

public class AnimaisAActivity extends AppCompatActivity {
    public MediaPlayer mpmenu;
    public MediaPlayer mp1;
    public MediaPlayer mp2;
    public MediaPlayer mp3;
    public MediaPlayer mpseta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animais_a);
        mpmenu = MediaPlayer.create(this, R.raw.menu_letra_a);
        mpmenu.start();
    }

    public void tocar1A (View view){
        if (mpmenu != null) {
            mpmenu.pause();
            mp1 = MediaPlayer.create(this, R.raw.som_abelha);
            mp1.start();
        }
    }

    public void tocar2A (View view){
        if (mp1 != null) {
            mp1.pause();
            mp2 = MediaPlayer.create(this, R.raw.som_aranha);
            mp2.start();
        }
    }

    public void tocar3A (View view){
        if (mp2 != null) {
            mp2.pause();
            mp3 = MediaPlayer.create(this, R.raw.som_arara);
            mp3.start();
        }
    }

    public void setaanimaise(View view){
        mpmenu.pause();
        if (mp3 != null) {
            mp3.pause();
            mpseta = MediaPlayer.create(this, R.raw.click);
            mpseta.start();
        }
            Intent intent = new Intent(this, AnimaisEActivity.class);
            startActivity(intent);
        }

    public void onDestroy() {
        super.onDestroy();
        if (mpmenu != null) {
            mpmenu.release();
        }
    }
    }


