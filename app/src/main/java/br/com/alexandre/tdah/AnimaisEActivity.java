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
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animais_e);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.menu_letra_e);
        mp.start();
    }

    public void tocar1E(View view){
        MediaPlayer mp1 = MediaPlayer.create(this, R.raw.som_elefante);
        mp1.start();
    }

    public void tocar2E (View view){
        MediaPlayer mp2 = MediaPlayer.create(this, R.raw.som_esquilo);
        mp2.start();
    }

    public void tocar3E (View view){
        MediaPlayer mp3 = MediaPlayer.create(this, R.raw.som_estreladm);
        mp3.start();
    }

    public void setaanimaisi(View view){
        Intent intent = new Intent(this, AnimaisIActivity.class);
        startActivity(intent);
    }
}
