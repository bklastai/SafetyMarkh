//package com.markh.safety.safetymarkh.view;
//
//import android.content.Context;
//import android.graphics.Typeface;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseExpandableListAdapter;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.markh.safety.safetymarkh.R;
//import com.markh.safety.safetymarkh.model.ToolModel;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//public class ToolLocationAdapter extends BaseExpandableListAdapter {
//
//
//    private Context _context;
//
//    private int toolScanned;
//
//    private ToolModel toolModel;
//
//    private List<Integer> _listDataHeader = new ArrayList<Integer>();
//    private HashMap<Integer, List<Integer>> _listDataChild = new HashMap<Integer, List<Integer>>();
//
//
//
//
//    //CONSTRUCTOR
//    public ToolLocationAdapter(Context context, int toolPosition, ToolModel tm) {
//        this._context = context;
//        toolScanned = toolPosition;
//        this.toolModel = tm;
//        prepareListData();
//    }
//
//
//
//    @Override
//    public View getChildView(int groupPosition, final int childPosition,
//                             boolean isLastChild, View convertView, ViewGroup parent) {
//
//        Integer childResource = (Integer) getChild(groupPosition, childPosition);
//
//        if (convertView == null){
//            LayoutInflater infalInflater = (LayoutInflater) this._context
//                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            convertView = infalInflater.inflate(R.layout.list_item, null);
//        }
//        ImageView img = (ImageView) convertView.findViewById(R.id.imgListItem);
//        img.setBackgroundResource(childResource);
////        if (groupPosition==0){
////            ImageView img = (ImageView) convertView.findViewById(R.id.imgListItem);
////            img.setBackgroundResource(childResource);
////            return convertView;
////        }
////        else {
////            CustExpListview SecondLevelexplv = new CustExpListview(_context);
////            SecondLevelexplv.setAdapter(new ToolSafetyAdapter(_context, toolScanned, toolModel));
////            return SecondLevelexplv;
////        }
//
//        return convertView;
//    }
//
//
//
//
//
//
//    @Override
//    public View getGroupView(int groupPosition, boolean isExpanded,
//                             View convertView, ViewGroup parent) {
//        Integer headerTitle = (Integer) getGroup(groupPosition);
//        if (convertView == null) {
//            LayoutInflater infalInflater = (LayoutInflater) this._context
//                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            convertView = infalInflater.inflate(R.layout.list_header, null);
//        }
//
//        TextView lblListHeader = (TextView) convertView.findViewById(R.id.lblListHeader);
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
//
//    private void prepareListData() {
//
//        // Adding titles to headers
//        _listDataHeader.add(R.string.button_tool_location);
//
//        // Adding location child data (Location ImageView)
//        List<Integer> locationList = new ArrayList<>();
//        locationList.add(toolModel.getToolLocationDrawable(toolScanned));
//
//        //linking headers with children
//        _listDataChild.put(_listDataHeader.get(0), locationList);
//
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
//
//}
