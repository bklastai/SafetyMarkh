package com.markh.safety.safetymarkh.model;

import com.markh.safety.safetymarkh.R;

/**
 * Created by Benas on 4/1/2015.
 */
public class ToolModel{

    private Integer[] toolDrawables = {R.drawable.welder, R.drawable.angle_grinder, R.drawable.belt_sander, R.drawable.steel_bender, R.drawable.belt_saw, R.drawable.metal_sheet_cutter};
    private Integer[] toolLocationDrawables = {R.drawable.location0, R.drawable.location1, R.drawable.location2, R.drawable.location3, R.drawable.location4, R.drawable.location5};
    private Integer[] toolSafetyInfos = {R.string.lorem_ipsum_0, R.string.lorem_ipsum_1, R.string.lorem_ipsum_2, R.string.lorem_ipsum_3, R.string.lorem_ipsum_4, R.string.lorem_ipsum_5};

    public Integer getToolDrawable(int position){
        return toolDrawables[position];
    }

    public Integer getToolLocationDrawable(int position){
        return toolLocationDrawables[position];
    }

    public Integer getToolSafetyInfo(int position){
        return toolSafetyInfos[position];
    }


}
