package com.example.user.orderyeski;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DB_ParseMenu extends Activity {
    ImageView Im;
    TextView tv_nama;
    TextView tv_jenis;
    TextView tv_harga;
    TextView id;
    Integer[] imageIDs = new Integer[4];
    int msg_im;

    DB_Menu dbMenu = new DB_Menu(this);
    public DB_ParseMenu() {
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.detilmenu);
        Intent iIdentifikasi = this.getIntent();
        this.msg_im = iIdentifikasi.getIntExtra("dataIM", 0);
        String msg_nama = iIdentifikasi.getStringExtra("dataNama");
        String msg_jenis = iIdentifikasi.getStringExtra("dataJenis");
        String msg_harga = iIdentifikasi.getStringExtra("dataHarga");

        this.Im = (ImageView)this.findViewById(R.id.iv_detail);
        this.tv_nama = (TextView)this.findViewById(R.id.tvNama);
        this.tv_jenis = (TextView)this.findViewById(R.id.tvJenis);
        this.tv_harga = (TextView)this.findViewById(R.id.tvHarga);

        this.Im.setImageResource(this.msg_im);
        this.tv_nama.setText(msg_nama);
        this.tv_jenis.setText(msg_jenis);
        this.tv_harga.setText(msg_harga);
    }
}
