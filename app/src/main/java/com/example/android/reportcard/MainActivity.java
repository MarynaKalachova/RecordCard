package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ReportCard> reportCard = new ArrayList<ReportCard>();
        reportCard.add(new ReportCard("COMP 5201", 4, 'B'));
        reportCard.add(new ReportCard("COMP 5511", 4, 'B'));
        reportCard.add(new ReportCard("ENCS 6721", 4, 'A'));
        reportCard.add(new ReportCard("COMP 5361", 4, 'A'));
        reportCard.add(new ReportCard("COMP 5461", 4, 'A'));
        reportCard.add(new ReportCard("COMP 5541", 4, 'A'));
        reportCard.add(new ReportCard("ENCS 5721", 4, 'A'));
    }
}
