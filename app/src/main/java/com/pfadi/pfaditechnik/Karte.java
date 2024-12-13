package com.pfadi.pfaditechnik;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.pfadi.pfaditechnik.R;

public class Karte extends AppCompatActivity implements View.OnClickListener {

    private Button btnHomeReg;
    private RelativeLayout relRegister;
    private RelativeLayout relKoordinaten;
    private RelativeLayout relSignaturen;
    private Button btnKarte;
    private Button btnHamburger;
    private Button btnHomeIcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_karte);


        WebView webPunktgg = findViewById(R.id.webPunktgg);
        String pointGG = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/6iBE6whhse8?si=Y2Ugb-GFuYAp0Xhg\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        webPunktgg.loadData(pointGG, "text/html", "utf-8");
        webPunktgg.getSettings().setJavaScriptEnabled(true);
        webPunktgg.setWebChromeClient(new WebChromeClient());

        WebView webKoordinatengg = findViewById(R.id.webKoordinatengg);
        String koordinatenGG = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/bZQlHGNno94?si=DvO3HBKC6telWNLk\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        webKoordinatengg.loadData(koordinatenGG, "text/html", "utf-8");
        webKoordinatengg.getSettings().setJavaScriptEnabled(true);
        webKoordinatengg.setWebChromeClient(new WebChromeClient());


        btnHomeReg = findViewById(R.id.btnHomeReg);
        btnHomeReg.setOnClickListener(this);
        btnHamburger = findViewById(R.id.btnHamburger);
        btnHamburger.setOnClickListener(this);
        btnKarte = findViewById(R.id.btnKarte);
        btnKarte.setOnClickListener(this);

        relRegister = findViewById(R.id.relRegister);
        relKoordinaten = findViewById(R.id.relKoordinaten);
        relSignaturen = findViewById(R.id.relSignaturen);

        Button btnSignaturen = findViewById(R.id.btnSignaturen);
        btnSignaturen.setOnClickListener(this);

        Button btnKoordinaten = findViewById(R.id.btnKoordinaten);
        btnKoordinaten.setOnClickListener(this);

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
            btnHomeIcon.setVisibility(View.GONE);
            btnHomeReg.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.btnHomeReg) {
            relRegister.setVisibility(View.GONE);
            btnHamburger.setVisibility(View.VISIBLE);
            btnHomeReg.setVisibility(View.GONE);
            btnHomeIcon.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.btnPionierReg){
            Intent intentPionier = new Intent(Karte.this, Pionier.class);
            startActivity(intentPionier);
        } else if (v.getId() == R.id.btnSamariterReg) {
            Intent intentSamariter = new Intent(Karte.this, Samariter.class);
            startActivity(intentSamariter);
        } else if (v.getId() == R.id.btnUbermittlungReg) {
            Intent intentUbermittlung = new Intent(Karte.this, Ubermittlung.class);
            startActivity(intentUbermittlung);
        } else if (v.getId() == R.id.btnNaturReg) {
            Intent intentNatur = new Intent(Karte.this, Natur.class);
            startActivity(intentNatur);
        } else if (v.getId() == R.id.btnKarteReg) {
            Intent intentKarte = new Intent(Karte.this, Karte.class);
            startActivity(intentKarte);
        } else if (v.getId() == R.id.btnGeschichteReg) {
            Intent intentGeschichte = new Intent(Karte.this, Pfadigeschichte.class);
            startActivity(intentGeschichte);
        } else if (v.getId() == R.id.btnSonstigesReg) {
            Intent intentSonstiges = new Intent(Karte.this, Sonstiges.class);
            startActivity(intentSonstiges);
        } else if (v.getId() == R.id.btnHomeIcon) {
            Intent intentHome = new Intent(Karte.this, MainActivity.class);
            startActivity(intentHome);
        } else if (v.getId() == R.id.btnKarte) {
            relKoordinaten.setVisibility(View.GONE);
            relSignaturen.setVisibility(View.GONE);
        } else if (v.getId() == R.id.btnKoordinaten) {
            relKoordinaten.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.btnSignaturen) {
            relSignaturen.setVisibility(View.VISIBLE);
        }
    }
}