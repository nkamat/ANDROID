package com.example.nidhi.factapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class CategoryActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        // Science Button
        Button scienceButton = (Button) findViewById(R.id.scienceButton);
        scienceButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                View rootView = getWindow().getDecorView().findViewById(android.R.id.content);
                new FetchFactTask(v.getContext(), rootView,R.id.scienceButton, FactsProvider.CATEGORY_SCIENCE ).loadInBackground();

            }
        });

        // History Button
        Button historyButton = (Button) findViewById(R.id.historyButton);
        historyButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                View rootView = getWindow().getDecorView().findViewById(android.R.id.content);
                new FetchFactTask(v.getContext(), rootView,R.id.historyButton, FactsProvider.CATEGORY_HISTORY ).loadInBackground();

            }
        });

        // Geography Button
        Button geographyButton = (Button) findViewById(R.id.geographyButton);
        geographyButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                View rootView = getWindow().getDecorView().findViewById(android.R.id.content);
                new FetchFactTask(v.getContext(), rootView,R.id.geographyButton, FactsProvider.CATEGORY_GEOGRAPHY ).loadInBackground();

            }
        });

        // Technology Button
        Button technologyButton = (Button) findViewById(R.id.technologyButton);
        technologyButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                View rootView = getWindow().getDecorView().findViewById(android.R.id.content);
                new FetchFactTask(v.getContext(), rootView,R.id.technologyButton, FactsProvider.CATEGORY_TECHNOLOGY ).loadInBackground();

            }
        });

        // Food Button
        Button foodButton = (Button) findViewById(R.id.foodButton);
        foodButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                View rootView = getWindow().getDecorView().findViewById(android.R.id.content);
                new FetchFactTask(v.getContext(), rootView,R.id.foodButton, FactsProvider.CATEGORY_FOOD ).loadInBackground();

            }
        });

        // Animal Button
        Button animalButton = (Button) findViewById(R.id.animalButton);
        animalButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                View rootView = getWindow().getDecorView().findViewById(android.R.id.content);
                new FetchFactTask(v.getContext(), rootView,R.id.animalButton, FactsProvider.CATEGORY_ANIMAL ).loadInBackground();

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_category, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
