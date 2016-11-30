package com.example.user.myorderyeski;

/**
 * Created by Ahsanul Marom
 */

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuMuka extends MainPage {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.menulayout);

                ImageButton about = (ImageButton) findViewById(R.id.about);
                ImageButton faq = (ImageButton) findViewById(R.id.faq);
                ImageButton promo = (ImageButton) findViewById(R.id.promo);
                ImageButton order = (ImageButton) findViewById(R.id.order);
                final ImageButton daftarmenu = (ImageButton) findViewById(R.id.menu);
                final Context context = this;

                about.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                Intent i = new Intent(context, About.class);
                                startActivity(i);
                        }
                });
                faq.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                Intent i = new Intent(context, FaqPage.class);
                                startActivity(i);
                        }
                });
                promo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                Intent i = new Intent(context, PromoPage.class);
                                startActivity(i);
                        }
                });
                daftarmenu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                Intent i = new Intent(context, DaftarMenuList.class);
                                startActivity(i);
                        }
                });
                order.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                Intent i = new Intent(context, FormOrder.class);
                                startActivity(i);
                        }
                });
        }
}