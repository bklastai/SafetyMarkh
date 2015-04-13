package com.markh.safety.safetymarkh.view;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.markh.safety.safetymarkh.R;
import com.markh.safety.safetymarkh.model.ToolModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ToolSafetyAdapter extends BaseExpandableListAdapter {


    private Context _context;
    private List<Integer> _listDataHeader;
    private HashMap<Integer, List<Integer>> _listDataChild;    // child data in format of header title, child title
    private ToolModel toolModel = new ToolModel();
    private int toolScanned;



    //CONSTRUCTOR
    public ToolSafetyAdapter(Context context, int toolPosition) {
        this._context = context;
        toolScanned = toolPosition;
        prepareListData(toolPosition);
    }




    //GET SINGLE CHILD IMAGEVIEW                  (+ TEXTVIEW???????????????????????)
    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {

        Integer childResource = (Integer) getChild(groupPosition, childPosition);

        if (convertView == null){
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.list_item, null);
        }
        ImageView img = (ImageView) convertView.findViewById(R.id.imgListItem);
        img.setBackgroundResource(childResource);
        if (groupPosition>0){
            TextView txt = (TextView) convertView.findViewById(R.id.txtListItem);
            txt.setText(toolModel.getToolSafetyInfo(toolScanned));
        }


        return convertView;
    }




    //GET SINGLE GROUP TEXTVIEW
    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        Integer headerTitle = (Integer) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.list_header, null);
        }

        TextView lblListHeader = (TextView) convertView.findViewById(R.id.lblListHeader);
        lblListHeader.setTypeface(null, Typeface.BOLD);
        lblListHeader.setText(headerTitle);

        return convertView;
    }







    /*
* Preparing the list data
*/
    private void prepareListData(int toolPosition) {
        _listDataHeader = new ArrayList<Integer>();
        _listDataChild = new HashMap<Integer, List<Integer>>();

        // Adding titles to headers
        _listDataHeader.add(R.string.button_tool_location);
        _listDataHeader.add(R.string.button_safety_info);

        // Adding location child data (Location ImageView)
        List<Integer> locationList = new ArrayList<>();
        locationList.add(toolModel.getToolLocationDrawable(toolPosition));

        // Adding safety child data (Tool ImageView)
        List<Integer> safetyTexts = new ArrayList<Integer>();
        safetyTexts.add(toolModel.getToolDrawable(toolPosition));

        //linking headers with children
        _listDataChild.put(_listDataHeader.get(0), locationList);
        _listDataChild.put(_listDataHeader.get(1), safetyTexts);
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
