package com.digitalent.ektp.view.fragments.buatKTP;

import android.app.DatePickerDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.digitalent.ektp.R;

import java.util.Calendar;

public class DataDiriFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    private Spinner sp_provinsi, sp_kota, sp_kelurahan, sp_kecamatan, sp_gender, sp_agama, sp_status, sp_kewarganegaraan;
    private EditText et_fullname, et_alamat, et_tempatlahir, et_tanggallahir, et_pekerjaan;
    private int mDate, mMonth, mYear;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_data_diri, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sp_provinsi = view.findViewById(R.id.sp_provinsi);
        sp_kota = view.findViewById(R.id.sp_kota);
        sp_kelurahan = view.findViewById(R.id.sp_kelurahan);
        sp_kecamatan = view.findViewById(R.id.sp_kecamatan);
        sp_gender = view.findViewById(R.id.sp_gender);
        sp_kecamatan = view.findViewById(R.id.sp_kecamatan);
        sp_agama = view.findViewById(R.id.sp_agama);
        sp_status = view.findViewById(R.id.sp_status);
        sp_kewarganegaraan = view.findViewById(R.id.sp_kewarganegaraan);
        et_fullname = view.findViewById(R.id.et_fullname);
        et_alamat = view.findViewById(R.id.et_alamat);
        et_tempatlahir = view.findViewById(R.id.et_tempatlahir);
        et_tanggallahir = view.findViewById(R.id.et_tanggallahir);
        et_pekerjaan = view.findViewById(R.id.et_pekerjaan);

        et_tanggallahir.setOnClickListener(v -> {
            final Calendar calendar = Calendar.getInstance();
            mDate = calendar.get(Calendar.DATE);
            mMonth = calendar.get(Calendar.MONTH);
            mYear = calendar.get(Calendar.YEAR);
            DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(), android.R.style.Theme_DeviceDefault_Dialog, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int year, int month, int date) {
                    et_tanggallahir.setText(date+" / "+month+" / "+year);
                }
            }, mYear, mMonth, mDate);
            datePickerDialog.show();
        });


        // Adapter Provinsi
        ArrayAdapter<CharSequence> adapterProvinsi = ArrayAdapter.createFromResource(getActivity(), R.array.provinsi, R.layout.sp_myselected_item);
        adapterProvinsi.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_provinsi.setAdapter(adapterProvinsi);

        // Adapter Kota
        ArrayAdapter<CharSequence> adapterKota = ArrayAdapter.createFromResource(getActivity(), R.array.kota, R.layout.sp_myselected_item);
        adapterKota.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_kota.setAdapter(adapterKota);

        // Adapter Kelurahan
        ArrayAdapter<CharSequence> adapterKelurahan = ArrayAdapter.createFromResource(getActivity(), R.array.kelurahan, R.layout.sp_myselected_item);
        adapterKelurahan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_kelurahan.setAdapter(adapterKelurahan);

        // Adapter Kecamatan
        ArrayAdapter<CharSequence> adapterKecamatan = ArrayAdapter.createFromResource(getActivity(), R.array.kecamatan, R.layout.sp_myselected_item);
        adapterKecamatan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_kecamatan.setAdapter(adapterKecamatan);

        // Adapter Gender
        ArrayAdapter<CharSequence> adapterGender = ArrayAdapter.createFromResource(getActivity(), R.array.gender, R.layout.sp_myselected_item);
        adapterGender.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_gender.setAdapter(adapterGender);

        // Adapter Agama
        ArrayAdapter<CharSequence> adapterAgama = ArrayAdapter.createFromResource(getActivity(), R.array.agama, R.layout.sp_myselected_item);
        adapterAgama.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_agama.setAdapter(adapterAgama);

        // Adapter Status Perkawinan
        ArrayAdapter<CharSequence> adapterStatus = ArrayAdapter.createFromResource(getActivity(), R.array.status, R.layout.sp_myselected_item);
        adapterStatus.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_status.setAdapter(adapterStatus);

        // Adapter Kewarganegaraan
        ArrayAdapter<CharSequence> adapterKewarganegaraan = ArrayAdapter.createFromResource(getActivity(), R.array.kewarganegaraan, R.layout.sp_myselected_item);
        adapterKewarganegaraan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_kewarganegaraan.setAdapter(adapterKewarganegaraan);

        sp_provinsi.setOnItemSelectedListener(this);
        sp_kota.setOnItemSelectedListener(this);
        sp_kecamatan.setOnItemSelectedListener(this);
        sp_kelurahan.setOnItemSelectedListener(this);
        sp_gender.setOnItemSelectedListener(this);
        sp_agama.setOnItemSelectedListener(this);
        sp_status.setOnItemSelectedListener(this);
        sp_kewarganegaraan.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        if (adapterView.getId() == R.id.sp_provinsi) {
            if (adapterView.getItemAtPosition(i).equals("Pilih Provinsi")) {
                // do nothing
            } else {
                String choice = adapterView.getItemAtPosition(i).toString();
                // Sementara
                Toast.makeText(getContext(), choice, Toast.LENGTH_SHORT).show();
            }
        } else if (adapterView.getId() == R.id.sp_kota) {
            if (adapterView.getItemAtPosition(i).equals("Pilih Kota")) {
                // do nothing
            } else {
                String choice = adapterView.getItemAtPosition(i).toString();
                // Sementara
                Toast.makeText(getContext(), choice, Toast.LENGTH_SHORT).show();
            }
        }  else if (adapterView.getId() == R.id.sp_kecamatan) {
            if (adapterView.getItemAtPosition(i).equals("Pilih Kecamatan")) {
                // do nothing
            } else {
                String choice = adapterView.getItemAtPosition(i).toString();
                // Sementara
                Toast.makeText(getContext(), choice, Toast.LENGTH_SHORT).show();
            }
        } else if (adapterView.getId() == R.id.sp_kelurahan) {
            if (adapterView.getItemAtPosition(i).equals("Pilih Kelurahan")) {
                // do nothing
            } else {
                String choice = adapterView.getItemAtPosition(i).toString();
                // Sementara
                Toast.makeText(getContext(), choice, Toast.LENGTH_SHORT).show();
            }
        } else if (adapterView.getId() == R.id.sp_gender) {
            if (adapterView.getItemAtPosition(i).equals("Pilih Jenis Kelamin")) {
                // do nothing
            } else {
                String choice = adapterView.getItemAtPosition(i).toString();
                // Sementara
                Toast.makeText(getContext(), choice, Toast.LENGTH_SHORT).show();
            }
        } else if (adapterView.getId() == R.id.sp_agama) {
            if (adapterView.getItemAtPosition(i).equals("Pilih Agama")) {
                // do nothing
            } else {
                String choice = adapterView.getItemAtPosition(i).toString();
                // Sementara
                Toast.makeText(getContext(), choice, Toast.LENGTH_SHORT).show();
            }
        } else if (adapterView.getId() == R.id.sp_status) {
            if (adapterView.getItemAtPosition(i).equals("Pilih Status Perkawinan")) {
                // do nothing
            } else {
                String choice = adapterView.getItemAtPosition(i).toString();
                // Sementara
                Toast.makeText(getContext(), choice, Toast.LENGTH_SHORT).show();
            }
        } else if (adapterView.getId() == R.id.sp_kewarganegaraan) {
            if (adapterView.getItemAtPosition(i).equals("Pilih Status Kewarganegaraan")) {
                // do nothing
            } else {
                String choice = adapterView.getItemAtPosition(i).toString();
                // Sementara
                Toast.makeText(getContext(), choice, Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void init() {

    }
}
