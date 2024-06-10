package com.example.pfaditechnik;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnHamburger) {
            btnHamburger.setVisibility(View.GONE);
            relPionier.setVisibility(View.GONE);
            relRegister.setVisibility(View.VISIBLE);
            btnHome.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.btnHome) {
            relRegister.setVisibility(View.GONE);
            btnHome.setVisibility(View.GONE);
            btnHamburger.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.btnPionier) {
            relRegister.setVisibility(View.GONE);
            btnHome.setVisibility(View.GONE);
            relPionier.setVisibility(View.VISIBLE);
            btnHamburger.setVisibility(View.VISIBLE);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        relRegister = findViewById(R.id.relRegister);
        relPionier = findViewById(R.id.relPionier);

        btnHamburger = findViewById(R.id.btnHamburger);
        btnHamburger.setOnClickListener(this);
        btnHome = findViewById(R.id.btnHome);
        btnHome.setOnClickListener(this);
        btnPionier = findViewById(R.id.btnPionier);
        btnPionier.setOnClickListener(this);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}