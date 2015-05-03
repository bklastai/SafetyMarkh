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

import java.util.HashMap;

/**
* Created by Benas on 4/14/2015.
*/
public class ToolSafetyAdapter2 extends BaseExpandableListAdapter {


    private Context context;

    private ToolModel toolModel;

    private String[] _listDataHeader;
    private String[] _listDataChild_Overview;
    private HashMap<String, String[]> _listDataChild = new HashMap<String, String[]>();



    public ToolSafetyAdapter2(Context c, ToolModel tm) {
        this.context = c;
        this.toolModel = tm;
        prepareListData();
    }

    private void prepareListData() {
        _listDataHeader = toolModel.getHeadersArray();
        _listDataChild_Overview = toolModel.getOverviewArray();
        String[][] bulletPoints = toolModel.getBulletPointsArray_ofArrays();
        for (int i=0; i<_listDataHeader.length; i++){
            if (_listDataChild_Overview.length!=0 && i==0){
                _listDataChild.put(_listDataHeader[i], _listDataChild_Overview);
            }
            else {
                _listDataChild.put(_listDataHeader[i], bulletPoints[i]);
            }
        }
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
        String headerTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.list_header_safety, null);
        }
        TextView lblListHeader = (TextView) convertView.findViewById(R.id.lblListHeaderSafety);
        lblListHeader.setTypeface(null, Typeface.BOLD);
        lblListHeader.setText(headerTitle);

        return convertView;
    }
    @Override
    public Object getChild(int groupPosition, int childPosititon) {
        return _listDataChild.get(_listDataHeader[groupPosition])[childPosititon];
    }
    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }
    @Override
    public int getChildrenCount(int groupPosition) {
        return this._listDataChild.get(this._listDataHeader[groupPosition]).length;
    }
    @Override
    public Object getGroup(int groupPosition) {
        return this._listDataHeader[groupPosition];
    }
    @Override
    public int getGroupCount() {
        return this._listDataHeader.length;
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
        //implement logic for selectable overview text items (only applies to tools 24-28, and the item is always last in overviewArray)
        return false;
    }
}