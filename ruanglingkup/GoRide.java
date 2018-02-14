package com.example.arpiansyahagi.ruanglingkup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class GoRide extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_ride);
        getSupportActionBar().setTitle("Folder");

        pdfView = (PDFView) findViewById (R.id.pdfView);
        pdfView.fromAsset("Modul_Programming_Android_dengan_Android.pdf").load();
    }
}
