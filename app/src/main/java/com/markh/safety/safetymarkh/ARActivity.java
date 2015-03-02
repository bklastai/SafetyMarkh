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
        return R.layout.activity_ar;
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
                for (int i=1; i<=2; i++){
                    // Loading 3D geometries (all the same geometries)
                    IGeometry geometry = metaioSDK.createGeometry(metaioManModel);
                    if (geometry != null)
                    {
                        // Set geometry properties
                        geometry.setScale(4f);
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
        switch (cosID){
            case 1:
                Intent toolSelection = new Intent(getApplicationContext(), ToolOptionsActivity.class);
                toolSelection.putExtra("toolSelection", cosID);
                startActivity(toolSelection);
        }
    }


    @Override
    protected IMetaioSDKCallback getMetaioSDKCallbackHandler()
    {
        // No callbacks needed in this tutorial
        return null;
    }


}
