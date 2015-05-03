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

    // Individual tool's headers that scroll out under "Safety Information".
    // The order of the header elements is determined as string-array in strings.xml
    // This order is synced with the ToolModel class implementation -> see, initAllConfigurations()
    private String[] headersArray;

    //individual tool's bullet point texts
    private String[][] bulletPointsArray_ofArrays;

    //individual tool's overview texts.
    // Note: unlike bullet points, overview texts can be clicked on.
    private String[] overviewArray;



    public ToolModel(Context c, int toolSelection) {
        this.toolSelected = toolSelection;
        this.context = c;
        initAllConfigurations();
    }


    private void initAllConfigurations() {
        // Get resources to retrieve headers that link to tool-specific bullet points and/or safety manual's overview (of a chapter where that tool is found)
        // See DesignShopSafetyManual.pdf for more information.
        Resources res = context.getResources();

        //declaration of bullet point arrays
        String[] configurationsArray;
        String[] actionTechniqueArray;
        String[] adjustmentsArray;
        String[] safetyRemindersArray;
        String[] cutsArray;
        String[] nailLoadingArray;

        switch (toolSelected){
            case 0:
                headersArray = res.getStringArray(R.array.headers0);
                overviewArray = res.getStringArray(R.array.overview_hand_sanders0);

                configurationsArray = res.getStringArray(R.array.configuration0);
                actionTechniqueArray = res.getStringArray(R.array.action_technique0);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray};
                break;
            case 1:
                headersArray = res.getStringArray(R.array.headers1);
                overviewArray = res.getStringArray(R.array.overview_hand_sanders0);

                configurationsArray = res.getStringArray(R.array.configuration1);
                actionTechniqueArray = res.getStringArray(R.array.action_technique1);
                safetyRemindersArray = res.getStringArray(R.array.safety_reminders1);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray, safetyRemindersArray};
                break;
            case 2:
                headersArray = res.getStringArray(R.array.headers2);
                overviewArray = new String[]{};

                configurationsArray = res.getStringArray(R.array.configuration2);
                actionTechniqueArray = res.getStringArray(R.array.action_technique2);
                adjustmentsArray = res.getStringArray(R.array.adjustments2);
                safetyRemindersArray = res.getStringArray(R.array.safety_reminders2);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray, adjustmentsArray, safetyRemindersArray};
                break;
            case 3:
                headersArray = res.getStringArray(R.array.headers3);
                overviewArray = new String[]{};

                configurationsArray = res.getStringArray(R.array.configuration3);
                actionTechniqueArray = res.getStringArray(R.array.action_technique3);
                adjustmentsArray = res.getStringArray(R.array.adjustments3);
                cutsArray = res.getStringArray(R.array.cuts3);
                safetyRemindersArray = res.getStringArray(R.array.safety_reminders3);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray, adjustmentsArray, cutsArray, safetyRemindersArray};
                break;
            case 4:
                headersArray = res.getStringArray(R.array.headers4);
                overviewArray = new String[]{};

                configurationsArray = res.getStringArray(R.array.configuration4);
                actionTechniqueArray = res.getStringArray(R.array.action_technique4);
                adjustmentsArray = res.getStringArray(R.array.adjustments4);
                cutsArray = res.getStringArray(R.array.cuts4);
                safetyRemindersArray = res.getStringArray(R.array.safety_reminders4);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray, adjustmentsArray, cutsArray, safetyRemindersArray};
                break;
            case 5:
                headersArray = res.getStringArray(R.array.headers5);
                overviewArray = new String[]{};

                configurationsArray = res.getStringArray(R.array.configuration6);
                actionTechniqueArray = res.getStringArray(R.array.action_technique5);
                adjustmentsArray = res.getStringArray(R.array.adjustments5);
                cutsArray = res.getStringArray(R.array.cuts5);
                safetyRemindersArray = res.getStringArray(R.array.safety_reminders5);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray, adjustmentsArray, cutsArray, safetyRemindersArray};
                break;
            case 6:
                headersArray = res.getStringArray(R.array.headers6);
                overviewArray = res.getStringArray(R.array.overview_band_and_other_saws6);

                configurationsArray = res.getStringArray(R.array.configuration6);
                actionTechniqueArray = res.getStringArray(R.array.action_technique6);
                adjustmentsArray = res.getStringArray(R.array.adjustments6);
                cutsArray = res.getStringArray(R.array.cuts6);
                safetyRemindersArray = res.getStringArray(R.array.safety_reminders6);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray, adjustmentsArray, cutsArray, safetyRemindersArray};
                break;
            case 7:
                headersArray = res.getStringArray(R.array.headers7);
                overviewArray = res.getStringArray(R.array.overview_band_and_other_saws7);

                configurationsArray = res.getStringArray(R.array.configuration7);
                actionTechniqueArray = res.getStringArray(R.array.action_technique7);
                adjustmentsArray = res.getStringArray(R.array.adjustments7);
                cutsArray = res.getStringArray(R.array.cuts7);
                safetyRemindersArray = res.getStringArray(R.array.safety_reminders7);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray, adjustmentsArray, cutsArray, safetyRemindersArray};
                break;
            case 8:
                headersArray = res.getStringArray(R.array.headers8);
                overviewArray = res.getStringArray(R.array.overview_band_and_other_saws8);

                configurationsArray = res.getStringArray(R.array.configuration8);
                actionTechniqueArray = res.getStringArray(R.array.action_technique8);
                adjustmentsArray = res.getStringArray(R.array.adjustments8);
                cutsArray = res.getStringArray(R.array.cuts8);
                safetyRemindersArray = res.getStringArray(R.array.safety_reminders8);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray, adjustmentsArray, cutsArray, safetyRemindersArray};
                break;
            case 9:
                headersArray = res.getStringArray(R.array.headers9);
                overviewArray = res.getStringArray(R.array.overview_circular_saws9);

                configurationsArray = res.getStringArray(R.array.configuration9);
                actionTechniqueArray = res.getStringArray(R.array.adjustments9);
                adjustmentsArray = res.getStringArray(R.array.adjustments9);
                cutsArray = res.getStringArray(R.array.cuts9);
                safetyRemindersArray = res.getStringArray(R.array.safety_reminders9);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray, adjustmentsArray, cutsArray, safetyRemindersArray};
                break;
            case 10:
                headersArray = res.getStringArray(R.array.headers10);
                overviewArray = res.getStringArray(R.array.overview_circular_saws10);

                configurationsArray = res.getStringArray(R.array.configuration10);
                actionTechniqueArray = res.getStringArray(R.array.action_technique10);
                adjustmentsArray = res.getStringArray(R.array.adjustments10);
                cutsArray = res.getStringArray(R.array.cuts10);
                safetyRemindersArray = res.getStringArray(R.array.safety_reminders10);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray, adjustmentsArray, cutsArray, safetyRemindersArray};
                break;
            case 11:
                headersArray = res.getStringArray(R.array.headers11);
                overviewArray = res.getStringArray(R.array.overview_circular_saws11);

                configurationsArray = res.getStringArray(R.array.configuration11);
                actionTechniqueArray = res.getStringArray(R.array.action_technique11);
                adjustmentsArray = res.getStringArray(R.array.adjustments11);
                cutsArray = res.getStringArray(R.array.cuts11);
                safetyRemindersArray = res.getStringArray(R.array.safety_reminders11);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray, adjustmentsArray, cutsArray, safetyRemindersArray};
                break;
            case 12:
                headersArray = res.getStringArray(R.array.headers12);
                overviewArray = res.getStringArray(R.array.overview_circular_saws12);

                configurationsArray = res.getStringArray(R.array.configuration12);
                actionTechniqueArray = res.getStringArray(R.array.action_technique12);
                adjustmentsArray = res.getStringArray(R.array.adjustments12);
                cutsArray = res.getStringArray(R.array.cuts12);
                safetyRemindersArray = res.getStringArray(R.array.safety_reminders12);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray, adjustmentsArray, cutsArray, safetyRemindersArray};
                break;
            case 13:
                headersArray = res.getStringArray(R.array.headers13);
                overviewArray = res.getStringArray(R.array.overview_shaping_tools13);

                configurationsArray = res.getStringArray(R.array.configuration13);
                actionTechniqueArray = res.getStringArray(R.array.action_technique13);
                adjustmentsArray = res.getStringArray(R.array.adjustments13);
                safetyRemindersArray = res.getStringArray(R.array.safety_reminders13);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray, adjustmentsArray, safetyRemindersArray};
                break;
            case 14:
                headersArray = res.getStringArray(R.array.headers14);
                overviewArray = res.getStringArray(R.array.overview_shaping_tools14);

                configurationsArray = res.getStringArray(R.array.configuration14);
                actionTechniqueArray = res.getStringArray(R.array.action_technique14);
                adjustmentsArray = res.getStringArray(R.array.adjustments14);
                safetyRemindersArray = res.getStringArray(R.array.safety_reminders14);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray, adjustmentsArray, safetyRemindersArray};
                break;
            case 15:
                headersArray = res.getStringArray(R.array.headers15);
                overviewArray = res.getStringArray(R.array.overview_shaping_tools15);

                configurationsArray = res.getStringArray(R.array.configuration15);
                actionTechniqueArray = res.getStringArray(R.array.action_technique15);
                adjustmentsArray = res.getStringArray(R.array.adjustments15);
                safetyRemindersArray = res.getStringArray(R.array.safety_reminders15);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray, adjustmentsArray, safetyRemindersArray};
                break;
            case 16:
                headersArray = res.getStringArray(R.array.headers16);
                overviewArray = res.getStringArray(R.array.overview_shaping_tools16);

                configurationsArray = res.getStringArray(R.array.configuration16);
                actionTechniqueArray = res.getStringArray(R.array.action_technique16);
                adjustmentsArray = res.getStringArray(R.array.adjustments16);
                safetyRemindersArray = res.getStringArray(R.array.safety_reminders16);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray, adjustmentsArray, safetyRemindersArray};
                break;
            case 17:
                headersArray = res.getStringArray(R.array.headers17);
                overviewArray = res.getStringArray(R.array.overview_pneumatic_tools17);

                configurationsArray = res.getStringArray(R.array.configuration17);
                actionTechniqueArray = res.getStringArray(R.array.action_technique17);
                adjustmentsArray = res.getStringArray(R.array.adjustments17);
                safetyRemindersArray = res.getStringArray(R.array.safety_reminders17);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray, adjustmentsArray, safetyRemindersArray};
                break;
            case 18:
                headersArray = res.getStringArray(R.array.headers18);
                overviewArray = res.getStringArray(R.array.overview_pneumatic_tools18);

                configurationsArray = res.getStringArray(R.array.configuration18);
                actionTechniqueArray = res.getStringArray(R.array.action_technique18);
                adjustmentsArray = res.getStringArray(R.array.adjustments18);
                safetyRemindersArray = res.getStringArray(R.array.safety_reminders18);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray, adjustmentsArray, safetyRemindersArray};
                break;
            case 19:
                headersArray = res.getStringArray(R.array.headers19);
                overviewArray = res.getStringArray(R.array.overview_pneumatic_tools19);

                configurationsArray = res.getStringArray(R.array.configuration19);
                actionTechniqueArray = res.getStringArray(R.array.action_technique19);
                adjustmentsArray = res.getStringArray(R.array.adjustments19);
                nailLoadingArray = res.getStringArray(R.array.nail_loading19);
                safetyRemindersArray = res.getStringArray(R.array.safety_reminders19);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray, adjustmentsArray, nailLoadingArray, safetyRemindersArray};
                break;
            case 20:
                headersArray = res.getStringArray(R.array.headers20);
                overviewArray = res.getStringArray(R.array.overview_pneumatic_tools20);

                configurationsArray = res.getStringArray(R.array.configuration20);
                actionTechniqueArray = res.getStringArray(R.array.action_technique20);
                adjustmentsArray = res.getStringArray(R.array.adjustments20);
                nailLoadingArray = res.getStringArray(R.array.nail_loading20);
                safetyRemindersArray = res.getStringArray(R.array.safety_reminders20);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray, adjustmentsArray, nailLoadingArray, safetyRemindersArray};
                break;
            case 21:
                headersArray = res.getStringArray(R.array.headers21);
                overviewArray = res.getStringArray(R.array.overview_sanders21);

                configurationsArray = res.getStringArray(R.array.configuration21);
                actionTechniqueArray = res.getStringArray(R.array.action_technique21);
                adjustmentsArray = res.getStringArray(R.array.adjustments21);
                safetyRemindersArray = res.getStringArray(R.array.safety_reminders21);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray, adjustmentsArray, safetyRemindersArray};
                break;
            case 22:
                headersArray = res.getStringArray(R.array.headers22);
                overviewArray = res.getStringArray(R.array.overview_sanders22);

                configurationsArray = res.getStringArray(R.array.configuration22);
                actionTechniqueArray = res.getStringArray(R.array.action_technique22);
                adjustmentsArray = res.getStringArray(R.array.adjustments22);
                safetyRemindersArray = res.getStringArray(R.array.safety_reminders22);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray, adjustmentsArray, safetyRemindersArray};
                break;
            case 23:
                headersArray = res.getStringArray(R.array.headers23);
                overviewArray = res.getStringArray(R.array.overview_sanders23);

                configurationsArray = res.getStringArray(R.array.configuration23);
                actionTechniqueArray = res.getStringArray(R.array.action_technique23);
                adjustmentsArray = res.getStringArray(R.array.adjustments23);
                safetyRemindersArray = res.getStringArray(R.array.safety_reminders23);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray, adjustmentsArray, safetyRemindersArray};
                break;
            case 24:
                headersArray = res.getStringArray(R.array.headers24);
                overviewArray = res.getStringArray(R.array.overview_power_drills24);

                configurationsArray = res.getStringArray(R.array.configuration24);
                actionTechniqueArray = res.getStringArray(R.array.action_technique24);
                adjustmentsArray = res.getStringArray(R.array.adjustments24);
                safetyRemindersArray = res.getStringArray(R.array.safety_reminders24);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray, adjustmentsArray, safetyRemindersArray};
                break;
            case 25:
                headersArray = res.getStringArray(R.array.headers25);
                overviewArray = res.getStringArray(R.array.overview_power_drills25);

                configurationsArray = res.getStringArray(R.array.configuration25);
                actionTechniqueArray = res.getStringArray(R.array.action_technique25);
                adjustmentsArray = res.getStringArray(R.array.adjustments25);
                safetyRemindersArray = res.getStringArray(R.array.safety_reminders25);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray, adjustmentsArray, safetyRemindersArray};
                break;
            case 26:
                headersArray = res.getStringArray(R.array.headers26);
                overviewArray = res.getStringArray(R.array.overview_router_bits26);

                configurationsArray = res.getStringArray(R.array.configuration26);
                actionTechniqueArray = res.getStringArray(R.array.action_technique26);
                adjustmentsArray = res.getStringArray(R.array.adjustments26);
                safetyRemindersArray = res.getStringArray(R.array.safety_reminders26);
                bulletPointsArray_ofArrays = new String[][]{configurationsArray, actionTechniqueArray, adjustmentsArray, safetyRemindersArray};
                break;
            case 27:
                headersArray = res.getStringArray(R.array.headers27);
                overviewArray = res.getStringArray(R.array.overview_dremel27);

                //there are no bullet points (tool-specific info) about this tool
                bulletPointsArray_ofArrays = new String[][]{};
                break;
            case 28:
                headersArray = res.getStringArray(R.array.headers28);
                overviewArray = res.getStringArray(R.array.overview_cordless_drill28);

                //there are no bullet points (tool-specific info) about this tool
                bulletPointsArray_ofArrays = new String[][]{};
                break;
        }
        getOverviewArray();
    }



    //needed for choosing the background
    public Integer getToolDrawable(){
        return toolDrawables[toolSelected];
    }

    //needed for the Location expandable list view
    public Integer getToolLocationDrawable(){
        return toolLocationDrawables[toolSelected];
    }

    //needed for the Safety Information expandable list view
    public String[] getHeadersArray(){
        return headersArray;
    }
    public String[] getOverviewArray(){
        return overviewArray;
    }
    public String[][] getBulletPointsArray_ofArrays(){
        return bulletPointsArray_ofArrays;
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

    public int getToolSelected(){
        return toolSelected;
    }
}
