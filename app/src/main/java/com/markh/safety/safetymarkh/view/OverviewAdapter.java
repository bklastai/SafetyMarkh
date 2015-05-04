package com.markh.safety.safetymarkh.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.markh.safety.safetymarkh.R;

/**
 * Created by Benas on 5/4/2015.
 */
public class OverviewAdapter extends BaseAdapter {

    private Context context;


    private int[] arrayOfOverviewListedPoints = {R.array.power_drill_types, R.array.power_drill_types, R.array.router_bits, R.array.dremel_bits, R.array.drill_bits};

    private String[] overviewListedPoints;

    public OverviewAdapter(Context c, int toolSelection){
        context = c;
        overviewListedPoints = context.getResources().
                getStringArray(arrayOfOverviewListedPoints[toolSelection]);
    }

    @Override
    public int getCount() {
        return overviewListedPoints.length;
    }

    @Override
    public Object getItem(int position) {
        return overviewListedPoints[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        String textItem = overviewListedPoints[position];
        if (convertView == null){
            LayoutInflater infalInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.list_header_safety, null);
        }
        TextView txt = (TextView) convertView.findViewById(R.id.lblListHeaderSafety);
        txt.setText(textItem);
        return convertView;
    }



}
