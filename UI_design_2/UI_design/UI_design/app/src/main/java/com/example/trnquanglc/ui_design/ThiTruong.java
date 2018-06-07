package com.example.trnquanglc.ui_design;

import android.content.Intent;
import android.media.Image;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ThiTruong extends AppCompatActivity {

    ImageView img_back;
    ImageView img_muavatpham;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thi_truong);
        img_back = (ImageView)findViewById(R.id.img_back);
        img_muavatpham = (ImageView)findViewById(R.id.img_muagoi);

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(ThiTruong.this, TrangChu.class);
                startActivity(myIntent);
            }
        });

        img_muavatpham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(ThiTruong.this, MuaVatPham.class);
                startActivity(myIntent);
            }
        });
    }
}
