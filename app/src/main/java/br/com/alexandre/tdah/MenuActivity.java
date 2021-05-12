package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {
    public MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void jogarboca(View view){
        Intent intent  = new Intent(this, VogalAActivity.class);
        startActivity(intent);

        MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
    }

    public void jogaranimal(View view){
        Intent intent = new Intent(this, AnimaisAActivity.class);
        startActivity(intent);

        MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
    }

    public void gamevideo(View view){
        Intent intent = new Intent(this, VideoAActivity.class);
        startActivity(intent);

        MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
    }

    public void gameEncVocal(View view){
        Intent intent = new Intent(this, EncVocalActivity.class);
        startActivity(intent);

        MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
    }

    public void info(View view) {
        Intent intent = new Intent(this, MenuInfoActivity.class);
        startActivity(intent);

        MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.transition.mover_esquerda, R.transition.fade_out);
    }
}
