package com.digitalent.ektp.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.digitalent.ektp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    BottomNavigationView navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Bottom Nav
       navView = findViewById(R.id.nav_bottomNavigationView);
       NavController navController = Navigation.findNavController(this, R.id.nav_HostFragment);
       NavigationUI.setupWithNavController(navView, navController);

    }
}
