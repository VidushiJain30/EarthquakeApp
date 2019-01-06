package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
    private static final String LOG_TAG = EarthquakeAdapter.class.getSimpleName();
    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView magnitude = (TextView) listItemView.findViewById(R.id.mag);
        magnitude.setText(currentEarthquake.getMagnitude());

        TextView location = (TextView) listItemView.findViewById(R.id.place);
        location.setText(currentEarthquake.getPlace());

        TextView times = (TextView) listItemView.findViewById(R.id.date);
        times.setText(currentEarthquake.getDate());

        return listItemView;
    }

}
