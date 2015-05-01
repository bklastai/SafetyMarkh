package com.markh.safety.safetymarkh.model;

import android.content.Context;
import android.content.res.Resources;

import com.markh.safety.safetymarkh.R;

/**
 * Created by Benas on 4/1/2015.
 */
public class ToolModel {

    private Context context;
    private int toolSelected;
//    private List<Integer[]> all_configurations;
//    private Integer[] configurations;
//
//
//    private Integer[] all_configuration_tools_0_through_23 = new Integer[24];
//    private Integer[] all_action_technique_tools_0_through_23 = new Integer[24];
//    private Integer[] all_adjustments_tools_2_through_23 = new Integer[22];
//    private Integer[] all_safety_reminders_tools_1_through_23 = new Integer[23];

    private String[] configurationsArray;
    private String[] actionTechniqueArray;
    private String[] adjustmentsArray;
    private String[] safetyRemindersArray;


    public ToolModel(Context c, int toolSelection) {
        this.toolSelected = toolSelection;
        this.context = c;
        initAllConfigurations();
    }


    private void initAllConfigurations() {
        Resources res = context.getResources();
        switch (toolSelected){
            case 0:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 1:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 2:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 3:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 4:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 5:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 6:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 7:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 8:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 9:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 10:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 11:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 12:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 13:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 14:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 15:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 16:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 17:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 18:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 19:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 20:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 21:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 22:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 23:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 24:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 25:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 26:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 27:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
            case 28:
                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.configuration0);
                adjustmentsArray = res.getStringArray(R.array.configuration0);
                safetyRemindersArray = res.getStringArray(R.array.configuration0);
                break;
        }
    }


    public String[] getConfigurationsArray(){
        return configurationsArray;
    }
    public String[] getAdjustmentsArray(){
        return adjustmentsArray;
    }
    public String[] getSafetyRemindersArray(){
        return safetyRemindersArray;
    }
    public String[] getActionTechniqueArray(){
        return actionTechniqueArray;
    }
    public Integer getToolDrawable(){
        return toolDrawables[toolSelected];
    }
    public Integer getToolLocationDrawable(){
        return toolLocationDrawables[toolSelected];
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
}
