package com.example.trnquanglc.ui_design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DauTruong extends AppCompatActivity {
    ImageView img_back;
    Button btn_lichsu;
    Button btn_capdothuong;
    ImageView img_comp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dau_truong);
        img_back = (ImageView)findViewById(R.id.img_back);
        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(DauTruong.this, TrangChu.class);
                startActivity(myIntent);
            }
        });

        btn_lichsu = (Button)findViewById(R.id.btn_lichsuchoi);
        btn_lichsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(DauTruong.this, LichSuChoi.class);
                startActivity(myIntent);
            }
        });

        btn_capdothuong = (Button)findViewById(R.id.btn_capdonhanthuong);
        btn_capdothuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent1 = new Intent(DauTruong.this, NhanThuong.class);
                startActivity(myIntent1);
            }
        });

        img_comp = (ImageView)findViewById(R.id.img_computer);
        img_comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent1 = new Intent(DauTruong.this, DauvsMay.class);
                startActivity(myIntent1);
            }
        });
    }
}
