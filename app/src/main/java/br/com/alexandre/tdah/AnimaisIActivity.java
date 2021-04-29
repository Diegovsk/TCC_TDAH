package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;

public class AnimaisIActivity extends AppCompatActivity {
    public MediaPlayer mpmenu;
    private MediaPlayer mp1;
    public MediaPlayer mpseta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animais_i);
        mpmenu = MediaPlayer.create(this, R.raw.menu_letra_i);
        mpmenu.start();
    }

    public void tocar1I(View view) {
        if (mpmenu != null) {
            mpmenu.pause();
            mp1 = MediaPlayer.create(this, R.raw.som_iguana);
            mp1.start();
        }
    }


    public void setaanimaiso(View view) {
        if (mp1 != null) {
            mp1.pause();
            mpseta = MediaPlayer.create(this, R.raw.click);
            mpseta.start();
        }else{
            Intent intent = new Intent(this, AnimaisOActivity.class);
            startActivity(intent);
        }
    }
}
