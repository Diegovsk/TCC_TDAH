package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EncVocalUaiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enc_vocal_uai);
    }

    public void setaEncVocalUau(View view){
        Intent intent = new Intent(this, EncVocalUauActivity.class);
        startActivity(intent);
    }
}