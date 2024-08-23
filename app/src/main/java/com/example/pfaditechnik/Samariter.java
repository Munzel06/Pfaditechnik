package com.example.pfaditechnik;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Samariter extends AppCompatActivity implements View.OnClickListener {

    private Button btnHomeReg;
    private RelativeLayout relRegister;
    private RelativeLayout relVerhalten;
    private Button btnHamburger;
    private Button btnHomeIcon;
    private Button btnSamariter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_samariter);

        btnHomeReg = findViewById(R.id.btnHomeReg);
        btnHomeReg.setOnClickListener(this);
        btnHamburger = findViewById(R.id.btnHamburger);
        btnHamburger.setOnClickListener(this);
        Button btnVerhalten = findViewById(R.id.btnVerhalten);
        btnVerhalten.setOnClickListener(this);
        btnSamariter = findViewById(R.id.btnSamariter);
        btnSamariter.setOnClickListener(this);

        relRegister = findViewById(R.id.relRegister);
        relVerhalten = findViewById(R.id.relVerhalten);

        TextView txtPhone = findViewById(R.id.phoneTextView);
        txtPhone.setOnClickListener(this);

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
        }
        else if (v.getId() == R.id.btnHomeReg) {
            relRegister.setVisibility(View.GONE);
            btnHamburger.setVisibility(View.VISIBLE);
            btnHomeReg.setVisibility(View.GONE);
            btnHomeIcon.setVisibility(View.VISIBLE);
        }
        else if (v.getId() == R.id.btnPionierReg){
            Intent intentPionier = new Intent(Samariter.this, Pionier.class);
            startActivity(intentPionier);
        }
        else if (v.getId() == R.id.btnSamariterReg) {
            Intent intentSamariter = new Intent(Samariter.this, Samariter.class);
            startActivity(intentSamariter);
        }
        else if (v.getId() == R.id.btnUbermittlungReg) {
            Intent intentUbermittlung = new Intent(Samariter.this, Ubermittlung.class);
            startActivity(intentUbermittlung);
        }
        else if (v.getId() == R.id.btnNaturReg) {
            Intent intentNatur = new Intent(Samariter.this, Natur.class);
            startActivity(intentNatur);
        }
        else if (v.getId() == R.id.btnKarteReg) {
            Intent intentKarte = new Intent(Samariter.this, Karte.class);
            startActivity(intentKarte);
        }
        else if (v.getId() == R.id.btnGeschichteReg) {
            Intent intentGeschichte = new Intent(Samariter.this, Pfadigeschichte.class);
            startActivity(intentGeschichte);
        }
        else if (v.getId() == R.id.btnSonstigesReg) {
            Intent intentSonstiges = new Intent(Samariter.this, Sonstiges.class);
            startActivity(intentSonstiges);
        }
        else if (v.getId() == R.id.btnHomeIcon) {
            Intent intentHome = new Intent(Samariter.this, MainActivity.class);
            startActivity(intentHome);
        }
        else if (v.getId() == R.id.btnVerhalten) {
            relVerhalten.setVisibility(View.VISIBLE);
        }
        else if (v.getId() == R.id.btnSamariter) {
            relVerhalten.setVisibility(View.GONE);
        } else if (v.getId() == R.id.phoneTextView) {
            String phoneNumber = "144";
            Intent dialIntent = new Intent(Intent.ACTION_DIAL);
            dialIntent.setData(Uri.parse("tel:" + phoneNumber));
            startActivity(dialIntent);
        }
    }
}