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
        } //continue
	}
