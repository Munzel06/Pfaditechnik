package com.example.pfaditechnik;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RelativeLayout relRegister;
    private RelativeLayout relPionier;
    private Button btnHamburger;
    private Button btnHome;
    private Button btnPionier;
    private ImageButton btnPionierHome;
    private Button btnHomeIcon;
    private RelativeLayout relSamariter;
    private ImageButton btnSamariterHome;
    private Button btnSamariter;
    private RelativeLayout relUbermittlung;
    private Button btnUbermittlung;
    private ImageButton btnUbermittlungHome;
    private RelativeLayout relNatur;
    private Button btnNatur;
    private ImageButton btnNaturHome;
    private RelativeLayout relKarte;
    private Button btnKarte;
    private ImageButton btnKarteHome;
    private RelativeLayout relGeschichte;
    private Button btnGeschichte;
    private ImageButton btnGeschichteHome;
    private RelativeLayout relSonstiges;
    private Button btnSonstiges;

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnHamburger) {
            homeScreen();
            relRegister.setVisibility(View.VISIBLE);
            btnHamburger.setVisibility(View.GONE);
            btnHome.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.btnHome) {
            homeScreen();
        } else if (v.getId() == R.id.btnPionier || v.getId() == R.id.btnPionierHome){
            homeScreen();
            btnHomeIcon.setVisibility(View.VISIBLE);
            relPionier.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.btnHomeIcon) {
            homeScreen();
        } else if (v.getId() == R.id.btnSamariter || v.getId() == R.id.btnSamariterHome) {
            homeScreen();
            btnHomeIcon.setVisibility(View.VISIBLE);
            relSamariter.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.btnUbermittlung || v.getId() == R.id.btnUbermittlungHome) {
            homeScreen();
            btnHomeIcon.setVisibility(View.VISIBLE);
            relUbermittlung.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.btnNatur || v.getId() == R.id.btnNaturHome) {
            homeScreen();
            btnHomeIcon.setVisibility(View.VISIBLE);
            relNatur.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.btnKarte || v.getId() == R.id.btnKarteHome) {
            homeScreen();
            btnHomeIcon.setVisibility(View.VISIBLE);
            relKarte.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.btnGeschichte || v.getId() == R.id.btnGeschichteHome) {
            homeScreen();
            btnHomeIcon.setVisibility(View.VISIBLE);
            relGeschichte.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.btnSonstiges) {
            homeScreen();
            btnHomeIcon.setVisibility(View.VISIBLE);
            relSonstiges.setVisibility(View.VISIBLE);

        }
    }

    private void homeScreen() {
        relRegister.setVisibility(View.GONE);
        relPionier.setVisibility(View.GONE);
        relSamariter.setVisibility(View.GONE);
        btnHome.setVisibility(View.GONE);
        btnHamburger.setVisibility(View.VISIBLE);
        btnHomeIcon.setVisibility(View.GONE);
        relUbermittlung.setVisibility(View.GONE);
        relNatur.setVisibility(View.GONE);
        relKarte.setVisibility(View.GONE);
        relGeschichte.setVisibility(View.GONE);
        relSonstiges.setVisibility(View.GONE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        relRegister = findViewById(R.id.relRegister);
        relPionier = findViewById(R.id.relPionier);
        relSamariter = findViewById(R.id.relSamariter);
        relUbermittlung = findViewById(R.id.relUbermittlung);
        relNatur = findViewById(R.id.relNatur);
        relKarte = findViewById(R.id.relKarte);
        relGeschichte = findViewById(R.id.relGeschichte);
        relSonstiges = findViewById(R.id.relSonstiges);

        btnHamburger = findViewById(R.id.btnHamburger);
        btnHamburger.setOnClickListener(this);
        btnHome = findViewById(R.id.btnHome);
        btnHome.setOnClickListener(this);
        btnHomeIcon = findViewById(R.id.btnHomeIcon);
        btnHomeIcon.setOnClickListener(this);

        btnPionier = findViewById(R.id.btnPionier);
        btnPionier.setOnClickListener(this);
        btnPionierHome = findViewById(R.id.btnPionierHome);
        btnPionierHome.setOnClickListener(this);

        btnSamariter = findViewById(R.id.btnSamariter);
        btnSamariter.setOnClickListener(this);
        btnSamariterHome = findViewById(R.id.btnSamariterHome);
        btnSamariterHome.setOnClickListener(this);

        btnUbermittlung = findViewById(R.id.btnUbermittlung);
        btnUbermittlung.setOnClickListener(this);
        btnUbermittlungHome = findViewById(R.id.btnUbermittlungHome);
        btnUbermittlungHome.setOnClickListener(this);

        btnNatur = findViewById(R.id.btnNatur);
        btnNatur.setOnClickListener(this);
        btnNaturHome = findViewById(R.id.btnNaturHome);
        btnNaturHome.setOnClickListener(this);

        btnKarte = findViewById(R.id.btnKarte);
        btnKarte.setOnClickListener(this);
        btnKarteHome = findViewById(R.id.btnKarteHome);
        btnKarteHome.setOnClickListener(this);

        btnGeschichte = findViewById(R.id.btnGeschichte);
        btnGeschichte.setOnClickListener(this);
        btnGeschichteHome = findViewById(R.id.btnGeschichteHome);
        btnGeschichteHome.setOnClickListener(this);

        btnSonstiges = findViewById(R.id.btnSonstiges);
        btnSonstiges.setOnClickListener(this);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}