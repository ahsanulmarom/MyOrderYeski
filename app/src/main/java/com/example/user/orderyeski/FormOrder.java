package com.example.user.myorderyeski;

/**
 * Created by Ahsanul Marom
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class FormOrder extends Activity {
    ImageButton buttonForm;
    static EditText namaForm;
    static EditText nohpForm;
    static EditText alamatForm;
    String nama, hp, alamat;
    Context context = this;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orderformlayout);

        buttonForm = (ImageButton) findViewById(R.id.buttonform);

        namaForm = (EditText) findViewById(R.id.formnama);
        nohpForm = (EditText) findViewById(R.id.formnotelp);
        alamatForm = (EditText) findViewById(R.id.formalamat);

        buttonForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = namaForm.getText().toString();
                hp = nohpForm.getText().toString();
                alamat = alamatForm.getText().toString();
                if (nama.isEmpty()) {
                    namaForm.setError("Harus disii");
                } else if (nama.length() < 5) {
                    namaForm.setError("Nama minimal 5 karakter");
                } else if (hp.isEmpty()) {
                    nohpForm.setError("Harus Diisi");
                } else if (hp.length() < 5) {
                    nohpForm.setError("No HP minimal 5 karakter");
                } else if (alamat.isEmpty()) {
                    alamatForm.setError("Harus Diisi");
                } else if (alamat.length() < 10) {
                    alamatForm.setError("Alamat minimal 10 karakter");
                } else {
                    Intent i = new Intent(context, DaftarMenuOrder.class);
                    startActivity(i);
                }
            }
        });
    }
}
