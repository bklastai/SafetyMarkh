package com.markh.safety.safetymarkh.view;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.markh.safety.safetymarkh.R;
import com.markh.safety.safetymarkh.model.ToolModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
* Created by Benas on 4/14/2015.
*/
public class ToolSafetyAdapter2 extends BaseExpandableListAdapter {


    private Context context;
    private ToolModel toolModel;
    private List<Integer> _listDataHeader = new ArrayList<Integer>();
    private HashMap<Integer, List<String>> _listDataChild = new HashMap<Integer, List<String>>();



    public ToolSafetyAdapter2(Context c, ToolModel tm) {
        this.context = c;
        this.toolModel = tm;
        this.prepareListData();
    }
    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {
        String childResource = (String) getChild(groupPosition, childPosition);
        if (convertView == null){
            LayoutInflater infalInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
            LayoutInflater infalInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.list_header_safety, null);
        }
        TextView lblListHeader = (TextView) convertView.findViewById(R.id.lblListHeaderSafety);
        lblListHeader.setTypeface(null, Typeface.BOLD);
        lblListHeader.setText(headerTitle);

        return convertView;
    }

    public void prepareListData() {
        _listDataHeader.add(R.string.safety_reminders);
        _listDataHeader.add(R.string.action_technique);
        _listDataHeader.add(R.string.configuration);
        _listDataHeader.add(R.string.adjustments);

        List<String> configurationList = new ArrayList<String>();
        for (String config : toolModel.getConfigurationsArray()){
            configurationList.add(config);
        }
        List<String> actionTechniqueList = new ArrayList<String>();
        for (String config : toolModel.getActionTechniqueArray()){
            actionTechniqueList.add(config);
        }
        List<String> adjustmentsList = new ArrayList<String>();
        for (String config : toolModel.getAdjustmentsArray()){
            adjustmentsList.add(config);
        }
        List<String> safetyReminders = new ArrayList<String>();
        for (String config : toolModel.getSafetyRemindersArray()){
            safetyReminders.add(config);
        }

        _listDataChild.put(_listDataHeader.get(0), safetyReminders);
        _listDataChild.put(_listDataHeader.get(1), actionTechniqueList);
        _listDataChild.put(_listDataHeader.get(2), configurationList);
        _listDataChild.put(_listDataHeader.get(3), adjustmentsList);
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