package com.digitalent.ektp.view.fragments.buatKTP;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.digitalent.ektp.R;

public class DokumenPendukungFragment extends Fragment {

    private LinearLayout btn_uploadkk, btn_uploadrtrw;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dokumen_pendukung, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btn_uploadkk = view.findViewById(R.id.btn_uploadkk);
        btn_uploadrtrw = view.findViewById(R.id.btn_uploadrtrw);
    }
}