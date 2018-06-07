package com.example.trnquanglc.ui_design;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class TrangChu extends AppCompatActivity implements TextWatcher{

    ImageView imgShop;
    ImageView imgThiTruong;
    ImageView imgHome;
    ImageView imgQuanLy;
    ImageView imgKho;
    android.support.v7.widget.Toolbar mtoolbar;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);
        createComponent();

        imgShop.setOnClickListener(onjectClick);
        imgThiTruong.setOnClickListener(onjectClick);
        imgHome.setOnClickListener(onjectClick);
        imgQuanLy.setOnClickListener(onjectClick);
        imgKho.setOnClickListener(onjectClick);

        linearLayout.setOnClickListener(onjectClick);
        setSupportActionBar(mtoolbar);


    }

    private void setSupportActionBar(Toolbar toolbar) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.my_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_setting:
                Intent myIntent = new Intent(TrangChu.this, CaiDat.class);
                startActivity(myIntent);
                break;
            case R.id.action_cash:
                Intent myIntent1 = new Intent(TrangChu.this, NapThe.class);
                startActivity(myIntent1);
                break;
            case R.id.action_logout:
                Intent myIntent2 = new Intent(TrangChu.this, Login.class);
                startActivity(myIntent2);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void createComponent(){
        imgShop = (ImageView)findViewById(R.id.imgShop);
        imgThiTruong = (ImageView)findViewById(R.id.imgThiTruong);
        imgHome = (ImageView)findViewById(R.id.imgHome);
        imgQuanLy = (ImageView)findViewById(R.id.imgQuanLyDoi);
        imgKho = (ImageView)findViewById(R.id.imgKho);
        mtoolbar = (android.support.v7.widget.Toolbar)findViewById(R.id.toolbar);
        linearLayout = (LinearLayout)findViewById(R.id.linDauTruong);

    }

    public View.OnClickListener onjectClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId())
            {
                case R.id.imgShop :
                    Intent myIntent = new Intent(TrangChu.this, ThiTruong.class);
                    startActivity(myIntent);
                    break;
                case R.id.imgThiTruong :
                    Intent myIntent2 = new Intent(TrangChu.this, MuaBanCauThu.class);
                    startActivity(myIntent2);
                    break;
                case R.id.imgHome :
                    Intent myIntent3 = new Intent(TrangChu.this, TrangChu.class);
                    startActivity(myIntent3);
                    break;
                case R.id.imgQuanLyDoi :
                    Intent myIntent4 = new Intent(TrangChu.this, QuanLyDoi.class);
                    startActivity(myIntent4);
                    break;
                case R.id.imgKho :
                    Intent myIntent5 = new Intent(TrangChu.this, Kho.class);
                    startActivity(myIntent5);
                    break;
                case R.id.linDauTruong:
                    Intent myIntent6 = new Intent(TrangChu.this, DauTruong.class);
                    startActivity(myIntent6);
                    break;
            }

        }
    };

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}
