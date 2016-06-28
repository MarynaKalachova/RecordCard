package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ReportCard> reportCards = new ArrayList<ReportCard>();
        reportCards.add(new ReportCard("COMP 5201", 4, 'B'));
        reportCards.add(new ReportCard("COMP 5511", 4, 'B'));
        reportCards.add(new ReportCard("ENCS 6721", 4, 'A'));
        reportCards.add(new ReportCard("COMP 5361", 4, 'A'));
        reportCards.add(new ReportCard("COMP 5461", 4, 'A'));
        reportCards.add(new ReportCard("COMP 5541", 4, 'A'));
        reportCards.add(new ReportCard("ENCS 5721", 4, 'A'));

        ReportCardAdapter cardAdapter = new ReportCardAdapter(this, reportCards);
        ListView listView = (ListView) findViewById(R.id.listview_reportcard);
        listView.setAdapter(cardAdapter);
    }
}
