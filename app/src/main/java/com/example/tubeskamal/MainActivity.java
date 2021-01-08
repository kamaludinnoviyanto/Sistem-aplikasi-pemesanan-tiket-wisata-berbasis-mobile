package com.example.tubeskamal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout Content1,Content2,Content3,Content4,Content5,Content6;
    TextView txJudul1,txJudul2,txJudul3,txJudul4,txJudul5,txJudul6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txJudul1 = findViewById(R.id.txjudul1);
        txJudul2 = findViewById(R.id.txjudul2);
        txJudul3 = findViewById(R.id.txjudul3);
        txJudul4 = findViewById(R.id.txjudul4);
        txJudul5 = findViewById(R.id.txjudul5);
        txJudul6 = findViewById(R.id.txjudul6);

        Content1 = findViewById(R.id.content1);
        Content2 = findViewById(R.id.content2);
        Content3 = findViewById(R.id.content3);
        Content4 = findViewById(R.id.content4);
        Content5 = findViewById(R.id.content5);
        Content6 = findViewById(R.id.content6);



        Content1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ContentActivity.class);
                    intent.putExtra("gambar", R.drawable.teh);
                    intent.putExtra("judul", txJudul1.getText());
                    intent.putExtra("deskripsi", " Kontur kebun teh yang berundak-undak bisa jadi olahraga akhir pekan yang lumayan menantang untukmu. Tapi tetap fresh dong, karena udaranya sejuk banget!");
                startActivity(intent);

            }
        });
        Content2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ContentActivity.class);
                    intent.putExtra("gambar", R.drawable.danau);
                    intent.putExtra("judul", txJudul2.getText());
                    intent.putExtra("deskripsi", " Ada banyak hal yang akan membuatmu takjub. Mulai dari pemandangan hingga fasilitas yang disediakan. Ada sepeda air, perahu, taman bermain, rumah makan, penginapan, dan masih banyak lagi lainnya yang akan membuat betah liburan di sini.");
                startActivity(intent);
            }
        });
        Content3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ContentActivity.class);
                    intent.putExtra("gambar", R.drawable.hutan);
                    intent.putExtra("judul", txJudul3.getText());
                    intent.putExtra("deskripsi", " Di tengah hutan, kita bisa menemukan sungai kecil. Kita bisa menaiki perahu untuk menelusuri sungai ini sambil melihat-lihat pemandangan berupa pohon-pohon rindang di kiri dan kanan sungai.");
                startActivity(intent);
            }
        });
        Content4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ContentActivity.class);
                    intent.putExtra("gambar", R.drawable.lembah);
                    intent.putExtra("judul", txJudul4.getText());
                    intent.putExtra("deskripsi", " Selain menikmati alamnya yang sejuk dan asri, kamu bisa berkemah di sini. Perbukitan mungil dan sungai yang jernih bakal membuatmu merasa benar-benar fresh.");
                startActivity(intent);
            }
        });
        Content5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ContentActivity.class);
                    intent.putExtra("gambar", R.drawable.villa);
                    intent.putExtra("judul", txJudul5.getText());
                    intent.putExtra("deskripsi", " Menawarkan akomodasi dengan taman, fasilitas barbekyu, teras, serta pemandangan taman. Akomodasi ber-AC ini berjarak 5 km dari Jalan Riau. Anda dapat menggunakan parkir pribadi di lokasi dan Wi-Fi gratis.");
                startActivity(intent);
            }
        });
        Content6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ContentActivity.class);
                    intent.putExtra("gambar", R.drawable.pemandian);
                    intent.putExtra("judul", txJudul6.getText());
                    intent.putExtra("deskripsi", " Di tepi kolam air panas, terdapat deretan kursi berpayung untuk kamu bersantai setelah berendam. Selain itu, fasilitas lain yang bisa kamu nikmati adalah kantin, ruang mandi, hingga ruangspa. Bahkan, tersedia pula resort bagi kamu yang ingin menginap.");
                startActivity(intent);
            }
        });


    }


}