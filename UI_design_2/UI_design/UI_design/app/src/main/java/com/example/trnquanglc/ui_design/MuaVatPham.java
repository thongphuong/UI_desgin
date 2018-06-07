package com.example.trnquanglc.ui_design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MuaVatPham extends AppCompatActivity {
    ImageView img_back;
    Button btn_muavatpham;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mua_vat_pham);
        img_back = (ImageView)findViewById(R.id.img_back);
        btn_muavatpham = (Button)findViewById(R.id.btn_muavatpham);

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MuaVatPham.this, ThiTruong.class);
                startActivity(myIntent);
            }
        });

        btn_muavatpham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MuaVatPham.this, ThongBao.class);
                startActivity(myIntent);
            }
        });
    }
}
