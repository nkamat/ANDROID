package com.example.nidhi.factapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class FactActivity extends ActionBarActivity {

    private int category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact);

        category = Integer.parseInt((String) getIntent().getExtras().getString("category"));
        TextView txtViewFactCategory = (TextView) findViewById(R.id.factCategory);
        txtViewFactCategory.setText(FactsProvider.getCategoryName(category));

        TextView txtViewFactDescription = (TextView) findViewById(R.id.factDescription);
        txtViewFactDescription.setText(FactsProvider.getFact(category));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fact, menu);
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
