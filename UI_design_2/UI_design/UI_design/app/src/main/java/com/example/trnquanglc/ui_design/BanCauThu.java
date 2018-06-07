package com.example.trnquanglc.ui_design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class BanCauThu extends AppCompatActivity {
    ImageView img_back;
    Button btn_ban;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ban_cau_thu);
        img_back = (ImageView)findViewById(R.id.img_back);
        btn_ban = (Button)findViewById(R.id.btn_ban1);
        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(BanCauThu.this, MuaBanCauThu.class);
                startActivity(myIntent);
            }
        });

        btn_ban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(BanCauThu.this, ThongTinBanCauThu.class);
                startActivity(myIntent);
            }
        });

    }
}
