package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(this, R.raw.amigoestouaqui);
        mp.start();
        mp.setLooping(true);
        mp.setVolume(14,14);
        }

    public void proximaTela(View view){
        Intent intent  = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}
