package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class EncVocalUaiActivity extends AppCompatActivity {
    public MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enc_vocal_uai);


        VideoView videoView = findViewById(R.id.encvocaluai);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.enc_vocal_uai;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

    }

    public void setaEncVocalUau(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        mp.start();

        Intent intent = new Intent(this, EncVocalUauActivity.class);
        startActivity(intent);
    }
}