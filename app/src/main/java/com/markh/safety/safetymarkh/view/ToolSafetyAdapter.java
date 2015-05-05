package com.markh.safety.safetymarkh.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.markh.safety.safetymarkh.R;
import com.markh.safety.safetymarkh.controller.OverviewActivity;
import com.markh.safety.safetymarkh.model.ToolModel;

import java.util.HashMap;

public class ToolSafetyAdapter extends BaseExpandableListAdapter {


    private Context context;
    private ToolModel toolModel;
    private CustExpListview customView;


    public ToolSafetyAdapter(Context c, ToolModel tm) {
        this.context = c;
        this.toolModel = tm;
    }



    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {
        customView = new CustExpListview(context);
        customView.setAdapter(new NestedExplvAdapter());
        customView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                Intent intent = new Intent(context, OverviewActivity.class);
                intent.putExtra("overviewSelection", toolModel.getToolSelected()-24);
                context.startActivity(intent);
                return true;
            }
        });
        return customView;
    }
    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.list_header_location, null);
        }
        TextView lblListHeader = (TextView) convertView.findViewById(R.id.lblListHeader);
        lblListHeader.setTypeface(null, Typeface.BOLD);
        lblListHeader.setText(R.string.button_safety_info);
        return convertView;
    }
    @Override
    public Object getChild(int groupPosition, int childPosititon) {
        return customView;
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
        return false;
    }
    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }












    final protected class CustExpListview extends ExpandableListView {
        public CustExpListview(Context context) {
            super(context);
        }

        @Override
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//            widthMeasureSpec = MeasureSpec.makeMeasureSpec(960, MeasureSpec.AT_MOST);
            heightMeasureSpec = MeasureSpec.makeMeasureSpec(1500, MeasureSpec.EXACTLY);
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }












    final protected class NestedExplvAdapter extends BaseExpandableListAdapter {
//
//
//        private Context context;
//
//        private ToolModel toolModel;

        private String[] HEADERS;
        private String[] CHILDREN_Overview;
        private HashMap<String, String[]> CHILDREN = new HashMap<String, String[]>();


        public NestedExplvAdapter() {
//            this.context = c;
//            this.toolModel = tm;
            this.prepareListData();
        }

        private void prepareListData() {
            HEADERS = toolModel.getHeadersArray();
            CHILDREN_Overview = toolModel.getOverviewArray();

            String[][] bulletPoints = toolModel.getBulletPointsArray_ofArrays();
            boolean hasOverviewTexts = CHILDREN_Overview.length != 0;

            for (int i = 0; i < HEADERS.length; i++) {
                if (hasOverviewTexts) {
                    if (i == 0) {
                        CHILDREN.put(HEADERS[i], CHILDREN_Overview);
                    } else {
                        CHILDREN.put(HEADERS[i], bulletPoints[i - 1]);
                    }
                }
                else {
                    CHILDREN.put(HEADERS[i], bulletPoints[i]);
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
            if (isChildSelectable(groupPosition, childPosition)){
                txt.setTextColor(Color.BLUE);
            }
            else {
                txt.setTextColor(Color.WHITE);
            }


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
            return CHILDREN.get(HEADERS[groupPosition])[childPosititon];
        }
        @Override
        public long getChildId(int groupPosition, int childPosition) {
            return childPosition;
        }
        @Override
        public int getChildrenCount(int groupPosition) {
            return this.CHILDREN.get(this.HEADERS[groupPosition]).length;
        }
        @Override
        public Object getGroup(int groupPosition) {
            return this.HEADERS[groupPosition];
        }
        @Override
        public int getGroupCount() {
            return this.HEADERS.length;
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
            boolean isOneOfTheLastFiveTools = toolModel.getToolSelected()>23;
            boolean isLastChildUnderOverHeader = CHILDREN_Overview[CHILDREN_Overview.length - 1].equals(getChild(groupPosition, childPosition));
            if (isOneOfTheLastFiveTools && isLastChildUnderOverHeader) {
                return true;
            } else {
                return false;
            }
        }
    }



}
