package com.markh.safety.safetymarkh;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

/**
 * Created by Benas on 3/10/2015.
 */
public class ToolAdapter extends ArrayAdapter {


    private Context mContext;
    private Integer[] values;

    public ToolAdapter(Context c, int layoutResource, Integer[] myValues) {
        super(c, layoutResource, myValues);
        this.mContext = c;
        this.values = myValues;
    }

    public int getCount() {
        return values.length;
    }



    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup arg2) {
        final ImageView view;
        if (convertView==null)
        {
            view = new ImageView(mContext);
        }
        else
        {
            view = (ImageView) convertView;
        }
        view.setBackgroundResource(values[position]);
        return view;
    }


}
