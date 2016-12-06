package com.example.user.orderyeski;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class KonfirmasiPesanan extends Activity {
    SQLiteDatabase db;
    TextView tvkonfirm;
    ImageButton buttonkonfirm;
    DB_Menu dbMenu = new DB_Menu(this);

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmorderlayout);

        db = (new DB_Menu(this)).getReadableDatabase();
        tvkonfirm = (TextView) findViewById(R.id.tvkonfirmasi);
        buttonkonfirm = (ImageButton) findViewById(R.id.buttonkonfirmasi);


        String txt =
                "Nama : " + FormOrder.namaForm.getText().toString() +"\n"+
                        "No HP : " + FormOrder.nohpForm.getText()+"\n"+
                        "Alamat: " + FormOrder.alamatForm.getText().toString() +"\n\n" +
                        "Daftar Pesanan : \n" + dbMenu.tampilJumlahAtas0() + "\n\n" +
                        "Total Harga Barang: Rp " + dbMenu.hargaBarang() + "\n" +
                        "Ongkos kirim: Rp " + dbMenu.hargaOngkir() + "\n" +
                        "Jumlah Bayar: Rp " + dbMenu.jumlahHarga();

        tvkonfirm.setText(txt);
        buttonkonfirm.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                    sendSMS();
                }
        });

    }
}
