package com.example.user.myorderyeski;

/**
 * Created by Ahsanul Marom
 * Reviewed by Fajar Febrianto
 * Data by Alfian F. Fikri
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

import java.util.ArrayList;
import java.util.HashMap;

public class DB_Menu extends SQLiteOpenHelper {
    static final String DB_NAME = "menu";

    public DB_Menu(Context context) {
        super(context, "menu", (CursorFactory)null, 1000);
    }

        public void onCreate(SQLiteDatabase db) {
            String sql = "CREATE TABLE IF NOT EXISTS menu(_id INTEGER PRIMARY KEY AUTOINCREMENT, nama TEXT, jenis TEXT, harga double, img BLOB, quantity TEXT)";
            db.execSQL(sql);
            ContentValues values = new ContentValues();

            values.put("_id", "1");
            values.put("nama", "Nasi Goreng Telor");
            values.put("jenis", "Chinese Food");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "2");
            values.put("nama", "Nasi Goreng Sosis");
            values.put("jenis", "Chinese Food");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "3");
            values.put("nama", "Nasi Goreng Ayam");
            values.put("jenis", "Chinese Food");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "4");
            values.put("nama", "Nasi Goreng Bakso");
            values.put("jenis", "Chinese Food");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "5");
            values.put("nama", "Nasi Goreng Ati Ampela");
            values.put("jenis", "Chinese Food");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "6");
            values.put("nama", "Nasi Goreng Keju");
            values.put("jenis", "Chinese Food");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "7");
            values.put("nama", "Nasi Goreng Hongkong");
            values.put("jenis", "Chinese Food");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "8");
            values.put("nama", "Nasi Goreng Crazy");
            values.put("jenis", "Chinese Food");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "9");
            values.put("nama", "Nasi Goreng Ikan Asin");
            values.put("jenis", "Chinese Food");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "10");
            values.put("nama", "Nasi Goreng Spesial");
            values.put("jenis", "Chinese Food");
            values.put("harga", 13000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            //belum selesai
        }
