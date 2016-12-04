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


public class DaftarMenuList extends Activity {
    protected ListView lv;
    protected ListAdapter adapter;
    SQLiteDatabase db;
    Cursor cursor;
    EditText et_db;

    public DaftarMenuList() {
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.daftarmenulayout);
        this.db = (new DB_Menu(this)).getWritableDatabase();
        this.lv = (ListView)this.findViewById(R.id.lv);
        this.et_db = (EditText)this.findViewById(R.id.et);

        try {
            this.cursor = this.db.rawQuery("SELECT * FROM menu ORDER BY nama ASC", (String[])null);
            this.adapter = new SimpleCursorAdapter(this, R.layout.daftarmenu, this.cursor, new String[]{"nama", "harga", "img"}, new int[]{R.id.tv_makan, R.id.tv_harga, R.id.imV});
            this.lv.setAdapter(this.adapter);
            this.lv.setTextFilterEnabled(true);
            this.lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                    DaftarMenuList.this.detail(position);
                }
            });
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }

    public void search_db(View v) {
        String edit_db = this.et_db.getText().toString();
        if(!edit_db.equals("")) {
            try {
                this.cursor = this.db.rawQuery("SELECT * FROM menu WHERE nama LIKE ?", new String[]{"%" + edit_db + "%"});
                this.adapter = new SimpleCursorAdapter(this, R.layout.daftarmenu, this.cursor, new String[]{"nama", "harga", "img"}, new int[]{R.id.tv_makan, R.id.tv_harga, R.id.imV});
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
                this.cursor = this.db.rawQuery("SELECT * FROM menu ORDER BY nama ASC", (String[])null);
                this.adapter = new SimpleCursorAdapter(this, R.layout.daftarmenu, this.cursor, new String[]{"nama", "harga", "img"}, new int[]{R.id.tv_makan, R.id.tv_harga, R.id.imV});
                this.lv.setAdapter(this.adapter);
                this.lv.setTextFilterEnabled(true);
            } catch (Exception var4) {
                var4.printStackTrace();
            }
        }
    }
    
    //belum selesai
    
 }
