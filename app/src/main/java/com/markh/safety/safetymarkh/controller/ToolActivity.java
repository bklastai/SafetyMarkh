package com.markh.safety.safetymarkh.controller;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

import com.markh.safety.safetymarkh.R;
import com.markh.safety.safetymarkh.model.ToolModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
* Created by Benas on 3/1/2015.
*/

public class ToolActivity extends Activity {

    private ExpandableListView expListViewLocation;
    private ExpandableListView expListViewSafety;

    private ToolModel toolModel = new ToolModel();
    private int toolScanned;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tool_expand);

        Bundle bundle = getIntent().getExtras();
        toolScanned = bundle.getInt("toolSelection");

        expListViewLocation = (ExpandableListView) findViewById(R.id.lvExp);
        expListViewSafety = (ExpandableListView) findViewById(R.id.lvExpSafety);

        expListViewLocation.setAdapter(new ToolLocationAdapter());
        expListViewSafety.setAdapter(new ToolSafetyAdapter());
    }

    public class ToolLocationAdapter extends BaseExpandableListAdapter {

        private List<Integer> _listDataHeader = new ArrayList<Integer>();
        private HashMap<Integer, List<Integer>> _listDataChild = new HashMap<Integer, List<Integer>>();

        public ToolLocationAdapter() {
            prepareListData();
        }
        @Override
        public View getChildView(int groupPosition, final int childPosition,
                                 boolean isLastChild, View convertView, ViewGroup parent) {
            Integer childResource = (Integer) getChild(groupPosition, childPosition);
            if (convertView == null){
                LayoutInflater infalInflater = (LayoutInflater) ToolActivity.this
                        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = infalInflater.inflate(R.layout.list_item, null);
            }
            ImageView img = (ImageView) convertView.findViewById(R.id.imgListItem);
            img.setBackgroundResource(childResource);

            return convertView;
        }
        @Override
        public View getGroupView(int groupPosition, boolean isExpanded,
                                 View convertView, ViewGroup parent) {
            Integer headerTitle = (Integer) getGroup(groupPosition);
            if (convertView == null) {
                LayoutInflater infalInflater = (LayoutInflater) ToolActivity.this
                        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = infalInflater.inflate(R.layout.list_header, null);
            }
            TextView lblListHeader = (TextView) convertView.findViewById(R.id.lblListHeader);
            lblListHeader.setTypeface(null, Typeface.BOLD);
            lblListHeader.setText(headerTitle);

            return convertView;
        }
        private void prepareListData() {
            _listDataHeader.add(R.string.button_tool_location);

            List<Integer> locationList = new ArrayList<>();
            locationList.add(toolModel.getToolLocationDrawable(toolScanned));

            _listDataChild.put(_listDataHeader.get(0), locationList);
        }
        @Override
        public Object getChild(int groupPosition, int childPosititon) {
            return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                    .get(childPosititon);
        }
        @Override
        public long getChildId(int groupPosition, int childPosition) {
            return 0;
        }
        @Override
        public int getChildrenCount(int groupPosition) {
            return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                    .size();
        }
        @Override
        public Object getGroup(int groupPosition) {
            return this._listDataHeader.get(groupPosition);
        }
        @Override
        public int getGroupCount() {
            return this._listDataHeader.size();
        }
        @Override
        public long getGroupId(int groupPosition) {
            return groupPosition;
        }
        @Override
        public boolean hasStableIds() {
            return false;
        }
        @Override
        public boolean isChildSelectable(int groupPosition, int childPosition) {
            return true;
        }
    }

    public class ToolSafetyAdapter extends BaseExpandableListAdapter {


        public ToolSafetyAdapter() {
        }
        @Override
        public View getChildView(int groupPosition, final int childPosition,
                                 boolean isLastChild, View convertView, ViewGroup parent) {
            CustExpListview SecondLevelexplv = new CustExpListview(ToolActivity.this);
            SecondLevelexplv.setAdapter(new ToolSafetyAdapter2());
            return SecondLevelexplv;
        }
        @Override
        public View getGroupView(int groupPosition, boolean isExpanded,
                                 View convertView, ViewGroup parent) {
            if (convertView == null) {
                LayoutInflater infalInflater = (LayoutInflater) ToolActivity.this
                        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = infalInflater.inflate(R.layout.list_header, null);
            }
            TextView lblListHeader = (TextView) convertView.findViewById(R.id.lblListHeader);
            lblListHeader.setTypeface(null, Typeface.BOLD);
            lblListHeader.setText(R.string.button_safety_info);
            return convertView;
        }
        @Override
        public Object getChild(int groupPosition, int childPosititon) {
            return childPosititon;
        }
        @Override
        public long getChildId(int groupPosition, int childPosition) {
            return childPosition;
        }
        @Override
        public int getChildrenCount(int groupPosition) {
            return 1;
        }
        @Override
        public Object getGroup(int groupPosition) {
            return groupPosition;
        }
        @Override
        public int getGroupCount() {
            return 1;
        }
        @Override
        public long getGroupId(int groupPosition) {
            return groupPosition;
        }
        @Override
        public boolean hasStableIds() {
            return true;
        }
        @Override
        public boolean isChildSelectable(int groupPosition, int childPosition) {
            return true;
        }
    }

    public class ToolSafetyAdapter2 extends BaseExpandableListAdapter {

        private List<Integer> _listDataHeader = new ArrayList<Integer>();
        private HashMap<Integer, List<Integer>> _listDataChild = new HashMap<Integer, List<Integer>>();

        public ToolSafetyAdapter2() {
            this.prepareListData();
        }
        @Override
        public View getChildView(int groupPosition, final int childPosition,
                                 boolean isLastChild, View convertView, ViewGroup parent) {
            Integer childResource = (Integer) getChild(groupPosition, childPosition);
            if (convertView == null){
                LayoutInflater infalInflater = (LayoutInflater) ToolActivity.this
                        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = infalInflater.inflate(R.layout.list_item_safety, null);
            }
            TextView txt = (TextView) convertView.findViewById(R.id.txtListItemSafety);
            txt.setText(childResource);

            return convertView;
        }
        @Override
        public View getGroupView(int groupPosition, boolean isExpanded,
                                 View convertView, ViewGroup parent) {
            Integer headerTitle = (Integer) getGroup(groupPosition);
            if (convertView == null) {
                LayoutInflater infalInflater = (LayoutInflater) ToolActivity.this
                        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = infalInflater.inflate(R.layout.list_header_safety, null);
            }
            TextView lblListHeader = (TextView) convertView.findViewById(R.id.lblListHeaderSafety);
            lblListHeader.setTypeface(null, Typeface.BOLD);
            lblListHeader.setText(headerTitle);

            return convertView;
        }

        public void prepareListData() {
            _listDataHeader.add(R.string.configuration);
            _listDataHeader.add(R.string.action_technique);
            _listDataHeader.add(R.string.adjustments);
            _listDataHeader.add(R.string.safety_reminders);
            _listDataHeader.add(R.string.cuts);

            List<Integer> configurationList = new ArrayList<Integer>();
            configurationList.add(toolModel.getToolSafetyInfo(toolScanned));

            List<Integer> actionTechniqueList = new ArrayList<Integer>();
            actionTechniqueList.add(toolModel.getToolSafetyInfo(toolScanned));

            List<Integer> adjustmentsList = new ArrayList<Integer>();
            adjustmentsList.add(toolModel.getToolSafetyInfo(toolScanned));

            List<Integer> safetyReminders = new ArrayList<Integer>();
            safetyReminders.add(toolModel.getToolSafetyInfo(toolScanned));

            _listDataChild.put(_listDataHeader.get(0), configurationList);
            _listDataChild.put(_listDataHeader.get(1), actionTechniqueList);
            _listDataChild.put(_listDataHeader.get(2), adjustmentsList);
            _listDataChild.put(_listDataHeader.get(3), safetyReminders);
        }
        @Override
        public Object getChild(int groupPosition, int childPosititon) {
            return this._listDataChild.get(this._listDataHeader.get(groupPosition)).get(childPosititon);
        }
        @Override
        public long getChildId(int groupPosition, int childPosition) {
            return childPosition;
        }
        @Override
        public int getChildrenCount(int groupPosition) {
            return this._listDataChild.get(this._listDataHeader.get(groupPosition)).size();
        }
        @Override
        public Object getGroup(int groupPosition) {
            return this._listDataHeader.get(groupPosition);
        }
        @Override
        public int getGroupCount() {
            return this._listDataHeader.size();
        }
        @Override
        public long getGroupId(int groupPosition) {
            return groupPosition;
        }
        @Override
        public boolean hasStableIds() {
            return true;
        }
        @Override
        public boolean isChildSelectable(int groupPosition, int childPosition) {
            return false;
        }
    }

    public class CustExpListview extends ExpandableListView {

        int intGroupPosition, intChildPosition, intGroupid;

        public CustExpListview(Context context)
        {
            super(context);
        }

        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
        {
            widthMeasureSpec = MeasureSpec.makeMeasureSpec(960, MeasureSpec.AT_MOST);
            heightMeasureSpec = MeasureSpec.makeMeasureSpec(600, MeasureSpec.AT_MOST);
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}