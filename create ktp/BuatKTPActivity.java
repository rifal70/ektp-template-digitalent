package com.digitalent.ektp.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.digitalent.ektp.R;
import com.digitalent.ektp.view.fragments.buatKTP.DataDiriFragment;
import com.digitalent.ektp.view.fragments.buatKTP.DokumenPendukungFragment;
import com.digitalent.ektp.view.fragments.buatKTP.KonfirmasiDataKTPActivity;
import com.digitalent.ektp.view.fragments.buatKTP.PhotoFragment;
import com.digitalent.ektp.view.fragments.buatKTP.RegisterSuccessfulKTPActivity;
import com.digitalent.ektp.view.fragments.buatKTP.VerifikasiKTPFragment;

public class BuatKTPActivity extends AppCompatActivity {

    private TextView tv_actionbar_title;
    private ImageView btn_back, iv_stepper;
    private Button btn_lanjut;
    private View fl_fragment;
    private int page = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buat_ktp);

        btn_back = findViewById(R.id.btn_back);
        iv_stepper = findViewById(R.id.iv_stepper);
        btn_lanjut = findViewById(R.id.btn_lanjut);
        fl_fragment = findViewById(R.id.fl_fragment);
        tv_actionbar_title = findViewById(R.id.tv_actionbar_title);
        tv_actionbar_title.setText("Buat KTP Baru");

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.fl_fragment, new DataDiriFragment());
        ft.commit();

        btn_back.setOnClickListener(v -> {
            onBackPressed();
            finish();
        });

        btn_lanjut.setOnClickListener(v -> {
            if (page == 0) {
                iv_stepper.setImageResource(R.drawable.img_stepper2);
                FragmentManager fragmentManager2 = getSupportFragmentManager();
                FragmentTransaction ft2 = fragmentManager2.beginTransaction();
                ft2.replace(R.id.fl_fragment, new PhotoFragment());
                ft2.commit();
                page++;
            } else if (page == 1) {
                iv_stepper.setImageResource(R.drawable.img_stepper3);
                FragmentManager fragmentManager2 = getSupportFragmentManager();
                FragmentTransaction ft2 = fragmentManager2.beginTransaction();
                ft2.replace(R.id.fl_fragment, new DokumenPendukungFragment());
                ft2.commit();
                page++;
            } else if (page ==2) {
                iv_stepper.setImageResource(R.drawable.img_stepper4);
                FragmentManager fragmentManager2 = getSupportFragmentManager();
                FragmentTransaction ft2 = fragmentManager2.beginTransaction();
                ft2.replace(R.id.fl_fragment, new VerifikasiKTPFragment());
                ft2.commit();
                page++;
            } else if (page == 3) {
                Intent intent = new Intent(BuatKTPActivity.this, KonfirmasiDataKTPActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
