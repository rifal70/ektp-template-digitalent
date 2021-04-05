package com.digitalent.ektp.view.fragments.buatKTP;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.digitalent.ektp.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class VerifikasiKTPFragment extends Fragment {

    private LinearLayout btn_ttd, btn_fingerprint;
    private BottomSheetDialog bottomSheetDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_verifikasi_ktp, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btn_ttd = view.findViewById(R.id.btn_ttd);
        btn_fingerprint = view.findViewById(R.id.btn_fingerprint);

        btn_ttd.setOnClickListener(v -> {
            bottomSheetDialog = new BottomSheetDialog(getActivity(), R.style.BottomSheetTheme);
            View sheetView = LayoutInflater.from(getActivity()).inflate(R.layout.bottom_sheet_layout,
                   view.findViewById(R.id.bottom_sheet));

            sheetView.findViewById(R.id.btn_ulangi).setOnClickListener(view1 -> {
                Toast.makeText(getActivity(), "Ulangi Button Clicked", Toast.LENGTH_SHORT).show();
            });
            sheetView.findViewById(R.id.btn_simpan).setOnClickListener(view1 -> {
                Toast.makeText(getActivity(), "Simpan Button Clicked", Toast.LENGTH_SHORT).show();
            });
            bottomSheetDialog.setContentView(sheetView);
            bottomSheetDialog.show();
        });
    }
}