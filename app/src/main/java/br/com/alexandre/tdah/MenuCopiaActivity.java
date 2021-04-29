package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MenuCopiaActivity extends AppCompatActivity {
    public MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_copia);
    }

    public void setamenureal (View view){
        Intent intent  = new Intent(this, MenuActivity.class);
        ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),R.transition.fade_in, R.transition.mover_direita);
        ActivityCompat.startActivity(MenuCopiaActivity.this, intent, activityOptionsCompat.toBundle());

        MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
    }


    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.transition.mover_esquerda, R.transition.fade_out);
    }
}