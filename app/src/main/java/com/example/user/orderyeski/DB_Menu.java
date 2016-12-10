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
            
            values.put("_id", "11");
            values.put("nama", "Nasi Goreng Seafood");
            values.put("jenis", "Chinese Food");
            values.put("harga", 13000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "12");
            values.put("nama", "Mie Goreng / Kuah");
            values.put("jenis", "Chinese Food");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "13");
            values.put("nama", "Mie Goreng / Kuah Spesial");
            values.put("jenis", "Chinese Food");
            values.put("harga", 13000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "14");
            values.put("nama", "Mie Goreng / Kuah Seafood");
            values.put("jenis", "Chinese Food");
            values.put("harga", 13000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "15");
            values.put("nama", "Nasi Cumi Saos Inggris");
            values.put("jenis", "Chinese Food");
            values.put("harga", 15000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "16");
            values.put("nama", "Nasi Cumi Saos Asam Manis");
            values.put("jenis", "Chinese Food");
            values.put("harga", 15000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "17");
            values.put("nama", "Nasi (putih) + Tahu/Tempe Bakar + Ikan Asin");
            values.put("jenis", "Menu Bakar");
            values.put("harga", 7000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "18");
            values.put("nama", "Nasi (putih) + Telor Bakar + Ikan Asin");
            values.put("jenis", "Menu Bakar");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "19");
            values.put("nama", "Nasi (putih) + Bakso Bakar");
            values.put("jenis", "Menu Bakar");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "20");
            values.put("nama", "Nasi (putih) + Sosis Bakar");
            values.put("jenis", "Menu Bakar");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "21");
            values.put("nama", "Nasi (putih) + Ati Ampela Bakar");
            values.put("jenis", "Menu Bakar");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "22");
            values.put("nama", "Nasi (putih) + Empal Bakar");
            values.put("jenis", "Menu Bakar");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "23");
            values.put("nama", "Nasi (putih) + Lele Bakar");
            values.put("jenis", "Menu Bakar");
            values.put("harga", 9000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "24");
            values.put("nama", "Nasi (putih) + Mujair Bakar");
            values.put("jenis", "Menu Bakar");
            values.put("harga", 9000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "25");
            values.put("nama", "Nasi (putih) + Ayam Bakar");
            values.put("jenis", "Menu Bakar");
            values.put("harga", 12000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "26");
            values.put("nama", "Nasi (putih) + Gurami Bakar");
            values.put("jenis", "Menu Bakar");
            values.put("harga", 14000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "27");
            values.put("nama", "Nasi (Bakar) + Tahu/Tempe Bakar + Ikan Asin");
            values.put("jenis", "Menu Bakaran");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "28");
            values.put("nama", "Nasi (Bakar) + Telor Bakar + Ikan Asin");
            values.put("jenis", "Menu Bakaran");
            values.put("harga", 9000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "29");
            values.put("nama", "Nasi (Bakar) + Bakso Bakar");
            values.put("jenis", "Menu Bakaran");
            values.put("harga", 9000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "30");
            values.put("nama", "Nasi (Bakar) + Sosis Bakar");
            values.put("jenis", "Menu Bakaran");
            values.put("harga", 9000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "31");
            values.put("nama", "Nasi (Bakar) + Ati Ampela Bakar");
            values.put("jenis", "Menu Bakaran");
            values.put("harga", 9000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "32");
            values.put("nama", "Nasi (Bakar) + Empal Bakar");
            values.put("jenis", "Menu Bakaran");
            values.put("harga", 9000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "33");
            values.put("nama", "Nasi (Bakar) + Lele Bakar");
            values.put("jenis", "Menu Bakaran");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "34");
            values.put("nama", "Nasi (Bakar) + Mujair Bakar");
            values.put("jenis", "Menu Bakaran");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "35");
            values.put("nama", "Nasi (Bakar) + Ayam Bakar");
            values.put("jenis", "Menu Bakaran");
            values.put("harga", 13000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "36");
            values.put("nama", "Nasi (Bakar) + Gurami Bakar");
            values.put("jenis", "Menu Bakaran");
            values.put("harga", 15000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "37");
            values.put("nama", "Nasi Bakar Teriyaki");
            values.put("jenis", "Menu Bakaran");
            values.put("harga", 9000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "38");
            values.put("nama", "Nasi Bakar Ayam Jamur");
            values.put("jenis", "Menu Bakaran");
            values.put("harga", 9000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "39");
            values.put("nama", "Nasi Bakar Rendang");
            values.put("jenis", "Menu Bakaran");
            values.put("harga", 9000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "40");
            values.put("nama", "Nasi Bakar Tuna");
            values.put("jenis", "Menu Bakaran");
            values.put("harga", 9000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "41");
            values.put("nama", "Nasi Tahu/Tempe + Ikan Asin");
            values.put("jenis", "Menu Sambelan");
            values.put("harga", 6000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "42");
            values.put("nama", "Nasi Telor + Ikan Asin");
            values.put("jenis", "Menu Sambelan");
            values.put("harga", 7000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "43");
            values.put("nama", "Nasi Bakso Penyet");
            values.put("jenis", "Menu Sambelan");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "44");
            values.put("nama", "Nasi Sosis Penyet");
            values.put("jenis", "Menu Sambelan");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "45");
            values.put("nama", "Nasi Ati Ampela");
            values.put("jenis", "Menu Sambelan");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);
           
        }
