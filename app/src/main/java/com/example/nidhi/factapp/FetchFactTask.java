package com.example.nidhi.factapp;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.view.View;

/**
 * Created by Nidhi on 11/03/2015.
 */
public class FetchFactTask extends AsyncTask {
    private Context mContext;
    private View rootView;
    private int id;
    private int category;

    public FetchFactTask(Context context, View rootView, int id, int category){
        this.mContext=context;
        this.rootView=rootView;
        this.id = id;
        this.category = category;
    }

    @Override
    protected Object doInBackground(Object[] params) {
        View v = rootView.findViewById(id);

        Intent intent = new Intent(v.getContext(), FactActivity.class);
        intent.putExtra("category", Integer.toString(category) );
        mContext.startActivity(intent);

        return null;
    }
}
