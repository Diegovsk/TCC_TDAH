package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class AnimaisUActivity extends AppCompatActivity {
    public MediaPlayer mpmenu;
    public MediaPlayer mp1;
    public MediaPlayer mp2;
    public MediaPlayer mpseta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animais_u);
        mpmenu = MediaPlayer.create(this, R.raw.menu_letra_u);
        mpmenu.start();
    }

    public void tocar1U (View view){
        if (mpmenu != null) {
            mpmenu.pause();
            mp1 = MediaPlayer.create(this, R.raw.som_urso);
            mp1.start();
        }
    }

    public void tocar2U (View view){
        if (mp1 != null) {
            mp1.pause();
            mp2 = MediaPlayer.create(this, R.raw.som_urubu);
            mp2.start();
        }
    }

    public void setamenu2(View view){
        mpmenu.pause();
        if (mp2 != null) {
            mp2.pause();
            mpseta = MediaPlayer.create(this, R.raw.click);
            mpseta.start();
        }
            ImageView ii = new ImageView(getApplicationContext());
            ii.setImageResource(R.drawable.confirm);

            Toast toast = new Toast(getApplicationContext());
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(ii);
            toast.show();

            Intent intent = new Intent(this, MenuActivity.class);
            startActivity(intent);
        }

    public void onDestroy() {
        super.onDestroy();
        if (mpmenu != null) {
            mpmenu.release();
        }
    }
    }

