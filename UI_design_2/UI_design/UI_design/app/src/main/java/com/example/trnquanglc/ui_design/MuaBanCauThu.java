package com.example.trnquanglc.ui_design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MuaBanCauThu extends AppCompatActivity {
    Button btn_timcauthu;
    Button btn_dscauthu;
    Button btn_bancauthu;
    Button btn_yeuthichcauthu;
    Button btn_danhsachban;
    ImageView img_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mua_ban_cau_thu);
        btn_bancauthu = (Button)findViewById(R.id.btn_ban);
        btn_dscauthu = (Button)findViewById(R.id.btn_dscauthu);
        btn_timcauthu = (Button)findViewById(R.id.btn_timcauthu);
        btn_yeuthichcauthu = (Button)findViewById(R.id.btn_yeuthich);
        btn_danhsachban = (Button)findViewById(R.id.btn_danhsachban);
        btn_timcauthu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MuaBanCauThu.this, TimCauThu.class);
                startActivity(myIntent);

            }
        });

        btn_bancauthu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MuaBanCauThu.this, BanCauThu.class);
                startActivity(myIntent);

            }
        });

        btn_dscauthu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MuaBanCauThu.this, DanhSachCauThu.class);
                startActivity(myIntent);

            }
        });

        btn_yeuthichcauthu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MuaBanCauThu.this, YeuThich.class);
                startActivity(myIntent);

            }
        });

        btn_danhsachban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MuaBanCauThu.this, DanhSachBan.class);
                startActivity(myIntent);

            }
        });

        img_back = (ImageView)findViewById(R.id.img_back);
        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MuaBanCauThu.this, TrangChu.class);
                startActivity(myIntent);
            }
        });
    }
}
