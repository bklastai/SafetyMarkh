//package com.markh.safety.safetymarkh.view;
//
//import android.content.Context;
//import android.graphics.Typeface;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseExpandableListAdapter;
//import android.widget.TextView;
//
//import com.markh.safety.safetymarkh.R;
//import com.markh.safety.safetymarkh.model.ToolModel;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
///**
// * Created by Benas on 4/14/2015.
// */
//public class ToolSafetyAdapter2 extends BaseExpandableListAdapter {
//
//    private Context _context;
//    private ToolModel toolModel;
//    private int toolScanned;
//
//    private List<Integer> _listDataHeader = new ArrayList<Integer>();
//    private HashMap<Integer, List<Integer>> _listDataChild = new HashMap<Integer, List<Integer>>();
//
//
//
//    //CONSTRUCTOR
//    public ToolSafetyAdapter2(Context context, int toolPosition, ToolModel tm) {
//        this._context = context;
//        this.toolModel = tm;
//        this.toolScanned = toolPosition;
//        prepareListData();
//    }
//
//
//
//    @Override
//    public View getChildView(int groupPosition, final int childPosition,
//                             boolean isLastChild, View convertView, ViewGroup parent) {
//        Integer childResource = (Integer) getChild(groupPosition, childPosition);
//
//        if (convertView == null){
//            LayoutInflater infalInflater = (LayoutInflater) this._context
//                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            convertView = infalInflater.inflate(R.layout.list_item_safety, null);
//        }
//        TextView txt = (TextView) convertView.findViewById(R.id.txtListItemSafety);
//        txt.setText(childResource);
//
//        return convertView;
//    }
//
//
//
//
//    //GET SINGLE GROUP TEXTVIEW
//    @Override
//    public View getGroupView(int groupPosition, boolean isExpanded,
//                             View convertView, ViewGroup parent) {
//
//        Integer headerTitle = (Integer) getGroup(groupPosition);
//
//        if (convertView == null) {
//            LayoutInflater infalInflater = (LayoutInflater) this._context
//                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            convertView = infalInflater.inflate(R.layout.list_header_safety, null);
//        }
//
//        TextView lblListHeader = (TextView) convertView.findViewById(R.id.lblListHeaderSafety);
//        lblListHeader.setTypeface(null, Typeface.BOLD);
//        lblListHeader.setText(headerTitle);
//
//        return convertView;
//    }
//
//
//
//
//
//
//
//    private void prepareListData() {
//        // Adding titles to headers
//        _listDataHeader.add(R.string.button_tool_location);
//        _listDataHeader.add(R.string.button_safety_info);
//
//        // Adding location child data
//        List<Integer> locationList = new ArrayList<Integer>();
//        locationList.add(toolModel.getToolSafetyInfo(toolScanned));
//
//        List<Integer> safetyList = new ArrayList<Integer>();
//        safetyList.add(toolModel.getToolSafetyInfo(toolScanned));
//
//        //linking headers with children
//        _listDataChild.put(_listDataHeader.get(0), locationList);
//        _listDataChild.put(_listDataHeader.get(1), safetyList);
//    }
//
//
//
//
//
//
//
//
//
//
//    @Override
//    public Object getChild(int groupPosition, int childPosititon) {
//        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
//                .get(childPosititon);
//    }
//
//    @Override
//    public long getChildId(int groupPosition, int childPosition) {
//        return 0;
//    }
//
//    @Override
//    public int getChildrenCount(int groupPosition) {
//        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
//                .size();
//    }
//
//    @Override
//    public Object getGroup(int groupPosition) {
//        return this._listDataHeader.get(groupPosition);
//    }
//
//    @Override
//    public int getGroupCount() {
//        return this._listDataHeader.size();
//    }
//
//    @Override
//    public long getGroupId(int groupPosition) {
//        return groupPosition;
//    }
//
//    @Override
//    public boolean hasStableIds() {
//        return false;
//    }
//
//    @Override
//    public boolean isChildSelectable(int groupPosition, int childPosition) {
//        return true;
//    }
//}
