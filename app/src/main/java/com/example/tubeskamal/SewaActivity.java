package com.example.tubeskamal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.graphics.Color.rgb;

public class SewaActivity extends AppCompatActivity {

    TextView txSewa,txPilih1,txPilih2,txPilih3;
    Button btnTrans;

    Integer hitung1=0,hitung2=0,hitung3=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sewa);

        txSewa = findViewById(R.id.txsewa);
        txSewa.setText(getIntent().getStringExtra("JudulContent"));

        txPilih1 = findViewById(R.id.txpilihan1);
        txPilih1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hitung1==0){
                    txPilih1.setBackgroundColor(rgb(16, 172, 132));
                    hitung1++;
                }
                else{
                    txPilih1.setBackgroundColor(rgb(255, 255, 255));
                    hitung1=0;
                }
            }
        });
        txPilih2 = findViewById(R.id.txpilihan2);
        txPilih2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hitung2==0){
                    txPilih2.setBackgroundColor(rgb(16, 172, 132));
                    hitung2++;
                }
                else{
                    txPilih2.setBackgroundColor(rgb(255, 255, 255));
                    hitung2=0;
                }
            }
        });
        txPilih3 = findViewById(R.id.txpilihan3);
        txPilih3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hitung3==0){
                    txPilih3.setBackgroundColor(rgb(16, 172, 132));
                    hitung3++;
                }
                else{
                    txPilih3.setBackgroundColor(rgb(255, 255, 255));
                    hitung3=0;
                }
            }
        });

        btnTrans = findViewById(R.id.button2);
        btnTrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TransferActivity.class);
                startActivity(intent);
            }
        });
    }

}