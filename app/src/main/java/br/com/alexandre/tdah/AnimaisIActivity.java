package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;

public class AnimaisIActivity extends AppCompatActivity {
    private MediaPlayer mp;
    public MediaPlayer mpp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animais_i);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.menu_letra_i);
        mp.start();
    }

    public void tocar1I (View view){
        MediaPlayer mp1 = MediaPlayer.create(this, R.raw.som_iguana);
        mp1.start();
    }


    public void setaanimaiso(View view){
        MediaPlayer mpp = MediaPlayer.create(this, R.raw.click);
        mpp.start();

        Intent intent = new Intent(this, AnimaisOActivity.class);
        startActivity(intent);
    }
}
