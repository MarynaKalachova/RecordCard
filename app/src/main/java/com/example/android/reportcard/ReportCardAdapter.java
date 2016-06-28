package com.example.android.reportcard;

import android.view.View;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


/*
* {@link AndroidFlavorAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
* based on a data source, which is a list of {@link AndroidFlavor} objects.
* */
public class ReportCardAdapter extends ArrayAdapter<ReportCard> {

    private static final String LOG_TAG = ReportCardAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the List is the data we want
     * to populate into the lists
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param reportCard A List of AndroidFlavor objects to display in a list
     */
    public ReportCardAdapter(Activity context, ArrayList<ReportCard> reportCard) {

        super(context, 0, reportCard);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The AdapterView position that is requesting a view
     * @param convertView The recycled view to populate.
     *                    (search online for "android view recycling" to learn more)
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        ReportCard currentReportCard = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentReportCard.getCourseName());

        TextView creditTextView = (TextView) listItemView.findViewById(R.id.credit);
        creditTextView.setText(currentReportCard.creditToString());

        TextView gradeTextView = (TextView) listItemView.findViewById(R.id.grade);
        gradeTextView.setText(currentReportCard.gradeToString());

        return listItemView;
    }
}