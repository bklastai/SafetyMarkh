package com.markh.safety.safetymarkh.controller;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.markh.safety.safetymarkh.R;
import com.metaio.sdk.ARViewActivity;
import com.metaio.sdk.jni.IGeometry;
import com.metaio.sdk.jni.IMetaioSDKCallback;
import com.metaio.sdk.jni.TrackingValues;
import com.metaio.sdk.jni.TrackingValuesVector;

public class ARActivity extends ARViewActivity {


    private MetaioSDKCallbackHandler mCallbackHandler;
    private ARActivity mThis;
    private AlertDialog mAlert;
    private int toolSelected;
    private static String[] tokens;

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
        return R.layout.ar_activity;
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
                    // reading the tool name/code
                    tokens = v.getAdditionalValues().split("::");
                    if (tokens.length > 1) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                if (mAlert == null) {
                                    synchronized (mAlert = new AlertDialog.Builder(mThis)
                                            .setTitle("Tool Detected:")
                                            .setMessage(tokens[1])
                                            .setNegativeButton("Back", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.cancel();
                                                }
                                            })
                                            .setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.cancel();
                                                    toolSelected = Integer.parseInt(tokens[1].substring(tokens[1].length() - 2));
                                                    Intent intent = new Intent(mThis, ToolActivity.class);
                                                    intent.putExtra("toolSelection", toolSelected);
                                                    startActivity(intent);
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

    //The exit button method, pre-installed by Metaio
    public void onButtonClick(View v)
    {
        finish();
    }

    @Override
    protected void loadContents() {
        // TODO Auto-generated method stub

    }

    @Override
    protected void onGeometryTouched(IGeometry geometry) {
        // TODO Auto-generated method stub

    }
}


