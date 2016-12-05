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

            values.put("_id", "101");
            values.put("nama", "Roti Bakar Keju");
            values.put("jenis", "Menu Makanan Selingan");
            values.put("harga", 7000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "102");
            values.put("nama", "Roti Bakar Coklat + Keju");
            values.put("jenis", "Menu Makanan Selingan");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "103");
            values.put("nama", "Chiken Wings isi 4 pcs");
            values.put("jenis", "Menu Makanan Selingan");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "104");
            values.put("nama", "Chiken Wings isi 6 pcs");
            values.put("jenis", "Menu Makanan Selingan");
            values.put("harga", 12000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "105");
            values.put("nama", "Chiken Wings isi 8 pcs");
            values.put("jenis", "Menu Makanan Selingan");
            values.put("harga", 15000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "106");
            values.put("nama", "Sosis Bandung");
            values.put("jenis", "Menu Makanan Selingan");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "107");
            values.put("nama", "Sosis Bandung Jumbo Original");
            values.put("jenis", "Menu Makanan Selingan");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "108");
            values.put("nama", "Sosis Bandung Lada Hitam");
            values.put("jenis", "Menu Makanan Selingan");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "109");
            values.put("nama", "Sosis Bandung Jumbo Keju");
            values.put("jenis", "Menu Makanan Selingan");
            values.put("harga", 12000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "110");
            values.put("nama", "Kwetiau Goreng");
            values.put("jenis", "Chinese Food");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "111");
            values.put("nama", "Kwetiau Siram");
            values.put("jenis", "Chinese Food");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "112");
            values.put("nama", "Kwetiau Goreng Special");
            values.put("jenis", "Chinese Food");
            values.put("harga", 13000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "113");
            values.put("nama", "Kwetiau Siram Special");
            values.put("jenis", "Chinese Food");
            values.put("harga", 13000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "114");
            values.put("nama", "Kwetiau Goreng Seafood");
            values.put("jenis", "Chinese Food");
            values.put("harga", 13000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "115");
            values.put("nama", "Nasi Cap Cay");
            values.put("jenis", "Chinese Food");
            values.put("harga", 11000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "116");
            values.put("nama", "Tamie Cap Cay");
            values.put("jenis", "Chinese Food");
            values.put("harga", 14000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "117");
            values.put("nama", "Nasi Cap Cay Seafood");
            values.put("jenis", "Chinese Food");
            values.put("harga", 13000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "118");
            values.put("nama", "Tamie Cap Cay Seafood");
            values.put("jenis", "Chinese Food");
            values.put("harga", 15000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "119");
            values.put("nama", "Nasi Koloke");
            values.put("jenis", "Chinese Food");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "120");
            values.put("nama", "Nasi Fuyunghai");
            values.put("jenis", "Chinese Food");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "121");
            values.put("nama", "Nasi Ayam Saos Inggris");
            values.put("jenis", "Chinese Food");
            values.put("harga", 13000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "122");
            values.put("nama", "Nasi Ayam Saos Asem Manis");
            values.put("jenis", "Chinese Food");
            values.put("harga", 13000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "123");
            values.put("nama", "Nasi Udang Saos Inggris");
            values.put("jenis", "Chinese Food");
            values.put("harga", 15000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "124");
            values.put("nama", "Nasi Udang Saos Asem Manis");
            values.put("jenis", "Chinese Food");
            values.put("harga", 15000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "125");
            values.put("nama", "Teh Anget Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 2000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "126");
            values.put("nama", "Teh Anget Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 2000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "127");
            values.put("nama", "Es Teh Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 2500);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "128");
            values.put("nama", "Es Teh Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 3500);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "129");
            values.put("nama", "Es Sirup Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 2500);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "130");
            values.put("nama", "Es Sirup Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 3500);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "131");
            values.put("nama", "Es Sari Dele Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 3000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "132");
            values.put("nama", "Es Sari Dele Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 5000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "133");
            values.put("nama", "Es Jeruk Manis Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 3000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "134");
            values.put("nama", "Es Jeruk Manis Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 5000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "135");
            values.put("nama", "Es Jeruk Nipis Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 3000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "136");
            values.put("nama", "Es Jeruk Nipis Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 5000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "137");
            values.put("nama", "Es Lemon Tea Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 3000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "138");
            values.put("nama", "Es Lemon Tea Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 5000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "139");
            values.put("nama", "Es Cao Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 3000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "140");
            values.put("nama", "Es Cao Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 5000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "141");
            values.put("nama", "Es Selasih + Nata de Coco Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 3000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "142");
            values.put("nama", "Es Selasih + Nata de Coco Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 5000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "143");
            values.put("nama", "Es Milk Tea Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 4000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "144");
            values.put("nama", "Es Milk Tea Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 6000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "145");
            values.put("nama", "Es Milo Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 4000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "146");
            values.put("nama", "Es Milo Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 6000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "147");
            values.put("nama", "Juice Jeruk Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 4000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "148");
            values.put("nama", "Juice Jeruk Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 6000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "149");
            values.put("nama", "Juice Melon Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 4000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "150");
            values.put("nama", "Juice Melon Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 6000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "151");
            values.put("nama", "Juice Semangka Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 4000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "152");
            values.put("nama", "Juice Semangka Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 6000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "153");
            values.put("nama", "Juice Strawberry Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 4000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "154");
            values.put("nama", "Juice Strawberry Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 6000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "155");
            values.put("nama", "Juice Alpukat Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 5000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "156");
            values.put("nama", "Juice Alpukat Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 7000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "157");
            values.put("nama", "Juice Moccacino Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 4000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "158");
            values.put("nama", "Juice Moccacino Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 6000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "159");
            values.put("nama", "Juice Moccacino Special Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 5000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "160");
            values.put("nama", "Juice Moccacino Special Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 7000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "161");
            values.put("nama", "Juice Nescafe Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 4000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "162");
            values.put("nama", "Juice Nescafe Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 6000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "163");
            values.put("nama", "Juice Nescafe Special Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 5000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "164");
            values.put("nama", "Juice Nescafe Special Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 6000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "165");
            values.put("nama", "Milk Shake Coklat Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 4000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "166");
            values.put("nama", "Milk Shake Coklat Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 6000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "167");
            values.put("nama", "Milk Shake Coklat Special Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 5000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "168");
            values.put("nama", "Milk Shake Coklat Special Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 7000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "169");
            values.put("nama", "Milk Shake Strawberry Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 4000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "170");
            values.put("nama", "Milk Shake Strawberry Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 6000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "171");
            values.put("nama", "Milk Shake Strawberry Special Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 5000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "172");
            values.put("nama", "Milk Shake Strawberry Special Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 7000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "173");
            values.put("nama", "Greentea Milk Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 5000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "174");
            values.put("nama", "Greentea Milk Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 7000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "175");
            values.put("nama", "Greentea Oreo Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 6000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "176");
            values.put("nama", "Greentea Oreo Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "177");
            values.put("nama", "Vanilla Milk Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 5000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "178");
            values.put("nama", "Vanilla Milk Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 7000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "179");
            values.put("nama", "Vanilla Oreo Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 6000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "180");
            values.put("nama", "Vanilla Oreo Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "181");
            values.put("nama", "Choco and Cookies Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 5000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "182");
            values.put("nama", "Choco and Cookies Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 7000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "183");
            values.put("nama", "Taro Milk Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 5000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "184");
            values.put("nama", "Taro Milk Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 7000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "185");
            values.put("nama", "Taro Oreo Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 6000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "186");
            values.put("nama", "Taro Oreo Jumbo");
            values.put("jenis", "Minuman");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "187");
            values.put("nama", "Es Alpukat Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 5000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "188");
            values.put("nama", "Es Buah Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 6000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "189");
            values.put("nama", "Susu Soda / Soda Gembira Biasa");
            values.put("jenis", "Minuman");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "190");
            values.put("nama", "Yeski Papper Only");
            values.put("jenis", "Makanan");
            values.put("harga", 15000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "191");
            values.put("nama", "Nasi Ayam Goreng/Ayam Bakar + Es Teh");
            values.put("jenis", "Makanan");
            values.put("harga", 10000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "192");
            values.put("nama", "Nasi Ayam Geprek");
            values.put("jenis", "Makanan");
            values.put("harga", 8000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);

            values.put("_id", "193");
            values.put("nama", "Nasi Goreng SUMO + Es Teh 1 Pitcher");
            values.put("jenis", "Makanan");
            values.put("harga", 25000);
            values.put("img", R.drawable.iconyeski);
            values.put("quantity","0");
            db.insert("menu", "_id", values);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS menu");
        this.onCreate(db);
    }

    public ArrayList<HashMap<String, String>> tampilMenu () {
        ArrayList<HashMap<String, String>> arrayListMenu = new ArrayList<HashMap<String, String>>();
        SQLiteDatabase database = this.getWritableDatabase();
        Cursor cursor = database.rawQuery("SELECT _id, nama, harga, quantity FROM menu ORDER BY nama ASC", null);
        if (cursor.moveToFirst()) {
            do {
                HashMap<String, String> hashMapMenu = new HashMap<String, String>();
                hashMapMenu.put("_id", cursor.getString(0));
                hashMapMenu.put("nama", cursor.getString(1));
                hashMapMenu.put("harga", cursor.getString(2));
                hashMapMenu.put("quantity", cursor.getString(3));
                arrayListMenu.add(hashMapMenu);
            } while (cursor.moveToNext());
        }
        return arrayListMenu;
    }

    public ArrayList<HashMap<String, String>> tampilJumlahAtas0 () {
        ArrayList<HashMap<String, String>> arrayListJumlah = new ArrayList<HashMap<String, String>>();
        SQLiteDatabase database = this.getWritableDatabase();
        Cursor cursor = database.rawQuery("SELECT nama, quantity FROM menu WHERE quantity!=0", null);
        if (cursor.moveToFirst()) {
            do {
                HashMap<String, String> hashMapJumlah = new HashMap<String, String>();
                hashMapJumlah.put("nama", cursor.getString(0));
                hashMapJumlah.put("quantity", cursor.getString(1));
                arrayListJumlah.add(hashMapJumlah);
            } while (cursor.moveToNext());
        }
        return arrayListJumlah;
    }

    public int updateJumlah(int id, String jumlah, double harga) {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues recordJumlah = new ContentValues();
        recordJumlah.put("quantity", jumlah);
        recordJumlah.put("harga", harga);
        return database.update("menu", recordJumlah, "_id=" + id, null);
    }

    public void nolkanJumlah(int id) {
        SQLiteDatabase database = this.getWritableDatabase();
        database.execSQL("UPDATE menu SET quantity = 0 WHERE _id =" + id);
        database.close();
    }

    public void nolkanSemua() {
        SQLiteDatabase database = this.getWritableDatabase();
        database.execSQL("UPDATE menu SET quantity=0");
        database.close();
    }

    public HashMap<String, String> tampilMenuID(int id) {
        SQLiteDatabase database = this.getReadableDatabase();
        HashMap<String, String> hashMapMenu = new HashMap<String, String>();
        Cursor cursor = database.rawQuery("SELECT * FROM menu WHERE _id=" + id + "", null);
        if (cursor.moveToFirst()) {
            do {
                hashMapMenu.put("_id", cursor.getString(0));
                hashMapMenu.put("nama", cursor.getString(1));
                hashMapMenu.put("harga", cursor.getString(3));
                hashMapMenu.put("quantity", cursor.getString(5));
            } while (cursor.moveToNext());
        }
        return hashMapMenu;
    }

    public double hargaBarang() {
        SQLiteDatabase database = this.getReadableDatabase();
        HashMap<String, Double> hashMapMenu = new HashMap<String, Double>();
        double harga = 0;
        Cursor cursor = database.rawQuery("SELECT harga FROM menu WHERE quantity!=0", null);
        if (cursor.moveToFirst()) {
            do {
                hashMapMenu.put("harga", cursor.getDouble(0));
                for (double h : hashMapMenu.values()) {
                    harga += h;
                }
            } while (cursor.moveToNext());
        }
        return harga;
    }

    public double hargaOngkir() {
        double ongkir;
        if (this.hargaBarang() < 50000) {
            ongkir = 5000;
        } else {
            ongkir = 0;
        }
        return ongkir;
    }

    public double jumlahHarga() {
        double total;
        if (this.hargaBarang() < 50000) {
            total = this.hargaBarang() + this.hargaOngkir();
        } else {
            total = this.hargaBarang();
        }
        return total;
    }

    public void kembalikanHarga(int id) {
        HashMap<String, String> hashMapData = this.tampilMenuID(id);
        double hargaMenu = Double.parseDouble(hashMapData.get("harga"));
        double jumlahMenu = Double.parseDouble(hashMapData.get("quantity"));
        double x;
        if (jumlahMenu > 0) {
            x = hargaMenu / jumlahMenu;
        } else {
            x = hargaMenu / (jumlahMenu + 1);
        }
        this.updateJumlah(id, "0", x);
    }
}
