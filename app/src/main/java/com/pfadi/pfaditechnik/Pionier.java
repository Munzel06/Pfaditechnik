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

        WebView webKrawatte = findViewById(R.id.webKrawatte);
        String krawatte = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/_Hexs-FzCkA?si=LYRpVjB0pQbcWYcU\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        webKrawatte.loadData(krawatte, "text/html", "utf-8");
        webKrawatte.getSettings().setJavaScriptEnabled(true);
        webKrawatte.setWebChromeClient(new WebChromeClient());

        WebView webSamariter = findViewById(R.id.webSamariter);
        String samariter = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/2VpkdjliU4I?si=YDmFVeCfFWZwYm8c\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        webSamariter.loadData(samariter, "text/html", "utf-8");
        webSamariter.getSettings().setJavaScriptEnabled(true);
        webSamariter.setWebChromeClient(new WebChromeClient());

        WebView webWeber = findViewById(R.id.webWeber);
        String weber = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/iCAZ4N-arEg?si=SJRuIsp4DQS9rrVY\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        webWeber.loadData(weber, "text/html", "utf-8");
        webWeber.getSettings().setJavaScriptEnabled(true);
        webWeber.setWebChromeClient(new WebChromeClient());

        WebView webFischer = findViewById(R.id.webFischer);
        String fischer = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/hHzv_2_LBN8?si=udClPD1i61gyr94a\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        webFischer.loadData(fischer, "text/html", "utf-8");
        webFischer.getSettings().setJavaScriptEnabled(true);
        webFischer.setWebChromeClient(new WebChromeClient());

        WebView webAchter = findViewById(R.id.webAchter);
        String achter = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/X5O0tvPwgSw?si=DounyIOa4AJxmGLI\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        webAchter.loadData(achter, "text/html", "utf-8");
        webAchter.getSettings().setJavaScriptEnabled(true);
        webAchter.setWebChromeClient(new WebChromeClient());

        WebView webBretzeli = findViewById(R.id.webBretzeli);
        String bretzeli = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/2wTmtgPl1CI?si=j4nvNIuw5F7AjUpY\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        webBretzeli.loadData(bretzeli, "text/html", "utf-8");
        webBretzeli.getSettings().setJavaScriptEnabled(true);
        webBretzeli.setWebChromeClient(new WebChromeClient());

        WebView webMaurer = findViewById(R.id.webMaurer);
        String maurer = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/4dt-wOv8kAY?si=t6LZ-L1EpiOXOuqC\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        webMaurer.loadData(maurer, "text/html", "utf-8");
        webMaurer.getSettings().setJavaScriptEnabled(true);
        webMaurer.setWebChromeClient(new WebChromeClient());

        WebView webFlaschli = findViewById(R.id.webFläschli);
        String flaschli = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/3kJSCPdWMkg?si=LBY6onm95LzbE_46\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        webFlaschli.loadData(flaschli, "text/html", "utf-8");
        webFlaschli.getSettings().setJavaScriptEnabled(true);
        webFlaschli.setWebChromeClient(new WebChromeClient());

        WebView webFuhrmann = findViewById(R.id.webFuhrmann);
        String fuhrmann = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/R3R2MCH_vtI?si=h6zPbrQEoDhgHpVU\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        webFuhrmann.loadData(fuhrmann, "text/html", "utf-8");
        webFuhrmann.getSettings().setJavaScriptEnabled(true);
        webFuhrmann.setWebChromeClient(new WebChromeClient());

        WebView webAnker = findViewById(R.id.webAnker);
        String anker = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/F61qe5uIdR4?si=xJA5HVEn_umcy3gP\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        webAnker.loadData(anker, "text/html", "utf-8");
        webAnker.getSettings().setJavaScriptEnabled(true);
        webAnker.setWebChromeClient(new WebChromeClient());

        WebView webHalbmastwurf = findViewById(R.id.webHalbmastwurf);
        String halbmastwurf = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/gWCZxmfWo9A?si=iWDSp3pl-0e8q09a\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        webHalbmastwurf.loadData(halbmastwurf, "text/html", "utf-8");
        webHalbmastwurf.getSettings().setJavaScriptEnabled(true);
        webHalbmastwurf.setWebChromeClient(new WebChromeClient());

        WebView webMastwurf = findViewById(R.id.webMastwurf);
        String mastwurf = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/4PSEvp_lnYo?si=hOL9IAIEegtJbB09\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        webMastwurf.loadData(mastwurf, "text/html", "utf-8");
        webMastwurf.getSettings().setJavaScriptEnabled(true);
        webMastwurf.setWebChromeClient(new WebChromeClient());

        WebView webGeschtekterMastwurf = findViewById(R.id.webGeschtekterMastwurf);
        String geschtekterMastwurf = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/SNX_-aYCsns?si=AVgPkxCfLaGNvmHf\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        webGeschtekterMastwurf.loadData(geschtekterMastwurf, "text/html", "utf-8");
        webGeschtekterMastwurf.getSettings().setJavaScriptEnabled(true);
        webGeschtekterMastwurf.setWebChromeClient(new WebChromeClient());

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