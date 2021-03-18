package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class EncVocalUiActivity extends AppCompatActivity {
    public MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enc_vocal_ui);


        VideoView videoView = findViewById(R.id.encvocalui);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.enc_vocal_ui;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        
    }

    public void setamenu4(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        mp.start();

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