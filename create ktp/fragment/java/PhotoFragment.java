package com.digitalent.ektp.view.fragments.buatKTP;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.digitalent.ektp.R;
import com.digitalent.ektp.view.RegisterActivity;

public class PhotoFragment extends Fragment {

    private LinearLayout btn_uploadfoto;
    private TextView tv_syarat_ketentuan;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_photo, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btn_uploadfoto = view.findViewById(R.id.btn_uploadfoto);
        tv_syarat_ketentuan = view.findViewById(R.id.tv_syarat_ketentuan);

        btn_uploadfoto.setOnClickListener(v -> {
            // Do something
        });

        String text = "Pastikan foto jelas dan memenuhi Syarat & Ketentuan untuk pembuatan KTP";
        SpannableString spannableString = new SpannableString(text);
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                // Sementara
                Toast.makeText(getActivity(), "Syarat & ketentuan clicked", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.rgb(248,164,6));
                ds.setUnderlineText(false);
            }
        };
        spannableString.setSpan(clickableSpan, 33, 51, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv_syarat_ketentuan.setText(spannableString);
        tv_syarat_ketentuan.setMovementMethod(LinkMovementMethod.getInstance());
    }
}