package com.markh.safety.safetymarkh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

/**
* Created by Benas on 3/1/2015.
*/
public class ToolOptionsActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tool_options);


        Bundle bundle = getIntent().getExtras();
        final int toolPressed = bundle.getInt("toolSelection");



        final Button locationButton = (Button) findViewById(R.id.button_tool_location);
        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent locationRequest = new Intent(getApplicationContext(), ToolLocationActivity.class);
                locationRequest.putExtra("locationRequest", toolPressed);
                startActivity(locationRequest);
            }
        });
        final Button safetyButton = (Button) findViewById(R.id.button_tool_safety_info);
        safetyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent getSafetyInfo = new Intent(getApplicationContext(), ToolSafetyActivity.class);
                getSafetyInfo.putExtra("safetyRequest", toolPressed);
                startActivity(getSafetyInfo);
            }
        });
    }

}
