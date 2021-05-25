package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;
import android.media.MediaPlayer;

public class AnimaisEActivity extends AppCompatActivity {
    public MediaPlayer mpmenu;
    public MediaPlayer mp1;
    public MediaPlayer mp2;
    public MediaPlayer mp3;
    public MediaPlayer mpseta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animais_e);
        mpmenu = MediaPlayer.create(this, R.raw.menu_letra_e);
        mpmenu.start();
    }

    public void tocar1E(View view) {
        if (mpmenu != null) {
            mpmenu.pause();
            mp1 = MediaPlayer.create(this, R.raw.som_elefante);
            mp1.start();
        }
    }

    public void tocar2E(View view) {
        if (mp1 != null) {
            mp1.pause();
            mp2 = MediaPlayer.create(this, R.raw.som_esquilo);
            mp2.start();
        }
    }

    public void tocar3E(View view) {
        if (mp2 != null) {
            mp2.pause();
            mp3 = MediaPlayer.create(this, R.raw.som_estreladm);
            mp3.start();
        }
    }

    public void setaanimaisi(View view) {
        mpmenu.pause();
        if (mp3 != null) {
            mp3.pause();
            mpseta = MediaPlayer.create(this, R.raw.click);
            mpseta.start();
        }
        Intent intent = new Intent(this, AnimaisIActivity.class);
        startActivity(intent);
    }

    public void onDestroy() {
        super.onDestroy();
        if (mpmenu != null) {
            mpmenu.release();
        }
    }
}

