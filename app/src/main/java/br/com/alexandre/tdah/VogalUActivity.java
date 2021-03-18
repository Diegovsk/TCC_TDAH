package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class VogalUActivity extends AppCompatActivity {
    public MediaPlayer mp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vogal_u);
        mp = MediaPlayer.create(VogalUActivity.this, R.raw.sombotu);
    }

    MediaPlayer mp;
    public void somu (View v){
        mp.start();
    }

    public void setamenu(View view){
        MediaPlayer mp1 = MediaPlayer.create(this, R.raw.click);
        mp1.start();

        ImageView i = new ImageView(getApplicationContext());
        i.setImageResource(R.drawable.confirm);

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(i);
        toast.show();

        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}
