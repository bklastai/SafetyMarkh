package com.markh.safety.safetymarkh.controller;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import com.markh.safety.safetymarkh.R;
import com.markh.safety.safetymarkh.model.ToolModel;
import com.markh.safety.safetymarkh.view.ExpAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
* Created by Benas on 3/1/2015.
*/

public class ToolActivity extends Activity {

    private ToolModel toolModel = new ToolModel();
    private ExpAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<Integer>> listDataChild;
    private int toolScanned;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tool_expand);

        Bundle bundle = getIntent().getExtras();
        toolScanned = bundle.getInt("toolSelection");


        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData(toolScanned);

        listAdapter = new ExpAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
        //todo set onGroupClickedListener
    }

    /*
     * Preparing the list data
     */
    private void prepareListData(int toolPosition) {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<Integer>>();

        // Adding child data
        listDataHeader.add(getString(R.string.button_tool_location));
        listDataHeader.add(getString(R.string.button_safety_info));

        // Adding child data
        List<Integer> locationImages = new ArrayList<Integer>();
        locationImages.add(toolModel.getToolLocationDrawable(toolPosition));

        List<Integer> safetyTexts = new ArrayList<Integer>();
        safetyTexts.add(toolModel.getToolDrawable(toolPosition));
        safetyTexts.add(toolModel.getToolSafetyInfo(toolPosition));

        listDataChild.put(listDataHeader.get(0), locationImages); // Header, Child data
        listDataChild.put(listDataHeader.get(1), safetyTexts);
    }
}