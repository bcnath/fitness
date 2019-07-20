package com.example.bimal.fitness;


import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class benchpress extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benchpress);
        VideoView vidView=(VideoView)findViewById(R.id.videoview);
        String vidAddress="https://archive.org/download/benchpress1/benchpress1.mp4";
        Uri vidUri = Uri.parse(vidAddress);
        vidView.setVideoURI(vidUri);
        MediaController vidControl=new MediaController(this);
        vidView.setMediaController(vidControl);
        vidControl.setAnchorView(vidView);
        vidView.start();
    }
}
