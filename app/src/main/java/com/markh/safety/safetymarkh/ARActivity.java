package com.markh.safety.safetymarkh;

import java.io.File;

import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.metaio.sdk.ARViewActivity;
import com.metaio.sdk.MetaioDebug;
import com.metaio.sdk.jni.IGeometry;
import com.metaio.sdk.jni.IMetaioSDKCallback;
import com.metaio.tools.io.AssetsManager;

public class ARActivity extends ARViewActivity {

    @Override
    protected int getGUILayout()
    {
        // Attaching layout to the activity
        return R.layout.ar;
    }


    public void onButtonClick(View v)
    {
        finish();
    }


    @Override
    protected void loadContents()
    {
        try
        {
            // Getting a file path for tracking configuration XML file
            File trackingConfigFile = AssetsManager.getAssetPathAsFile(getApplicationContext(), "TrackingData_MarkerlessFast.xml");

            // Assigning tracking configuration
            boolean result = metaioSDK.setTrackingConfiguration(trackingConfigFile);
            MetaioDebug.log("Tracking data loaded: " + result);

            // Getting a file path for a 3D geometry
            File metaioManModel = AssetsManager.getAssetPathAsFile(getApplicationContext(), "metaioman.md2");
//            File button = AssetsManager.getAssetPathAsFile(getApplicationContext(), "low.obj");
            if (metaioManModel != null)
            {
                //cosID starts counting from 1
                for (int i=1; i<=6; i++){
                    // Loading 3D geometries (all the same geometries)
                    IGeometry geometry = metaioSDK.createGeometry(metaioManModel);
                    if (geometry != null)
                    {
                        // Set geometry properties
                        geometry.setScale(2f);
                        geometry.setCoordinateSystemID(i);
                    }
                    else
                        MetaioDebug.log(Log.ERROR, "Error loading geometry: "+metaioManModel);
                }

            }
        }
        catch (Exception e)
        {
            MetaioDebug.printStackTrace(Log.ERROR, e);
        }
    }


    @Override
    protected void onGeometryTouched(IGeometry geometry)
    {
        int cosID = geometry.getCoordinateSystemID();

        Intent intent = new Intent(getApplicationContext(), ToolOptionsActivity.class);
        //cosID -1 because cosID starts counting from one.
        intent.putExtra("toolSelection", cosID-1);
        startActivity(intent);
//        switch (cosID){
//            case 1:
//                Intent toolSelection1 = new Intent(getApplicationContext(), ToolOptionsActivity.class);
////                toolSelection.putExtra("toolSelection", cosID);
//                startActivity(toolSelection1);
//            case 2:
//                Intent toolSelection2 = new Intent(getApplicationContext(), ToolOptionsActivity.class);
////                toolSelection.putExtra("toolSelection", cosID);
//                startActivity(toolSelection2);
//            case 3:
//                Intent toolSelection3 = new Intent(getApplicationContext(), ToolOptionsActivity.class);
////                toolSelection.putExtra("toolSelection", cosID);
//                startActivity(toolSelection3);
//            case 4:
//                Intent toolSelection4 = new Intent(getApplicationContext(), ToolOptionsActivity.class);
////                toolSelection.putExtra("toolSelection", cosID);
//                startActivity(toolSelection4);
//            case 5:
//                Intent toolSelection5 = new Intent(getApplicationContext(), ToolOptionsActivity.class);
////                toolSelection.putExtra("toolSelection", cosID);
//                startActivity(toolSelection5);
//            case 6:
//                Intent toolSelection6 = new Intent(getApplicationContext(), ToolOptionsActivity.class);
////                toolSelection.putExtra("toolSelection", cosID);
//                startActivity(toolSelection6);
//        }
    }


    @Override
    protected IMetaioSDKCallback getMetaioSDKCallbackHandler()
    {
        // No callbacks needed in this tutorial
        return null;
    }


}
