package com.digitalent.ektp.view.fragments.buatKTP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.digitalent.ektp.R;

public class KonfirmasiDataKTPActivity extends AppCompatActivity {

    private LinearLayout btn_send;
    private TextView tv_actionbar_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi_data_ktp);
        btn_send = findViewById(R.id.btn_send);
        tv_actionbar_title = findViewById(R.id.tv_actionbar_title);
        tv_actionbar_title.setText("Konfirmasi Data KTP");

        btn_send.setOnClickListener(v -> {
            Intent intent = new Intent(KonfirmasiDataKTPActivity.this, RegisterSuccessfulKTPActivity.class);
            startActivity(intent);
            finish();
        });
    }
}