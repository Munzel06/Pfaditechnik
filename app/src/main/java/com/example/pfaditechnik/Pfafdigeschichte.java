package com.example.pfaditechnik;

import android.content.Intent;
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

public class Pfafdigeschichte extends AppCompatActivity implements View.OnClickListener {

    private Button btnHomeReg;
    private RelativeLayout relRegister;
    private Button btnHamburger;
    private Button btnHomeIcon;

    @Override
    public void onClick(View v){
        if (v.getId() == R.id.btnHamburger) {
            relRegister.setVisibility(View.VISIBLE);
            btnHamburger.setVisibility(View.GONE);
            btnHomeReg.setVisibility(View.VISIBLE);
            btnHomeIcon.setVisibility(View.GONE);
        } else if (v.getId() == R.id.btnHomeReg) {
            relRegister.setVisibility(View.GONE);
            btnHamburger.setVisibility(View.VISIBLE);
            btnHomeReg.setVisibility(View.GONE);
            btnHomeIcon.setVisibility(View.VISIBLE);
        }  else if (v.getId() == R.id.btnPionierReg){
            Intent intentPionier = new Intent(Pfafdigeschichte.this, Pionier.class);
            startActivity(intentPionier);
        } else if (v.getId() == R.id.btnSamariterReg) {
            Intent intentSamariter = new Intent(Pfafdigeschichte.this, Samariter.class);
            startActivity(intentSamariter);
        } else if (v.getId() == R.id.btnUbermittlungReg) {
            Intent intentUbermittlung = new Intent(Pfafdigeschichte.this, Ubermittlung.class);
            startActivity(intentUbermittlung);
        } else if (v.getId() == R.id.btnNaturReg) {
            Intent intentNatur = new Intent(Pfafdigeschichte.this, Natur.class);
            startActivity(intentNatur);
        } else if (v.getId() == R.id.btnKarteReg) {
            Intent intentKarte = new Intent(Pfafdigeschichte.this, Karte.class);
            startActivity(intentKarte);
        } else if (v.getId() == R.id.btnGeschichteReg) {
            Intent intentGeschichte = new Intent(Pfafdigeschichte.this, Pfafdigeschichte.class);
            startActivity(intentGeschichte);
        } else if (v.getId() == R.id.btnSonstigesReg) {
            Intent intentSonstiges = new Intent(Pfafdigeschichte.this, Sonstiges.class);
            startActivity(intentSonstiges);
        } else if (v.getId() == R.id.btnHomeIcon) {
            Intent intentHome = new Intent(Pfafdigeschichte.this, MainActivity.class);
            startActivity(intentHome);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pfafdigeschichte);

        btnHomeReg = findViewById(R.id.btnHomeReg);
        btnHomeReg.setOnClickListener(this);
        btnHamburger = findViewById(R.id.btnHamburger);
        btnHamburger.setOnClickListener(this);
        relRegister = findViewById(R.id.relRegister);

        Button btnPionierReg = findViewById(R.id.btnPionierReg);
        btnPionierReg.setOnClickListener(this);

        Button btnSamariterReg = findViewById(R.id.btnSamariterReg);
        btnSamariterReg.setOnClickListener(this);

        Button btnUbermittlungReg = findViewById(R.id.btnUbermittlungReg);
        btnUbermittlungReg.setOnClickListener(this);

        Button btnNaturReg = findViewById(R.id.btnNaturReg);
        btnNaturReg.setOnClickListener(this);

        Button btnKarteReg = findViewById(R.id.btnKarteReg);
        btnKarteReg.setOnClickListener(this);

        Button btnGeschichteReg = findViewById(R.id.btnGeschichteReg);
        btnGeschichteReg.setOnClickListener(this);

        Button btnSonstigesReg = findViewById(R.id.btnSonstigesReg);
        btnSonstigesReg.setOnClickListener(this);

        btnHomeIcon = findViewById(R.id.btnHomeIcon);
        btnHomeIcon.setOnClickListener(this);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

}