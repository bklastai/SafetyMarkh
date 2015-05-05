package com.markh.safety.safetymarkh.controller;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.markh.safety.safetymarkh.R;
import com.markh.safety.safetymarkh.view.OverviewAdapter;

/**
 * Created by Benas on 5/4/2015.
 */
public class OverviewActivity extends Activity {

//    private Integer[] overviewImages = {R.drawable.power_drill_bits1, R.drawable.power_drill_bits1, R.drawable.router_bits1, R.drawable.dremel_bits1, R.drawable.drill_bits1};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.overview_activity);

        int overviewSelection = getIntent().getExtras().getInt("overviewSelection");


        ListView overviewListView = (ListView) findViewById(R.id.overview_list_view);
        overviewListView.setAdapter(new OverviewAdapter(this, overviewSelection));

//        findViewById(R.id.overview_image).setBackgroundResource(overviewImages[overviewSelection]);


    }




}
