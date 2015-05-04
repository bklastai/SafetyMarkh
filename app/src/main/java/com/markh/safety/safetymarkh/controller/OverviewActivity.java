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

    private Integer[] overviewImages = {R.drawable.power_drill_bits1, R.drawable.power_drill_bits1, R.drawable.router_bits1, R.drawable.dremel_bits1, R.drawable.drill_bits1};
//    private String[][] overviewListedPoints;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.overview_activity);

        int overviewSelection = getIntent().getExtras().getInt("overviewSelection");

//        initListedPoints();

        ListView overviewListView = (ListView) findViewById(R.id.overview_list_view);
        overviewListView.setAdapter(new OverviewAdapter(this, overviewSelection));

        findViewById(R.id.overview_image).setBackgroundResource(overviewImages[overviewSelection]);


    }

//    private void initListedPoints(){
//        Resources res = getResources();
//        overviewListedPoints = new String[][]{};
//        for (int i=0 ; i<overviewImages.length; i++){
//            if (overviewImages[i].equals(R.drawable.power_drill_bits1)){
//                overviewListedPoints[i] = res.getStringArray(R.array.power_drill_types);
//            }
//            else if (overviewImages[i].equals(R.drawable.router_bits1)){
//                overviewListedPoints[i] = res.getStringArray(R.array.router_bits);
//            }
//            else if (overviewImages[i].equals(R.drawable.dremel_bits1)){
//                overviewListedPoints[i] = res.getStringArray(R.array.dremel_bits);
//            }
//            else if (overviewImages[i].equals(R.drawable.drill_bits1)){
//                overviewListedPoints[i] = res.getStringArray(R.array.drill_bits);
//            }
//        }
//    }




}
