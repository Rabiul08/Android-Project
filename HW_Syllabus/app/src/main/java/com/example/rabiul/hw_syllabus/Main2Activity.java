package com.example.rabiul.hw_syllabus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Main2Activity extends AppCompatActivity {
    PDFView pdfView;
    MainActivity obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        switch (obj.select)
        {
            case 3111:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("Syllabus_CSE3111.pdf").load();
                break;
            case 3112:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3112.pdf").load();
                break;
            case 3121:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3121.pdf").load();
                break;
            case 3132:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3132.pdf").load();
                break;
            case 3141:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3141.pdf").load();
                break;
            case 3142:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3142.pdf").load();
                break;
            case 3151:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3151.pdf").load();
                break;
            case 3152:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3152.pdf").load();
                break;
            case 3162:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3162.pdf").load();
                break;
            case 3211:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3211.pdf").load();
                break;
            case 3222:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3221.pdf").load();
            break;
            case 3221:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3222.pdf").load();
                break;
            case 3231:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3231.pdf").load();
                break;
            case 3232:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3232.pdf").load();
                break;
            case 3241:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3241.pdf").load();
                break;
            case 3242:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3242.pdf").load();
                break;
            case 3251:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3261.pdf").load();
                break;
            case 3252:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3262.pdf").load();
                break;
                default:
                    break;


        }

    }
}
