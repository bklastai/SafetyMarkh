package com.markh.safety.safetymarkh.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.markh.safety.safetymarkh.R;

/**
 * Created by Benas on 5/4/2015.
 */
public class OverviewAdapter extends BaseAdapter {

    private Context context;
    private int toolSelected;

    private Integer[] overviewImages = {R.drawable.power_drill_bits1, R.drawable.power_drill_bits1, R.drawable.router_bits1, R.drawable.dremel_bits1, R.drawable.drill_bits1};
    private int[] arrayOfOverviewListedPoints = {R.array.power_drill_types, R.array.power_drill_types, R.array.router_bits, R.array.dremel_bits, R.array.drill_bits};
    private String[] overviewListedPoints;



    public OverviewAdapter(Context c, int toolSelection){
        context = c;
        toolSelected = toolSelection;
        overviewListedPoints = context.getResources().
                getStringArray(arrayOfOverviewListedPoints[toolSelected]);
    }

    @Override
    public int getCount() {
        return overviewListedPoints.length+1;
    }

    @Override
    public Object getItem(int position) {
        if (position==0){
            return overviewImages[toolSelected];
        }
        else {
            return overviewListedPoints[position-1];
        }
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Object resource = getItem(position);
        if (convertView == null){
            LayoutInflater infalInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.list_item_safety, null);
        }
        if (position==0){
            ImageView img = (ImageView) convertView.findViewById(R.id.overview_image);
            img.setBackgroundResource((Integer) resource);
            img.setVisibility(View.VISIBLE);
            return convertView;
        }
        else {
            TextView txt = (TextView) convertView.findViewById(R.id.txtListItemSafety);
            txt.setText((String) resource);
            convertView.findViewById(R.id.overview_image).setVisibility(View.GONE);
        }
        return convertView;


    }



}
