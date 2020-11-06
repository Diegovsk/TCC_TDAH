package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AnimaisIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animais_i);
    }

    public void setaanimaiso(View view){
        Intent intent = new Intent(this, AnimaisOActivity.class);
        startActivity(intent);
    }
}
