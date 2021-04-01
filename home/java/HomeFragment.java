package com.digitalent.ektp.view.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.digitalent.ektp.R;
import com.digitalent.ektp.adapter.RvCardCategoryAdapter;
import com.digitalent.ektp.adapter.RvCardNewsAdapter;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    RecyclerView rv_cardcategory, rv_cardnews;
    private ArrayList<String> mtitle = new ArrayList<>();
    private ArrayList<String> mdesc = new ArrayList<>();
    private ArrayList<String> mbutton = new ArrayList<>();

    private ArrayList<String> mtitleN = new ArrayList<>();
    private ArrayList<String> mdescN = new ArrayList<>();
    private ArrayList<String> mdatetimeN = new ArrayList<>();
    private ArrayList<String> mreadmoreN = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv_cardcategory = view.findViewById(R.id.rv_cardcategory);
        rv_cardnews = view.findViewById(R.id.rv_cardnews);

        addCardCategoryData();
        addCardNewsData();

        LinearLayoutManager layoutManagerCard = new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false);
        LinearLayoutManager layoutManagerNews = new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false);
        rv_cardcategory.setLayoutManager(layoutManagerCard);
        rv_cardnews.setLayoutManager(layoutManagerNews);

        RvCardCategoryAdapter adapterCategory = new RvCardCategoryAdapter(getActivity(), mtitle, mdesc, mbutton);
        RvCardNewsAdapter adapterNews = new RvCardNewsAdapter(getActivity(), mtitleN, mdatetimeN, mdescN, mreadmoreN);

        rv_cardcategory.setAdapter(adapterCategory);
        rv_cardnews.setAdapter(adapterNews);

    }

    private void addCardCategoryData() {
        mtitle.add("Buat KTP Baru");
        mdesc.add("Lorem ipsum dolor sit amet amte rilo siloat");
        mbutton.add("Buat KTP Baru");

        mtitle.add("Update data KTP");
        mdesc.add("Lorem ipsum dolor sit amet amte rilo siloat");
        mbutton.add("Update data");

        mtitle.add("Lacak pembuatan KTP");
        mdesc.add("Lorem ipsum dolor sit amet amte rilo siloat");
        mbutton.add("Lacak");

        mtitle.add("Migrasi data");
        mdesc.add("Lorem ipsum dolor sit amet amte rilo siloat");
        mbutton.add("Migrasi data");

        mtitle.add("Lapor KTP hilang");
        mdesc.add("Lorem ipsum dolor sit amet amte rilo siloat");
        mbutton.add("Lapor");
    }

    private void addCardNewsData() {
        mtitleN.add("News1");
        mdatetimeN.add("Buat KTP Baru");
        mdescN.add("Lorem ipsum dolor sit amet amte rilo siloat");
        mreadmoreN.add("Read more");


        mtitleN.add("News2");
        mdatetimeN.add("Buat KTP Baru");
        mdescN.add("Lorem ipsum dolor sit amet amte rilo siloat");
        mreadmoreN.add("Read more");

        mtitleN.add("News3");
        mdatetimeN.add("Buat KTP Baru");
        mdescN.add("Lorem ipsum dolor sit amet amte rilo siloat");
        mreadmoreN.add("Read more");
    }


}