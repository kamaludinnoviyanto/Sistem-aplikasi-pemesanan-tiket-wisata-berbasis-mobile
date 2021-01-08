package com.example.tubeskamal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ContentActivity extends AppCompatActivity {

    ImageView imgContent;
    Button btnContent;
    TextView txJudul,txDeskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        txJudul = findViewById(R.id.txJudulId);
        txJudul.setText(getIntent().getStringExtra("judul"));

        txDeskripsi = findViewById(R.id.txdeskripsiId);
        txDeskripsi.setText(getIntent().getStringExtra("deskripsi"));

        imgContent = findViewById(R.id.imgContentId);
        Bundle bundle = getIntent().getExtras();
        int Gambar = bundle.getInt("gambar");
        imgContent.setImageResource(Gambar);

        btnContent = findViewById(R.id.btnContentId);
        btnContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SewaActivity.class);
                intent.putExtra("JudulContent", txJudul.getText());

                startActivity(intent);
            }
        });

    }
}