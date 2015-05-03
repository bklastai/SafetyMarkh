package com.markh.safety.safetymarkh.view;

import android.content.Context;
import android.widget.ExpandableListView;

/**
 * Created by Benas on 4/13/2015.
 */
public class CustExpListview extends ExpandableListView {
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