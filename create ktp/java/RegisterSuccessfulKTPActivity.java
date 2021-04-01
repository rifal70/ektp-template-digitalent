package com.digitalent.ektp.view.fragments.buatKTP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.digitalent.ektp.R;
import com.digitalent.ektp.view.HomeActivity;
import com.digitalent.ektp.view.fragments.lacakKTP.TrackKTPWithResultActivity;

public class RegisterSuccessfulKTPActivity extends AppCompatActivity {

    private LinearLayout btn_close, btn_track;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_successful_ktp);
        btn_close = findViewById(R.id.btn_close);
        btn_track = findViewById(R.id.btn_track);

        btn_track.setOnClickListener(v -> {
            Intent intent = new Intent(RegisterSuccessfulKTPActivity.this, TrackKTPWithResultActivity.class);
            startActivity(intent);
            finish();
        });

        btn_close.setOnClickListener(v -> {
            Intent intent = new Intent(RegisterSuccessfulKTPActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();
        });
    }
}