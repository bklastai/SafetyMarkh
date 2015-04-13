package com.markh.safety.safetymarkh.controller;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import com.markh.safety.safetymarkh.R;
import com.markh.safety.safetymarkh.view.ToolSafetyAdapter;
import com.markh.safety.safetymarkh.view.ToolAdapter;

/**
* Created by Benas on 3/1/2015.
*/

public class ToolActivity extends Activity {

    private ToolAdapter toolAdapter;
    private ToolSafetyAdapter toolSafetyAdapter;//???????????????????
    private ExpandableListView expListView;
    private int toolScanned;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.tool_expand);

        Bundle bundle = getIntent().getExtras();
        toolScanned = bundle.getInt("toolSelection");

        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        toolAdapter = new ToolAdapter(this, toolScanned);
        toolSafetyAdapter = new ToolSafetyAdapter(this, toolScanned);//???????????????????

        expListView.setAdapter(toolAdapter);
    }

}