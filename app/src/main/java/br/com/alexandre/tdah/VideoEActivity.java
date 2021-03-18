package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoEActivity extends AppCompatActivity {
    public MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_e);

        VideoView videoView = findViewById(R.id.videoee);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videoe;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }

    public void setavideoi(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        mp.start();

        Intent intent = new Intent(this, VideoIActivity.class);
        startActivity(intent);
    }
}
