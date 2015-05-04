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


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.tool_activity);

        Bundle bundle = getIntent().getExtras();
        final int toolScanned = bundle.getInt("toolSelection");
        ToolModel toolModel = new ToolModel(this, toolScanned);


        findViewById(R.id.tool_activity_background).setBackgroundResource(toolModel.getToolDrawable());

        ExpandableListView expListViewLocation = (ExpandableListView) findViewById(R.id.location_exp_list_view);
        expListViewLocation.setAdapter(new ToolLocationAdapter(this, toolModel));

        ExpandableListView expListViewSafety = (ExpandableListView) findViewById(R.id.safety_exp_list_view);
        expListViewSafety.setAdapter(new ToolSafetyAdapter(this, toolModel));

//        //set on item click listener to the nested expandable list view in here (!)
//        expListViewSafety.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
//            @Override
//            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
//                return true;
//            }
//        });









    }




}