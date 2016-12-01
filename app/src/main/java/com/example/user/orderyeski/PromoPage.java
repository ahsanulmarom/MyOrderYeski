package com.example.user.orderyeski;


import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

    public void search_db(View v) {
        String edit_db = this.et_db.getText().toString();
        if(!edit_db.equals("")) {
            try {
                this.cursor = this.db.rawQuery("SELECT * FROM Promo WHERE nama LIKE ?", new String[]{"%" + edit_db + "%"});
                this.adapter = new SimpleCursorAdapter(this, R.layout.promolayout, this.cursor, new String[]{"nama", "periode", "img"}, new int[]{R.id.tv_nama, R.id.tvPeriode, R.id.imV});
                if(this.adapter.getCount() == 0) {
                    Toast.makeText(this, "Tidak ditemukan data dengan kata kunci " + edit_db, 0).show();
                } else {
                    this.lv.setAdapter(this.adapter);
                }
            } catch (Exception var5) {
                var5.printStackTrace();
            }
        } else {
            try {
                this.cursor = this.db.rawQuery("SELECT * FROM Promo ORDER BY nama ASC", (String[])null);
                this.adapter = new SimpleCursorAdapter(this, R.layout.promolayout, this.cursor, new String[]{"nama", "periode", "img"}, new int[]{R.id.tv_nama, R.id.tvPeriode, R.id.imV});
                this.lv.setAdapter(this.adapter);
                this.lv.setTextFilterEnabled(true);
            } catch (Exception var4) {
                var4.printStackTrace();
            }
        }

    }

    public void detail(int position) {
        int im = 0;
        String _id = "";
        String nama = "";
        String bentuk = "";
        String syarat = "";
        String periode = "";
        String de = "";
        if(this.cursor.moveToFirst()) {
            this.cursor.moveToPosition(position);
            im = this.cursor.getInt(this.cursor.getColumnIndex("img"));
            nama = this.cursor.getString(this.cursor.getColumnIndex("nama"));
            bentuk = this.cursor.getString(this.cursor.getColumnIndex("bentuk"));
            syarat = this.cursor.getString(this.cursor.getColumnIndex("syarat"));
            periode = this.cursor.getString(this.cursor.getColumnIndex("periode"));
            de = this.cursor.getString(this.cursor.getColumnIndex("de"));
        }
    }
