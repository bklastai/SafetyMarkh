package com.markh.safety.safetymarkh.model;

import com.markh.safety.safetymarkh.R;

/**
 * Created by Benas on 4/1/2015.
 */
public class ToolModel{

    private Integer[] toolDrawables = {
            R.drawable.finishing_sanders,
            R.drawable.hand_belt_sander,
            R.drawable.hand_drill,
            R.drawable.jig_saw,
            R.drawable.reciprocating_saw,
            R.drawable.circular_hand_saw,
            R.drawable.large_band_saw,
            R.drawable.fourteen_inch_band_saw,
            R.drawable.scroll_saw,
            R.drawable.table_saw,
            R.drawable.radial_arm_saw,
            R.drawable.sliding_compound_miter_saw,
            R.drawable.miter_saw,
            R.drawable.jointer,
            R.drawable.thickness_planer,
            R.drawable.wood_lathe,
            R.drawable.wood_shaper_slash_router_table,
            R.drawable.die_grinder,
            R.drawable.orbital_sanders,
            R.drawable.brad_nailer,
            R.drawable.framing_nailer,
            R.drawable.belt_slash_disk_sander,
            R.drawable.oscillating_spindle_sander,
            R.drawable.down_draft_table,
            R.drawable.floor_drill_press,
            R.drawable.hollow_chisel_mortiser,
            R.drawable.router,
            R.drawable.dremel,
            R.drawable.cordless_drill,
    };
    private Integer[] toolLocationDrawables =
            {R.drawable.location0, R.drawable.location1, R.drawable.location2,
                    R.drawable.location3, R.drawable.location4, R.drawable.location5};

    private Integer[][] configurations =
            {};



    private Integer[] configuration0 =
            {R.string.lorem_ipsum_0, R.string.lorem_ipsum_1, R.string.lorem_ipsum_2,
                    R.string.lorem_ipsum_3, R.string.lorem_ipsum_4, R.string.lorem_ipsum_5};


//    private Integer[] toolLocationTitles =
//            {R.string.locationTitle0, R.string.locationTitle1, R.string.locationTitle2,
//                    R.string.locationTitle3, R.string.locationTitle4, R.string.locationTitle5};


    public Integer getToolDrawable(int position){
        return toolDrawables[position];
    }

    public Integer getToolLocationDrawable(int position){
        return toolLocationDrawables[position];
    }

    public Integer getToolSafetyInfo(int position){
        return toolSafetyInfos[position];
    }

//    public Integer getToolLocationTitle(int position){
//        return toolLocationTitles[position];
//    }


}
