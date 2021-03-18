package br.com.alexandre.tdah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoOActivity extends AppCompatActivity {
    public MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_o);

        VideoView videoView = findViewById(R.id.videooo);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videoo;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }

    public void setavideou(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        mp.start();

        Intent intent = new Intent(this, VideoUActivity.class);
        startActivity(intent);
    }
}
