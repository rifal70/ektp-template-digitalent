package com.digitalent.ektp.view.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.digitalent.ektp.R;
import com.digitalent.ektp.view.BuatKTPActivity;
import com.digitalent.ektp.view.fragments.lacakKTP.TrackKTPWithResultActivity;

public class CategoryFragment extends Fragment {

    private CardView cv_buatKTP, cv_updateKTP, cv_lacakKTP, cv_migrasiData, cv_laporKTPhilang;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        cv_buatKTP = view.findViewById(R.id.cv_buatKTP);
        cv_updateKTP = view.findViewById(R.id.cv_updateKTP);
        cv_lacakKTP = view.findViewById(R.id.cv_lacakKTP);
        cv_migrasiData = view.findViewById(R.id.cv_migrasiData);
        cv_laporKTPhilang = view.findViewById(R.id.cv_laporKTPhilang);

        cv_buatKTP.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), BuatKTPActivity.class);
            startActivity(intent);
        });

        cv_updateKTP.setOnClickListener(v -> {
            // Do Something
        });

        cv_lacakKTP.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), TrackKTPWithResultActivity.class);
            startActivity(intent);
        });

        cv_migrasiData.setOnClickListener(v -> {
            // Do Something
        });

        cv_laporKTPhilang.setOnClickListener(v -> {
            // Do Something

        });
    }
}