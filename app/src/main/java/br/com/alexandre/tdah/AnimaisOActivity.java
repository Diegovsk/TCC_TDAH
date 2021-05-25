package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class AnimaisOActivity extends AppCompatActivity {
    public MediaPlayer mpmenu;
    public MediaPlayer mp1;
    public MediaPlayer mp2;
    public MediaPlayer mpseta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animais_o);
        mpmenu = MediaPlayer.create(this, R.raw.menu_letra_o);
        mpmenu.start();
    }

    public void tocar1O (View view){
        if (mpmenu != null) {
            mpmenu.pause();
            mp1 = MediaPlayer.create(this, R.raw.som_onca);
            mp1.start();
        }
    }

    public void tocar2O (View view) {
        if (mp1 != null) {
            mp1.pause();
            mp2 = MediaPlayer.create(this, R.raw.som_orang);
            mp2.start();
        }
    }

    public void setaanimaisu(View view){
        mpmenu.pause();
        if (mp2 != null) {
            mp2.pause();
            mpseta = MediaPlayer.create(this, R.raw.click);
            mpseta.start();
        }
            Intent intent = new Intent(this, AnimaisUActivity.class);
            startActivity(intent);
        }

    public void onDestroy() {
        super.onDestroy();
        if (mpmenu != null) {
            mpmenu.release();
        }
    }
    }

