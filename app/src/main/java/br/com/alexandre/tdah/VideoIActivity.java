package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoIActivity extends AppCompatActivity {
    public MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_i);

        VideoView videoView = findViewById(R.id.videoii);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videoi;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }

    public void setavideoo(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        mp.start();

        Intent intent = new Intent(this, VideoOActivity.class);
        startActivity(intent);
    }
}

