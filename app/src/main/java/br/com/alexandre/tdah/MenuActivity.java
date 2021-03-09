package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void jogarboca(View view){
        Intent intent  = new Intent(this, VogalAActivity.class);
        startActivity(intent);
    }

    public void jogaranimal(View view){
        Intent intent = new Intent(this, AnimaisAActivity.class);
        startActivity(intent);
    }

    public void gamevideo(View view){
        Intent intent = new Intent(this, VideoAActivity.class);
        startActivity(intent);
    }

    public void gameEncVocal(View view){
        Intent intent = new Intent(this, EncVocalActivity.class);
        startActivity(intent);
    }
}
