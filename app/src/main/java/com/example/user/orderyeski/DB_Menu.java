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
            
            values.put("_id", "46");
            values.put("nama", "Nasi Empal");
            values.put("jenis", "Menu Sambelan");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "47");
            values.put("nama", "Nasi Lele");
            values.put("jenis", "Menu Sambelan");
            values.put("harga", 9000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "48");
            values.put("nama", "Nasi Mujair");
            values.put("jenis", "Menu Sambelan");
            values.put("harga", 9000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "49");
            values.put("nama", "Nasi Ayam Penyet");
            values.put("jenis", "Menu Sambelan");
            values.put("harga", 12000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "50");
            values.put("nama", "Nasi Gurami");
            values.put("jenis", "Menu Sambelan");
            values.put("harga", 14000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "51");
            values.put("nama", "Nasi Tahu/Tempe Kremes");
            values.put("jenis", "Menu Kremesan");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "52");
            values.put("nama", "Nasi Telor Kremes");
            values.put("jenis", "Menu Kremesan");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "53");
            values.put("nama", "Nasi Telor Kremes");
            values.put("jenis", "Menu Kremesan");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "54");
            values.put("nama", "Nasi Bakso Kremes");
            values.put("jenis", "Menu Kremesan");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "55");
            values.put("nama", "Nasi Bakso Kremes");
            values.put("jenis", "Menu Kremesan");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "56");
            values.put("nama", "Nasi Sosis Kremes");
            values.put("jenis", "Menu Kremesan");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "57");
            values.put("nama", "Nasi Ati Ampela Kremes");
            values.put("jenis", "Menu Kremesan");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "58");
            values.put("nama", "Nasi Empal Kremes");
            values.put("jenis", "Menu Kremesan");
            values.put("harga", 9000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "59");
            values.put("nama", "Nasi Lele Kremes");
            values.put("jenis", "Menu Kremesan");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "60");
            values.put("nama", "Nasi Mujair Kremes");
            values.put("jenis", "Menu Kremesan");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "61");
            values.put("nama", "Nasi Ayam Kremes");
            values.put("jenis", "Menu Kremesan");
            values.put("harga", 13000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "62");
            values.put("nama", "Nasi Gurami Kremes");
            values.put("jenis", "Menu Kremesan");
            values.put("harga", 15000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "63");
            values.put("nama", "Mie Tom-Yam ");
            values.put("jenis", "Menu Gila");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "64");
            values.put("nama", "Mie Tom-Cruise ");
            values.put("jenis", "Menu Gila");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "65");
            values.put("nama", "Mie Tom Yam Special ");
            values.put("jenis", "Menu Gila");
            values.put("harga", 12000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "66");
            values.put("nama", "Mie Tom Cruise Special ");
            values.put("jenis", "Menu Gila");
            values.put("harga", 12000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "67");
            values.put("nama", "Mie Tom-Yam Seafood ");
            values.put("jenis", "Menu Gila");
            values.put("harga", 13000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "68");
            values.put("nama", "Mie Tom-Cruise Seafood ");
            values.put("jenis", "Menu Gila");
            values.put("harga", 13000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "69");
            values.put("nama", "Mie Tom-Yam Super Special ");
            values.put("jenis", "Menu Gila");
            values.put("harga", 15000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "70");
            values.put("nama", "Mie Tom-Cruise Super Special ");
            values.put("jenis", "Menu Gila");
            values.put("harga", 15000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "71");
            values.put("nama", "Mie Ramen ");
            values.put("jenis", "Menu Gila");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "72");
            values.put("nama", "Mie Ce-Men ");
            values.put("jenis", "Menu Gila");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "73");
            values.put("nama", "Mie Ramen Special ");
            values.put("jenis", "Menu Gila");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "74");
            values.put("nama", "Mie Ce-Men Special ");
            values.put("jenis", "Menu Gila");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "75");
            values.put("nama", "Mie Ramen Seafood ");
            values.put("jenis", "Menu Gila");
            values.put("harga", 13000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "76");
            values.put("nama", "Mie Ce-Men Seafood ");
            values.put("jenis", "Menu Gila");
            values.put("harga", 13000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "77");
            values.put("nama", "Mie Ramen Super Special ");
            values.put("jenis", "Menu Gila");
            values.put("harga", 15000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "78");
            values.put("nama", "Mie Cemen Super Special ");
            values.put("jenis", "Menu Gila");
            values.put("harga", 15000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "79");
            values.put("nama", "Mie Iblis");
            values.put("jenis", "Menu Gila");
            values.put("harga", 9000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "80");
            values.put("nama", "Mie Malaikat");
            values.put("jenis", "Menu Gila");
            values.put("harga", 9000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "81");
            values.put("nama", "Mie Iblis Topping Tuna");
            values.put("jenis", "Menu Gila");
            values.put("harga", 11000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "82");
            values.put("nama", "Mie Malaiakat Topping Tuna");
            values.put("jenis", "Menu Gila");
            values.put("harga", 11000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "83");
            values.put("nama", "Mie Iblis Topping Keju");
            values.put("jenis", "Menu Gila");
            values.put("harga", 11000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "84");
            values.put("nama", "Mie Malaiakat Topping Keju");
            values.put("jenis", "Menu Gila");
            values.put("harga", 11000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "85");
            values.put("nama", "Kentang Goreng");
            values.put("jenis", "Menu Makanan Selingan");
            values.put("harga", 6000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "86");
            values.put("nama", "Kentang Mayonise");
            values.put("jenis", "Menu Makanan Selingan");
            values.put("harga", 7000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "87");
            values.put("nama", "Kentang Special");
            values.put("jenis", "Menu Makanan Selingan");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "88");
            values.put("nama", "Tempe Mendoan");
            values.put("jenis", "Menu Makanan Selingan");
            values.put("harga", 6000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "89");
            values.put("nama", "Tahu Crispy");
            values.put("jenis", "Menu Makanan Selingan");
            values.put("harga", 6000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "90");
            values.put("nama", "Jamur Crispy");
            values.put("jenis", "Menu Makanan Selingan");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "91");
            values.put("nama", "Omlet Mie");
            values.put("jenis", "Menu Makanan Selingan");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "92");
            values.put("nama", "Roti Maryam Original");
            values.put("jenis", "Menu Makanan Selingan");
            values.put("harga", 5000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "93");
            values.put("nama", "Roti Maryam Coklat");
            values.put("jenis", "Menu Makanan Selingan");
            values.put("harga", 6000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "94");
            values.put("nama", "Roti Maryam Keju");
            values.put("jenis", "Menu Makanan Selingan");
            values.put("harga", 7000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "95");
            values.put("nama", "Roti Maryam Coklat + Keju");
            values.put("jenis", "Menu Makanan Selingan");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "96");
            values.put("nama", "Pisang Susu Original");
            values.put("jenis", "Menu Makanan Selingan");
            values.put("harga", 5000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "97");
            values.put("nama", "Pisang Susu Coklat");
            values.put("jenis", "Menu Makanan Selingan");
            values.put("harga", 6000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "98");
            values.put("nama", "Pisang Susu Keju");
            values.put("jenis", "Menu Makanan Selingan");
            values.put("harga", 7000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "99");
            values.put("nama", "Pisang Susu Coklat + Keju");
            values.put("jenis", "Menu Makanan Selingan");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "100");
            values.put("nama", "Roti Bakar Coklat");
            values.put("jenis", "Menu Makanan Selingan");
            values.put("harga", 6000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);
           
        }
