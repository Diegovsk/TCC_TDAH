package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class EncVocalUiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enc_vocal_ui);
    }

    public void setamenu4(View view){
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