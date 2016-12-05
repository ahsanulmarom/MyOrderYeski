package com.example.user.myorderyeski;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class DaftarMenuOrder extends Activity implements View.OnClickListener{
    TableLayout tabelMenu;
    ArrayList<Button> buttonEdit = new ArrayList<Button>();
    ImageButton BtnKonfirm;
    ImageButton BtnNol;
    Context context = this;
    DB_Menu dbMenu = new DB_Menu(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ordermenulayout);


        BtnNol = (ImageButton) findViewById(R.id.btnNol);
        BtnNol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dbMenu.nolkanSemua();
                    Toast.makeText(getApplicationContext(), "Reset Berhasil", Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Reset Gagal", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
                finish();
                startActivity(getIntent());
            }
        });

        BtnKonfirm = (ImageButton) findViewById(R.id.btnkonfirm);
        BtnKonfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, KonfirmasiPesanan.class);
                startActivity(i);
            }
        });

        tabelMenu = (TableLayout) findViewById(R.id.tableMenu);

        TableRow barisTabel = new TableRow(this);
        barisTabel.setBackgroundColor(Color.WHITE);

        TextView viewHeaderNama = new TextView(this);
        TextView viewHeaderHarga = new TextView(this);
        TextView viewHeaderJumlah = new TextView(this);
        TextView viewHeaderAction = new TextView(this);

        viewHeaderNama.setText("Nama");
        viewHeaderNama.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        viewHeaderHarga.setText("Harga");
        viewHeaderHarga.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        viewHeaderJumlah.setText("Jumlah");
        viewHeaderJumlah.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        viewHeaderAction.setText("Aksi");
        viewHeaderAction.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        viewHeaderNama.setPadding(5, 1, 5, 1);
        viewHeaderHarga.setPadding(5, 1, 5, 1);
        viewHeaderJumlah.setPadding(5, 1, 5, 1);
        viewHeaderAction.setPadding(5, 1, 5, 1);

        barisTabel.addView(viewHeaderNama);
        barisTabel.addView(viewHeaderHarga);
        barisTabel.addView(viewHeaderJumlah);
        barisTabel.addView(viewHeaderAction);

        tabelMenu.addView(barisTabel, new TableLayout.LayoutParams(ViewPager.LayoutParams.WRAP_CONTENT,
                ViewPager.LayoutParams.WRAP_CONTENT));

        ArrayList<HashMap<String, String>> arrayListMenu = dbMenu.tampilMenu();

        if (arrayListMenu.size() > 0) {
            for (int i = 0; i < arrayListMenu.size(); i++) {
                HashMap<String, String> hashMapRecordMenu = arrayListMenu.get(i);
                String name = hashMapRecordMenu.get("nama");
                String harga = hashMapRecordMenu.get("harga");
                String jumlah = hashMapRecordMenu.get("quantity");
                String id = hashMapRecordMenu.get("_id");

                barisTabel = new TableRow(this);

                TextView viewNama = new TextView(this);
                viewNama.setText(name);
                viewNama.setTextColor(Color.WHITE);
                viewNama.setPadding(5, 1, 5, 1);
                barisTabel.addView(viewNama);

                TextView viewHarga = new TextView(this);
                viewHarga.setText(harga);
                viewHarga.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                viewHarga.setTextColor(Color.WHITE);
                viewHarga.setPadding(5, 1, 5, 1);
                barisTabel.addView(viewHarga);

                TextView viewJumlah = new TextView(this);
                viewJumlah.setText(jumlah);
                viewJumlah.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                viewJumlah.setTextColor(Color.WHITE);
                viewJumlah.setPadding(5, 1, 5, 1);
                barisTabel.addView(viewJumlah);

                buttonEdit.add(i, new Button(this));
                buttonEdit.get(i).setId(Integer.parseInt(id));
                buttonEdit.get(i).setTag("Atur Quantity");
                buttonEdit.get(i).setText("Atur Quantity");
                buttonEdit.get(i).setOnClickListener(this);
                barisTabel.addView(buttonEdit.get(i));

                tabelMenu.addView(barisTabel, new TableLayout.LayoutParams(ViewPager.LayoutParams.MATCH_PARENT,
                        ViewPager.LayoutParams.MATCH_PARENT));
            }
        }
    }
    @Override
    public void onClick(View view) {
        for (int i = 0; i < buttonEdit.size(); i++) {
            if (view.getId() == buttonEdit.get(i).getId() && view.getTag().toString().trim().equals("Atur Quantity")) {
                int id = buttonEdit.get(i).getId();
                dbMenu.kembalikanHarga(id);
                getDataByID(id);
            }
        }
    }

    public void getDataByID(final int id) {
        String jumlahEdit = null;
        final EditText editJumlah;
        final TextView viewId;
        double hargaMenu = 0.0;
        HashMap<String, String> hashMapData = dbMenu.tampilMenuID(id);
        final double hargaAsli = Double.parseDouble(hashMapData.get("harga"));

        for (int i = 0; i < hashMapData.size(); i++) {
            jumlahEdit = hashMapData.get("quantity");
            hargaMenu = Double.parseDouble(hashMapData.get("harga"));
        }

        LinearLayout layoutInput = new LinearLayout(this);
        layoutInput.setOrientation(LinearLayout.VERTICAL);

        viewId = new TextView(this);
        viewId.setText(String.valueOf(id));
        viewId.setTextColor(Color.TRANSPARENT);
        layoutInput.addView(viewId);

        editJumlah = new EditText(this);
        editJumlah.setText(jumlahEdit);
        editJumlah.setError("Harus diisi antara 0 hingga 50");
        editJumlah.setInputType(InputType.TYPE_CLASS_NUMBER);
        layoutInput.addView(editJumlah);

        final TextView menuHarga = new TextView(this);
        menuHarga.setText(String.valueOf(hargaAsli));
        layoutInput.addView(menuHarga);

        AlertDialog.Builder builderEditMenu = new AlertDialog.Builder(this);
        builderEditMenu.setTitle("Masukkan Jumlah Pesanan");
        builderEditMenu.setView(layoutInput);
        final double finalHargaMenu = hargaMenu;
        final double[] x = {0};
        builderEditMenu.setPositiveButton("Update", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String jumlah = editJumlah.getText().toString();
                if (jumlah.isEmpty()) {
                    jumlah = "0";
                    x[0] = hargaAsli;
                }else if(Double.parseDouble(jumlah) >50) {
                    jumlah = "50";
                    x[0] = finalHargaMenu * 50;
                }else if (Double.parseDouble(jumlah) > 1) {
                    x[0] = finalHargaMenu * Double.parseDouble(jumlah);
                } else {
                    x[0] = hargaAsli;
                }
                dbMenu.updateJumlah(Integer.parseInt(viewId.getText().toString()), jumlah, x[0]);
                finish();
                startActivity(getIntent());
            }
        });

        builderEditMenu.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        builderEditMenu.setNegativeButton("Reset", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dbMenu.kembalikanHarga(Integer.parseInt(viewId.getText().toString()));
                dbMenu.nolkanJumlah(Integer.parseInt(viewId.getText().toString()));
                finish();
                startActivity(getIntent());
            }
        });
        builderEditMenu.show();
    }
}
