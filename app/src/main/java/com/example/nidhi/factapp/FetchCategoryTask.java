package com.example.nidhi.factapp;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.view.View;

/**
 * Created by Nidhi on 11/03/2015.
 */
public class FetchCategoryTask extends AsyncTask {
    private Context mContext;
    private View rootView;

    public FetchCategoryTask(Context context, View rootView){
        this.mContext=context;
        this.rootView=rootView;
    }

    @Override
    protected Object doInBackground(Object[] params) {
        View v = rootView.findViewById(R.id.categoryButton);

        Intent intent = new Intent(v.getContext(), CategoryActivity.class);

        mContext.startActivity(intent);
        return null;
    }
}
