package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class EncVocalEiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enc_vocal_ei);

        VideoView videoView = findViewById(R.id.encvocalei);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.enc_vocal_ei;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

    }

    public void setaEncVocalEu(View view){
        Intent intent = new Intent(this, EncVocalEuActivity.class);
        startActivity(intent);
    }
}