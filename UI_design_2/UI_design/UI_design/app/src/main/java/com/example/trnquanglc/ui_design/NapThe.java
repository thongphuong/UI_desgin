package com.example.trnquanglc.ui_design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NapThe extends AppCompatActivity {

    Button btn_napthe;
    Button btn_quaylai;
    EditText ed_serial;
    EditText ed_mathe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nap_the);
        onCreateComponent();
        btn_quaylai.setOnClickListener(onjectClick);
        btn_napthe.setOnClickListener(onjectClick);
    }

    public void onCreateComponent(){
        btn_napthe = (Button)findViewById(R.id.btn_napthe);
        btn_quaylai = (Button)findViewById(R.id.btn_quaylai);
        ed_mathe = (EditText)findViewById(R.id.ed_mathe);
        ed_serial = (EditText)findViewById(R.id.ed_serial);
    }

    public View.OnClickListener onjectClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId())
            {
                case R.id.btn_quaylai :
                    Intent myIntent = new Intent(NapThe.this, TrangChu.class);
                    startActivity(myIntent);
                    break;
                case R.id.btn_napthe :
                    Intent myIntent2 = new Intent(NapThe.this, ThongBao.class);
                    startActivity(myIntent2);
                    break;

            }

        }
    };
}
