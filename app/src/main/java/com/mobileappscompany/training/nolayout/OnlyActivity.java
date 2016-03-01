package com.mobileappscompany.training.nolayout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by New Guy on 3/1/2016.
 */
public class OnlyActivity extends Activity {

    TextView mTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        mTV = new TextView(this);
        mTV.setText("This works!");

        setContentView(mTV);
    }
}
