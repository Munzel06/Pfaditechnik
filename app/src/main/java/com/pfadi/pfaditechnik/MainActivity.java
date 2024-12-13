package com.pfadi.pfaditechnik;

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

import com.pfadi.pfaditechnik.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RelativeLayout relRegister;
    private Button btnHamburger;
    private Button btnHomeReg;

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnHamburger) {
            homeScreen();
            relRegister.setVisibility(View.VISIBLE);
            btnHamburger.setVisibility(View.GONE);
            btnHomeReg.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.btnHomeReg) {
            homeScreen();
        } else if (v.getId() == R.id.btnPionierReg || v.getId() == R.id.btnPionierHome){
            Intent intentPionier = new Intent(MainActivity.this, Pionier.class);
            startActivity(intentPionier);
        } else if (v.getId() == R.id.btnSamariterReg || v.getId() == R.id.btnSamariterHome) {
            Intent intentSamariter = new Intent(MainActivity.this, Samariter.class);
            startActivity(intentSamariter);
        } else if (v.getId() == R.id.btnUbermittlungReg || v.getId() == R.id.btnUbermittlungHome) {
            Intent intentUbermittlung = new Intent(MainActivity.this, Ubermittlung.class);
            startActivity(intentUbermittlung);
        } else if (v.getId() == R.id.btnNaturReg || v.getId() == R.id.btnNaturHome) {
            Intent intentNatur = new Intent(MainActivity.this, Natur.class);
            startActivity(intentNatur);
        } else if (v.getId() == R.id.btnKarteReg || v.getId() == R.id.btnKarteHome) {
            Intent intentKarte = new Intent(MainActivity.this, Karte.class);
            startActivity(intentKarte);
        } else if (v.getId() == R.id.btnGeschichteReg || v.getId() == R.id.btnGeschichteHome) {
            Intent intentGeschichte = new Intent(MainActivity.this, Pfadigeschichte.class);
            startActivity(intentGeschichte);
        } else if (v.getId() == R.id.btnSonstigesReg) {
            Intent intentSonstiges = new Intent(MainActivity.this, Sonstiges.class);
            startActivity(intentSonstiges);
        }
    }

    private void homeScreen() {
        relRegister.setVisibility(View.GONE);
        btnHamburger.setVisibility(View.VISIBLE);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        relRegister = findViewById(R.id.relRegister);

        btnHamburger = findViewById(R.id.btnHamburger);
        btnHamburger.setOnClickListener(this);
        btnHomeReg = findViewById(R.id.btnHomeReg);
        btnHomeReg.setOnClickListener(this);

        Button btnPionierReg = findViewById(R.id.btnPionierReg);
        btnPionierReg.setOnClickListener(this);
        ImageButton btnPionierHome = findViewById(R.id.btnPionierHome);
        btnPionierHome.setOnClickListener(this);

        Button btnSamariterReg = findViewById(R.id.btnSamariterReg);
        btnSamariterReg.setOnClickListener(this);
        ImageButton btnSamariterHome = findViewById(R.id.btnSamariterHome);
        btnSamariterHome.setOnClickListener(this);

        Button btnUbermittlungReg = findViewById(R.id.btnUbermittlungReg);
        btnUbermittlungReg.setOnClickListener(this);
        ImageButton btnUbermittlungHome = findViewById(R.id.btnUbermittlungHome);
        btnUbermittlungHome.setOnClickListener(this);

        Button btnNaturReg = findViewById(R.id.btnNaturReg);
        btnNaturReg.setOnClickListener(this);
        ImageButton btnNaturHome = findViewById(R.id.btnNaturHome);
        btnNaturHome.setOnClickListener(this);

        Button btnKarteReg = findViewById(R.id.btnKarteReg);
        btnKarteReg.setOnClickListener(this);
        ImageButton btnKarteHome = findViewById(R.id.btnKarteHome);
        btnKarteHome.setOnClickListener(this);

        Button btnGeschichteReg = findViewById(R.id.btnGeschichteReg);
        btnGeschichteReg.setOnClickListener(this);
        ImageButton btnGeschichteHome = findViewById(R.id.btnGeschichteHome);
        btnGeschichteHome.setOnClickListener(this);

        Button btnSonstigesReg = findViewById(R.id.btnSonstigesReg);
        btnSonstigesReg.setOnClickListener(this);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}