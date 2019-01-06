/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<Earthquake> earthquakes = new ArrayList<>();
        earthquakes.add(new Earthquake("San Francisco", "1.6", "Feb 2,2016"));
        earthquakes.add(new Earthquake("London", "3.2", "Jan 6,2012"));
        earthquakes.add(new Earthquake("Tokyo", "7.9", "Aug 21,2006"));
        earthquakes.add(new Earthquake("Mexico City", "4.5", "Nov 9,2002"));
        earthquakes.add(new Earthquake("Moscow", "8.8", "June 7,2012"));
        earthquakes.add(new Earthquake("Rio de Janeiro", "3.9", "July 18,2013"));
        earthquakes.add(new Earthquake("Paris", "6.2", "May 14,2018"));
        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);
        EarthquakeAdapter quakeAdapter = new EarthquakeAdapter(this, earthquakes);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(quakeAdapter);
    }
}
