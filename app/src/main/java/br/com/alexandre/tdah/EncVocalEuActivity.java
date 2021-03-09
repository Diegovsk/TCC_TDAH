package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EncVocalEuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enc_vocal_eu);
    }

    public void setaEncVocalOi(View view){
        Intent intent = new Intent(this, EncVocalOiActivity.class);
        startActivity(intent);
    }

}