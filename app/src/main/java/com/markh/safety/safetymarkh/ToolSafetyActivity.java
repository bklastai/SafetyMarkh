package com.markh.safety.safetymarkh;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Benas on 3/11/2015.
 */
public class ToolSafetyActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tool_safety);

        Bundle bundle = getIntent().getExtras();
        final int safetyRequest = bundle.getInt("safetyRequest");



    }

}
