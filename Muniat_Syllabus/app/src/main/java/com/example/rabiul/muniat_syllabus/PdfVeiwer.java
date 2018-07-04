package com.example.rabiul.muniat_syllabus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;

public class PdfVeiwer extends AppCompatActivity {
    PDFView pdfView;
    Third_Year_odds obj;
    Third_Year_evens obj2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_veiwer);


        switch (obj.select)
        {
            case 3111:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("Syllabus_CSE3111.pdf").load();
                obj.select=0;
                break;
            case 3112:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3112.pdf").load();
                obj.select=0;
                break;
            case 3121:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3121.pdf").load();
                obj.select=0;
                break;
            case 3132:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3132.pdf").load();
                obj.select=0;
                break;
            case 3141:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3141.pdf").load();
                obj.select=0;
                break;
            case 3142:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3142.pdf").load();
                obj.select=0;
                break;
            case 3151:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3151.pdf").load();
                obj.select=0;
                break;
            case 3152:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3152.pdf").load();
                obj.select=0;
                break;
            case 3162:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3162.pdf").load();
                obj.select=0;
                break;
                default:
                    break;
        }
        switch (obj2.select)
        {
            case 3211:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3211.pdf").load();

                obj2.select=0;
                break;
            case 3222:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3221.pdf").load();
                obj2.select=0;
                break;
            case 3221:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3222.pdf").load();
                obj2.select=0;
                break;
            case 3231:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3231.pdf").load();
                obj2.select=0;
                break;
            case 3232:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3232.pdf").load();
                obj2.select=0;
                break;
            case 3241:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3241.pdf").load();
                obj2.select=0;
                break;
            case 3242:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3242.pdf").load();
                obj2.select=0;
                break;
            case 3251:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3261.pdf").load();
                obj2.select=0;
                break;
            case 3252:
                pdfView=(PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("cse3262.pdf").load();
                obj2.select=0;
                break;
            default:
                break;

        }
    }
}
