package com.markh.safety.safetymarkh;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by Benas on 3/12/2015.
 */
public class ToolLocationActivity extends Activity {

    private Integer[] toolInfos = {R.drawable.location0, R.drawable.location1, R.drawable.location2, R.drawable.location3, R.drawable.location4, R.drawable.location5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tool_adapter);

        Bundle bundle = getIntent().getExtras();
        final int locationRequest = bundle.getInt("locationRequest");
        final Integer[] tool = new Integer[]{toolInfos[locationRequest]};

        final ListView listView = (ListView) findViewById(R.id.toolAdapterListView);
        listView.setAdapter(new ToolAdapter(getApplicationContext(), R.layout.tool_location_image, tool));
    }


}
