package com.markh.safety.safetymarkh.controller;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.markh.safety.safetymarkh.R;
import com.metaio.sdk.ARViewActivity;
import com.metaio.sdk.jni.IGeometry;
import com.metaio.sdk.jni.IMetaioSDKCallback;
import com.metaio.sdk.jni.TrackingValues;
import com.metaio.sdk.jni.TrackingValuesVector;

public class ARActivity extends ARViewActivity {

//    @Override
//    protected int getGUILayout()
//    {
//        // Attaching layout to the activity
//        return R.layout.ar;
//    }
//
//
//    public void onButtonClick(View v)
//    {
//        finish();
//    }
//
//
//    @Override
//    protected void loadContents()
//    {
//        try
//        {
//            // Getting a file path for tracking configuration XML file
//            File trackingConfigFile = AssetsManager.getAssetPathAsFile(getApplicationContext(), "TrackingData_MarkerlessFast.xml");
//
//            // Assigning tracking configuration
//            boolean result = metaioSDK.setTrackingConfiguration(trackingConfigFile);
//            MetaioDebug.log("Tracking data loaded: " + result);
//
//            // Getting a file path for a 3D geometry
//            File metaioManModel = AssetsManager.getAssetPathAsFile(getApplicationContext(), "metaioman.md2");
////            File button = AssetsManager.getAssetPathAsFile(getApplicationContext(), "low.obj");
//            if (metaioManModel != null)
//            {
//                //cosID starts counting from 1
//                for (int i=1; i<=6; i++){
//                    // Loading 3D geometries (all the same geometries)
//                    IGeometry geometry = metaioSDK.createGeometry(metaioManModel);
//                    if (geometry != null)
//                    {
//                        // Set geometry properties
//                        geometry.setScale(2f);
//                        geometry.setCoordinateSystemID(i);
//                    }
//                    else
//                        MetaioDebug.log(Log.ERROR, "Error loading geometry: "+metaioManModel);
//                }
//
//            }
//        }
//        catch (Exception e)
//        {
//            MetaioDebug.printStackTrace(Log.ERROR, e);
//        }
//    }
//
//
//    @Override
//    protected void onGeometryTouched(IGeometry geometry)
//    {
//        int cosID = geometry.getCoordinateSystemID();
//
//        Intent intent = new Intent(getApplicationContext(), ToolActivity.class);
//        //cosID -1 because cosID starts counting from one.
//        intent.putExtra("toolSelection", cosID-1);
//        startActivity(intent);
////        switch (cosID){
////            case 1:
////                Intent toolSelection1 = new Intent(getApplicationContext(), ToolActivity.class);
//////                toolSelection.putExtra("toolSelection", cosID);
////                startActivity(toolSelection1);
////            case 2:
////                Intent toolSelection2 = new Intent(getApplicationContext(), ToolActivity.class);
//////                toolSelection.putExtra("toolSelection", cosID);
////                startActivity(toolSelection2);
////            case 3:
////                Intent toolSelection3 = new Intent(getApplicationContext(), ToolActivity.class);
//////                toolSelection.putExtra("toolSelection", cosID);
////                startActivity(toolSelection3);
////            case 4:
////                Intent toolSelection4 = new Intent(getApplicationContext(), ToolActivity.class);
//////                toolSelection.putExtra("toolSelection", cosID);
////                startActivity(toolSelection4);
////            case 5:
////                Intent toolSelection5 = new Intent(getApplicationContext(), ToolActivity.class);
//////                toolSelection.putExtra("toolSelection", cosID);
////                startActivity(toolSelection5);
////            case 6:
////                Intent toolSelection6 = new Intent(getApplicationContext(), ToolActivity.class);
//////                toolSelection.putExtra("toolSelection", cosID);
////                startActivity(toolSelection6);
////        }
//    }
//
//
//    @Override
//    protected IMetaioSDKCallback getMetaioSDKCallbackHandler()
//    {
//        // No callbacks needed in this tutorial
//        return null;
//    }
//}

    private MetaioSDKCallbackHandler mCallbackHandler;
    private ARActivity mThis;
    private AlertDialog mAlert;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCallbackHandler = new MetaioSDKCallbackHandler();

        // Set QRCode tracking configuration
        metaioSDK.setTrackingConfiguration("QRCODE");
        mThis = this;
        mAlert = null;
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mCallbackHandler.delete();
        mCallbackHandler = null;
    }

    @Override
    protected int getGUILayout() {
        return R.layout.ar;
    }

    @Override
    protected IMetaioSDKCallback getMetaioSDKCallbackHandler() {
        return mCallbackHandler;
    }

    final class MetaioSDKCallbackHandler extends IMetaioSDKCallback {

        @Override
        public void onTrackingEvent(TrackingValuesVector trackingValues) {
            for (int i = 0; i < trackingValues.size(); i++) {
                final TrackingValues v = trackingValues.get(i);
                if (v.isTrackingState()) {
                    // reading the code
                    final String[] tokens = v.getAdditionalValues().split("::");
                    if (tokens.length > 1) {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                if (mAlert == null) {
                                    synchronized (mAlert = new AlertDialog.Builder(mThis)
                                            .setTitle("Scanned QR-Code")
                                            .setMessage(tokens[1])
                                            .setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.cancel();
                                                    int toolSelected = Integer.parseInt(tokens[1].substring(tokens[1].length() - 1));
                                                    Intent intent = new Intent(mThis, ToolActivity.class);
                                                    intent.putExtra("toolSelection", toolSelected);
                                                    startActivity(intent);
                                                }
                                            })
                                            .setNegativeButton("Back", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.cancel();
                                                }
                                            })
                                            .create()) {
                                    }
                                }
                                if (!mAlert.isShowing()) {
                                    mAlert.setMessage(tokens[1]);
                                    mAlert.show();
                                }
                            }
                        });
                    }
                }

            }
        }

    }
//      The exit button method, pre-installed by Metaio
//    public void onButtonClick(View v)
//    {
//        finish();
//    }

    @Override
    protected void loadContents() {
        // TODO Auto-generated method stub

    }

    @Override
    protected void onGeometryTouched(IGeometry geometry) {
        // TODO Auto-generated method stub

    }
}


