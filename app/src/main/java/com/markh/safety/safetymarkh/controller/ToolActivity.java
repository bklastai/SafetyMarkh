package com.markh.safety.safetymarkh.controller;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import com.markh.safety.safetymarkh.R;
import com.markh.safety.safetymarkh.model.ToolModel;
import com.markh.safety.safetymarkh.view.ToolLocationAdapter;
import com.markh.safety.safetymarkh.view.ToolSafetyAdapter;

/**
* Created by Benas on 3/1/2015.
*/

public class ToolActivity extends Activity {

    private ExpandableListView expListViewLocation;
    private ExpandableListView expListViewSafety;
    private ToolModel toolModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tool_expand);

        Bundle bundle = getIntent().getExtras();
        int toolScanned = bundle.getInt("toolSelection");
        toolModel = new ToolModel(this, toolScanned);
        findViewById(R.id.lvExpLayout).setBackgroundResource(toolModel.getToolDrawable());

        expListViewLocation = (ExpandableListView) findViewById(R.id.lvExp);
        expListViewLocation.setAdapter(new ToolLocationAdapter(this, toolModel));

        expListViewSafety = (ExpandableListView) findViewById(R.id.lvExpSafety);
        expListViewSafety.setAdapter(new ToolSafetyAdapter(this, toolModel));
    }

}