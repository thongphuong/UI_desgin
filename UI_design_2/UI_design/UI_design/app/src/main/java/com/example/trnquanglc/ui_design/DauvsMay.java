package com.example.trnquanglc.ui_design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class DauvsMay extends AppCompatActivity {
    ImageView img_back;
    Button btn_batdau1;
    String arr[]={
            "4-4-2",
            "4-2-3-1",
            "3-5-2",
            "5-3-2"};
    TextView selection;
    Spinner spin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dauvs_may);

        selection =(TextView) findViewById(R.id.selection);
        spin = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>
                (
                        this,
                        android.R.layout.simple_spinner_dropdown_item,
                        arr
                );
        adapter.setDropDownViewResource
                (android.R.layout.simple_list_item_single_choice);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(new DauvsMay.MyProcessEvent());


        img_back = (ImageView)findViewById(R.id.img_back);
        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(DauvsMay.this, DauTruong.class);
                startActivity(myIntent);
            }
        });

        btn_batdau1 = (Button)findViewById(R.id.btn_batdau);
        btn_batdau1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(DauvsMay.this, Dau.class);
                startActivity(myIntent);
            }
        });
    }

    private class MyProcessEvent implements AdapterView.OnItemSelectedListener
    {


        //Khi có chọn lựa thì vào hàm này
        public void onItemSelected(AdapterView<?> arg0,
                                   View arg1,
                                   int arg2,
                                   long arg3) {
            //arg2 là phần tử được chọn trong data source
            //selection.setText(arr[arg2]);
        }
        //Nếu không chọn gì cả
        public void onNothingSelected(AdapterView<?> arg0) {
            selection.setText("");
        }
    }
}
