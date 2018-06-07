package com.example.trnquanglc.ui_design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class QuanLyDoi extends AppCompatActivity {

    ImageView img_back;
    Button thongtindoi;
    Button thaydoihinh;
    Button nangcap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quan_ly_doi);
        img_back = (ImageView)findViewById(R.id.img_back);
        thongtindoi = (Button)findViewById(R.id.btn_thongtindoi);
        thaydoihinh = (Button)findViewById(R.id.btn_thaydoihinh);
        nangcap = (Button)findViewById(R.id.btn_nangcap);

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(QuanLyDoi.this, TrangChu.class);
                startActivity(myIntent);
            }
        });

        thongtindoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(QuanLyDoi.this, ThongTinDoi.class);
                startActivity(myIntent);
            }
        });

        thaydoihinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(QuanLyDoi.this, ThayDoiHinh.class);
                startActivity(myIntent);
            }
        });

        nangcap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(QuanLyDoi.this, NangCap.class);
                startActivity(myIntent);
            }
        });
    }
}
