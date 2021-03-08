package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class AnimaisUActivity extends AppCompatActivity {
    public MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animais_u);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.menu_letra_u);
        mp.start();
    }

    public void tocar1U (View view){
        MediaPlayer mp1 = MediaPlayer.create(this, R.raw.som_urso);
        mp1.start();
    }

    public void tocar2U (View view){
        MediaPlayer mp2 = MediaPlayer.create(this, R.raw.som_urubu);
        mp2.start();
    }

    public void setamenu2(View view){
        ImageView ii = new ImageView(getApplicationContext());
        ii.setImageResource(R.drawable.confirm);

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(ii);
        toast.show();

        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}
