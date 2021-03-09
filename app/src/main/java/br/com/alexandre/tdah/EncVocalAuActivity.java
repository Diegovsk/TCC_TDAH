package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EncVocalAuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enc_vocal_au);
    }

    public void setaEncVocalEi (View view){
        Intent intent = new Intent (this, EncVocalEiActivity.class);
        startActivity(intent);
    }
}