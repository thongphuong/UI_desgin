package com.example.trnquanglc.ui_design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CaiDat extends AppCompatActivity {

    Button btn_channhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cai_dat);

        btn_channhan = (Button)findViewById(R.id.btn_chapnhan);
        btn_channhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(CaiDat.this, TrangChu.class);
                startActivity(myIntent);
            }
        });
    }
}
