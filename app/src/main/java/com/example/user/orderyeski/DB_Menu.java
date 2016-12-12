package com.example.user.orderyeski;

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
        values.put("nama", "Kwetiau Siram Special");
        values.put("jenis", "Chinese Food");
        values.put("harga", 13000);
        values.put("img", R.drawable.kwetiawsiramspesial.jpg);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "2");
        values.put("nama", "Mie Iblis Topping Keju (Lv 1 - 5)");
        values.put("jenis", "Menu Gila");
        values.put("harga", 11000);
        values.put("img", R.drawable.mieiblistopingsosiskeju.jpg);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "3");
        values.put("nama", "Es Sari Dele");
        values.put("jenis", "Minuman");
        values.put("harga", 3000);
        values.put("img", R.drawable.essaridele.jpg);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "4");
        values.put("nama", "Chiken Wings isi 4 pcs");
        values.put("jenis", "Menu Makanan Selingan");
        values.put("harga", 8000);
        values.put("img", R.drawable.chikenwingisi4.jpg);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "5");
        values.put("nama", "Kwetiau Goreng Special");
        values.put("jenis", "Chinese Food");
        values.put("harga", 13000);
        values.put("img", R.drawable.kwetiawgorengspesial.jpg);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "6");
        values.put("nama", "Nasi Ayam Geprek");
        values.put("jenis", "Makanan");
        values.put("harga", 8000);
        values.put("img", R.drawable.nasiayamgeprek.jpg);
	values.put("quantity","0");
        db.insert("menu", "_id", values);
	
	values.put("_id", "7");
        values.put("nama", "Yeski Papper Only");
        values.put("jenis", "Makanan");
        values.put("harga", 15000);
        values.put("img", R.drawable.yeskipaper(chiken).jpg);
	values.put("quantity","0");
        db.insert("menu", "_id", values);
	
	values.put("_id", "8");
        values.put("nama", "Es Greentea Oreo");
        values.put("jenis", "Minuman");
        values.put("harga", 6000);
        values.put("img", R.drawable.esgreenteaoreo.jpg);
	values.put("quantity","0");
        db.insert("menu", "_id", values);
	
	values.put("_id", "9");
        values.put("nama", "Nasi (Bakar) + Ati Ampela Bakar");
        values.put("jenis", "Menu Bakaran");
        values.put("harga", 9000);
        values.put("img", R.drawable.nasibakarati.jpg);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "10");
        values.put("nama", "Nasi Ayam Goreng/Ayam Bakar + Es Teh");
        values.put("jenis", "Makanan");
        values.put("harga", 10000);
        values.put("img", R.drawable.nasiayambakar.jpg);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "11");
        values.put("nama", "Nasi (Bakar) + Telor Bakar + Ikan Asin");
        values.put("jenis", "Menu Bakaran");
        values.put("harga", 9000);
        values.put("img", R.drawable.nasibakartelor.jpg);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "12");
        values.put("nama", "Sosis Bandung Jumbo Original");
        values.put("jenis", "Menu Makanan Selingan");
        values.put("harga", 10000);
        values.put("img", R.drawable.sosisbandungsuperjumbo.jpg);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "13");
        values.put("nama", "Kwetiau Siram");
        values.put("jenis", "Chinese Food");
        values.put("harga", 10000);
        values.put("img", R.drawable.kwetiawsiram.jpg);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "14");
        values.put("nama", "Mie Ramen Special ");
        values.put("jenis", "Menu Gila");
        values.put("harga", 10000);
        values.put("img", R.drawable.mieramenspesial.jpg);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "15");
        values.put("nama", "Nasi Gurami Penyet");
        values.put("jenis", "Menu Sambelan");
        values.put("harga", 15000);
        values.put("img", R.drawable.nasiguramipenyet.jpg);
	values.put("quantity","0");
        db.insert("menu", "_id", values);
	
	values.put("_id", "16");
        values.put("nama", "Nasi Ayam Goreng");
        values.put("jenis", "Makanan");
        values.put("harga", 10000);
        values.put("img", R.drawable.nasiayamgoreng.jpg);
	values.put("quantity","0");
        db.insert("menu", "_id", values);
	
	values.put("_id", "17");
        values.put("nama", "Nasi Ayam Kremes");
        values.put("jenis", "Menu Kremesan");
        values.put("harga", 13000);
        values.put("img", R.drawable.nasiayamkremes.jpg);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "18");
        values.put("nama", "Nasi Goreng SUMO");
        values.put("jenis", "Makanan");
        values.put("harga", 25000);
        values.put("img", R.drawable.ngorengsumo.jpg);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "19");
        values.put("nama", "Nasi Cap Cay");
        values.put("jenis", "Chinese Food");
        values.put("harga", 11000);
        values.put("img", R.drawable.capcay.jpg);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "20");
        values.put("nama", "Es Milo Jumbo");
        values.put("jenis", "Minuman");
        values.put("harga", 6000);
        values.put("img", R.drawable.esmilojumbo.jpg);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "21");
        values.put("nama", "Nasi Goreng");
        values.put("jenis", "Chinese Food");
        values.put("harga", 10000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "23");
        values.put("nama", "Mie Goreng");
        values.put("jenis", "Chinese Food");
        values.put("harga", 10000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "24");
        values.put("nama", "Nasi Cumi Saos Asam Manis");
        values.put("jenis", "Chinese Food");
        values.put("harga", 15000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "25");
        values.put("nama", "Nasi Koloke");
        values.put("jenis", "Chinese Food");
        values.put("harga", 10000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "26");
        values.put("nama", "Nasi Fuyunghai");
        values.put("jenis", "Chinese Food");
        values.put("harga", 10000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "27");
        values.put("nama", "Nasi Ayam Saos Asem Manis");
        values.put("jenis", "Chinese Food");
        values.put("harga", 13000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "28");
        values.put("nama", "Nasi Gurami Bakar");
        values.put("jenis", "Menu Kremesan");
        values.put("harga", 15000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "29");
        values.put("nama", "Nasi Bakar Tuna");
        values.put("jenis", "Menu Bakaran");
        values.put("harga", 9000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "30");
        values.put("nama", "Nasi Bakar Teriyaki");
        values.put("jenis", "Menu Bakaran");
        values.put("harga", 9000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "31");
        values.put("nama", "Nasi Bakar Ayam Jamur");
        values.put("jenis", "Menu Bakaran");
        values.put("harga", 9000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "32");
        values.put("nama", "Mie Tom-Yam ");
        values.put("jenis", "Menu Gila");
        values.put("harga", 10000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "33");
        values.put("nama", "Mie Tom Yam Special ");
        values.put("jenis", "Menu Gila");
        values.put("harga", 12000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "34");
        values.put("nama", "Mie Tom-Yam Super Special ");
        values.put("jenis", "Menu Gila");
        values.put("harga", 15000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "35");
        values.put("nama", "Mie Ramen ");
        values.put("jenis", "Menu Gila");
        values.put("harga", 10000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "36");
        values.put("nama", "Mie Ramen Super Special ");
        values.put("jenis", "Menu Gila");
        values.put("harga", 15000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "37");
        values.put("nama", "Roti Maryam Original");
        values.put("jenis", "Menu Makanan Selingan");
        values.put("harga", 5000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "38");
        values.put("nama", "Kentang Goreng");
        values.put("jenis", "Menu Makanan Selingan");
        values.put("harga", 6000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "39");
        values.put("nama", "Tahu Crispy");
        values.put("jenis", "Menu Makanan Selingan");
        values.put("harga", 6000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "40");
        values.put("nama", "Jamur Crispy");
        values.put("jenis", "Menu Makanan Selingan");
        values.put("harga", 8000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "41");
        values.put("nama", "Pisang Susu Original");
        values.put("jenis", "Menu Makanan Selingan");
        values.put("harga", 5000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "42");
        values.put("nama", "Roti Bakar");
        values.put("jenis", "Menu Makanan Selingan");
        values.put("harga", 6000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "43");
        values.put("nama", "Juice Jeruk Biasa");
        values.put("jenis", "Minuman");
        values.put("harga", 4000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "44");
        values.put("nama", "Juice Jeruk Jumbo");
        values.put("jenis", "Minuman");
        values.put("harga", 6000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "45");
        values.put("nama", "Juice Melon Biasa");
        values.put("jenis", "Minuman");
        values.put("harga", 4000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "46");
        values.put("nama", "Juice Melon Jumbo");
        values.put("jenis", "Minuman");
        values.put("harga", 6000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "47");
        values.put("nama", "Juice Semangka Biasa");
        values.put("jenis", "Minuman");
        values.put("harga", 4000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "48");
        values.put("nama", "Juice Semangka Jumbo");
        values.put("jenis", "Minuman");
        values.put("harga", 6000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "49");
        values.put("nama", "Juice Strawberry Biasa");
        values.put("jenis", "Minuman");
        values.put("harga", 4000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "50");
        values.put("nama", "Juice Strawberry Jumbo");
        values.put("jenis", "Minuman");
        values.put("harga", 6000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "51");
        values.put("nama", "Juice Alpukat Biasa");
        values.put("jenis", "Minuman");
        values.put("harga", 5000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "52");
        values.put("nama", "Juice Alpukat Jumbo");
        values.put("jenis", "Minuman");
        values.put("harga", 7000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "53");
        values.put("nama", "Es Buah");
        values.put("jenis", "Minuman");
        values.put("harga", 6000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "54");
        values.put("nama", "Es Lemon Tea");
        values.put("jenis", "Minuman");
        values.put("harga", 3000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "55");
        values.put("nama", "Es Selasih");
        values.put("jenis", "Minuman");
        values.put("harga", 3000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "56");
        values.put("nama", "Milk Shake Coklat Biasa");
        values.put("jenis", "Minuman");
        values.put("harga", 4000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "57");
        values.put("nama", "Vanilla Milk");
        values.put("jenis", "Minuman");
        values.put("harga", 5000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "58");
        values.put("nama", "Choco and Cookies");
        values.put("jenis", "Minuman");
        values.put("harga", 5000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "59");
        values.put("nama", "Taro Milk");
        values.put("jenis", "Minuman");
        values.put("harga", 5000);
        values.put("img", R.drawable.iconyeski);
	values.put("quantity","0");
        db.insert("menu", "_id", values);

	values.put("_id", "60");
        values.put("nama", "Susu Soda");
        values.put("jenis", "Minuman");
        values.put("harga", 8000);
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
