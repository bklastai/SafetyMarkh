package com.markh.safety.safetymarkh.model;

import android.content.Context;

import com.markh.safety.safetymarkh.R;

import java.util.List;

/**
 * Created by Benas on 4/1/2015.
 */
public class ToolModel {

    private Context context;
    private int toolSelected;
    private List<Integer[]> all_configurations;
    private Integer[] configurations;


    private Integer[] all_configuration_tools_0_though_23 = new Integer[24];
    private Integer[] all_action_technique_tools_0_though_23 = new Integer[24];
    private Integer[] all_adjustments_tools_2_though_23 = new Integer[22];
    private Integer[] all_safety_reminders_tools_1_though_23 = new Integer[23];


    public ToolModel(Context c, int toolSelection) {
        toolSelected = toolSelection;
        context = c;
//        initAllConfigurations();
    }

    private Integer[] toolDrawables = {
            R.drawable.finishing_sanders1,
            R.drawable.hand_belt_sander1,
            R.drawable.hand_drill1,
            R.drawable.jig_saw1,
            R.drawable.reciprocating_saw1,
            R.drawable.circular_hand_saw1,
            R.drawable.large_band_saw1,
            R.drawable.fourteen_inch_band_saw1,
            R.drawable.scroll_saw1,
            R.drawable.table_saw1,
            R.drawable.radial_arm_saw1,
            R.drawable.sliding_compound_miter_saw1,
            R.drawable.miter_saw1,
            R.drawable.jointer1,
            R.drawable.thickness_planer1,
            R.drawable.wood_lathe1,
            R.drawable.wood_shaper_slash_router_table1,
            R.drawable.die_grinder1,
            R.drawable.orbital_sanders1,
            R.drawable.brad_nailer1,
            R.drawable.framing_nailer1,
            R.drawable.belt_slash_disk_sander1,
            R.drawable.oscillating_spindle_sander1,
            R.drawable.down_draft_table1,
            R.drawable.floor_drill_press1,
            R.drawable.hollow_chisel_mortiser1,
            R.drawable.router1,
            R.drawable.dremel1,
            R.drawable.cordless_drill1,
    };

    private Integer[] toolLocationDrawables =
            {
                    R.drawable.location0,
                    R.drawable.location1,
                    R.drawable.location2,
                    R.drawable.location3,
                    R.drawable.location4,
                    R.drawable.location5,
                    R.drawable.location0,
                    R.drawable.location1,
                    R.drawable.location2,
                    R.drawable.location3,
                    R.drawable.location4,
                    R.drawable.location5,
                    R.drawable.location0,
                    R.drawable.location1,
                    R.drawable.location2,
                    R.drawable.location3,
                    R.drawable.location4,
                    R.drawable.location5,
                    R.drawable.location0,
                    R.drawable.location1,
                    R.drawable.location2,
                    R.drawable.location3,
                    R.drawable.location4,
                    R.drawable.location5,
                    R.drawable.location0,
                    R.drawable.location1,
                    R.drawable.location2,
                    R.drawable.location3,
                    R.drawable.location4,
            };

    private Integer[] circularHandSawConfigurationsArray = {R.string.configuration0_0};
    private Integer[] circularHandSawActionArray = {R.string.action_technique5_0};
    private Integer[] circularHandSawAdjustmentsArray = {R.string.adjustments5_0, R.string.adjustments5_1};
    private Integer[] circularHandSawSafetyRemindersArray = {R.string.safety_reminder5_0,R.string.safety_reminder5_1,R.string.safety_reminder5_2,R.string.safety_reminder5_3,R.string.safety_reminder5_4,R.string.safety_reminder5_5,R.string.safety_reminder5_6,R.string.safety_reminder5_7,R.string.safety_reminder5_8,R.string.safety_reminder5_9,R.string.safety_reminder5_10};


//    private Integer[] toolLocationTitles =
//            {R.string.locationTitle0, R.string.locationTitle1, R.string.locationTitle2,
//                    R.string.locationTitle3, R.string.locationTitle4, R.string.locationTitle5};


    private void initAllConfigurations() {
        //init individual configurations
        //init individual action techniques
        //init individual adjustments
        //init individual safety reminders
    }


    public Integer[] getConfigurationsArray(int position){
        return circularHandSawConfigurationsArray;//fix this.....................
    }
    public Integer[] getAdjustmentsArray(int position){
        return circularHandSawAdjustmentsArray;//fix this.....................
    }
    public Integer[] getSafetyRemindersArray(int position){
        return circularHandSawSafetyRemindersArray;//fix this.....................
    }
    public Integer[] getActionTechniqueArray(int position){
        return circularHandSawActionArray;//fix this.....................
    }
    public Integer getToolDrawable(int position){
        return toolDrawables[position];
    }

    public Integer getToolLocationDrawable(int position){
        return toolLocationDrawables[position];
    }


}
