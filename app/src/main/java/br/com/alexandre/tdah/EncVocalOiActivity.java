package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EncVocalOiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enc_vocal_oi);
    }

    public void setaEncVocalUai(View view){
        Intent intent = new Intent(this, EncVocalUaiActivity.class);
        startActivity(intent);
    }
}