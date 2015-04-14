//package com.markh.safety.safetymarkh.view;
//
//import android.content.Context;
//import android.graphics.Typeface;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseExpandableListAdapter;
//import android.widget.ExpandableListView;
//import android.widget.TextView;
//
//import com.markh.safety.safetymarkh.R;
//import com.markh.safety.safetymarkh.model.ToolModel;
//
//public class ToolSafetyAdapter extends BaseExpandableListAdapter {
//
//
//    private Context _context;
//    private ToolModel toolModel;
//    private int toolScanned;
//
//
//    public ToolSafetyAdapter(Context context, int toolPosition, ToolModel tm) {
//        _context = context;
//        toolScanned = toolPosition;
//        toolModel = tm;
//    }
//
//
//
//    @Override
//    public View getChildView(int groupPosition, final int childPosition,
//                             boolean isLastChild, View convertView, ViewGroup parent) {
//        ExpandableListView SecondLevelexplv = new ExpandableListView(_context);
//        SecondLevelexplv.setAdapter(new ToolSafetyAdapter2(_context, toolScanned, toolModel));
//        return SecondLevelexplv;
//    }
//
//
//
//    @Override
//    public View getGroupView(int groupPosition, boolean isExpanded,
//                             View convertView, ViewGroup parent) {
//
//        if (convertView == null) {
//            LayoutInflater infalInflater = (LayoutInflater) this._context
//                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            convertView = infalInflater.inflate(R.layout.list_header, null);
//        }
//
//        TextView lblListHeader = (TextView) convertView.findViewById(R.id.lblListHeader);
//        lblListHeader.setTypeface(null, Typeface.BOLD);
//        lblListHeader.setText(R.string.button_safety_info);
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
//
//
//
//    @Override
//    public Object getChild(int groupPosition, int childPosititon) {
//        return childPosititon;
//    }
//
//    @Override
//    public long getChildId(int groupPosition, int childPosition) {
//        return childPosition;
//    }
//
//    @Override
//    public int getChildrenCount(int groupPosition) {
//        return 1;
//    }
//
//    @Override
//    public Object getGroup(int groupPosition) {
//        return groupPosition;
//    }
//
//    @Override
//    public int getGroupCount() {
//        return 1;
//    }
//
//    @Override
//    public long getGroupId(int groupPosition) {
//        return groupPosition;
//    }
//
//    @Override
//    public boolean hasStableIds() {
//        return true;
//    }
//
//    @Override
//    public boolean isChildSelectable(int groupPosition, int childPosition) {
//        return true;
//    }
//
//}
