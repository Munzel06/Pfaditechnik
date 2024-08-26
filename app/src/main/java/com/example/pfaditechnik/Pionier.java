package com.example.pfaditechnik;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Pionier extends AppCompatActivity implements View.OnClickListener {

    private Button btnHomeReg;
    private RelativeLayout relRegister;
    private Button btnHamburger;
    private Button btnHomeIcon;
    private RelativeLayout relSeilkunde;
    private RelativeLayout relKnoten;
    private RelativeLayout relKrawattenKnopf;
    private Button btnPionier;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pionier);

        btnHomeReg = findViewById(R.id.btnHomeReg);
        btnHomeReg.setOnClickListener(this);
        btnHamburger = findViewById(R.id.btnHamburger);
        btnHamburger.setOnClickListener(this);
        btnPionier = findViewById(R.id.btnPionier);
        btnPionier.setOnClickListener(this);

        relRegister = findViewById(R.id.relRegister);
        relSeilkunde = findViewById(R.id.relSeilkunde);
        relKnoten = findViewById(R.id.relKnoten);
        relKrawattenKnopf = findViewById(R.id.relKrawattenKnopf);

        Button btnKrawattenKnopf = findViewById(R.id.btnKrawattenKnopf);
        btnKrawattenKnopf.setOnClickListener(this);

        Button btnKnoten = findViewById(R.id.btnPfadiKnoten);
        btnKnoten.setOnClickListener(this);

        Button btnSeilkunde = findViewById(R.id.btnSeilkunde);
        btnSeilkunde.setOnClickListener(this);

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

    @Override
    public void onClick(View v) {
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
        } else if (v.getId() == R.id.btnPionierReg){
            Intent intentPionier = new Intent(Pionier.this, Pionier.class);
            startActivity(intentPionier);
        } else if (v.getId() == R.id.btnSamariterReg) {
            Intent intentSamariter = new Intent(Pionier.this, Samariter.class);
            startActivity(intentSamariter);
        } else if (v.getId() == R.id.btnUbermittlungReg) {
            Intent intentUbermittlung = new Intent(Pionier.this, Ubermittlung.class);
            startActivity(intentUbermittlung);
        } else if (v.getId() == R.id.btnNaturReg) {
            Intent intentNatur = new Intent(Pionier.this, Natur.class);
            startActivity(intentNatur);
        } else if (v.getId() == R.id.btnKarteReg) {
            Intent intentKarte = new Intent(Pionier.this, Karte.class);
            startActivity(intentKarte);
        } else if (v.getId() == R.id.btnGeschichteReg) {
            Intent intentGeschichte = new Intent(Pionier.this, Pfadigeschichte.class);
            startActivity(intentGeschichte);
        } else if (v.getId() == R.id.btnSonstigesReg) {
            Intent intentSonstiges = new Intent(Pionier.this, Sonstiges.class);
            startActivity(intentSonstiges);
        } else if (v.getId() == R.id.btnHomeIcon) {
            Intent intentHome = new Intent(Pionier.this, MainActivity.class);
            startActivity(intentHome);
        } else if (v.getId() == R.id.btnPionier) {
            relSeilkunde.setVisibility(View.GONE);
            relKnoten.setVisibility(View.GONE);
            relKrawattenKnopf.setVisibility(View.GONE);
        } else if (v.getId() == R.id.btnSeilkunde) {
            relSeilkunde.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.btnPfadiKnoten) {
            relKnoten.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.btnKrawattenKnopf) {
            relKrawattenKnopf.setVisibility(View.VISIBLE);
        }
    }
}