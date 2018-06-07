package com.example.trnquanglc.ui_design;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class Dau extends AppCompatActivity {
    VideoView vd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dau);
        vd = (VideoView)findViewById(R.id.video_play);
        String path = "android.resource://com.example.trnquanglc.ui_design/"+R.raw.fo3;
        Uri uri = Uri.parse(path);
        vd.setVideoURI(uri);
        vd.start();
    }

    public void video(View v){


    }
}
