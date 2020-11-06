package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AnimaisOActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animais_o);
    }

    public void setaanimaisu(View view){
        Intent intent = new Intent(this,AnimaisUActivity.class);
        startActivity(intent);
    }
}
