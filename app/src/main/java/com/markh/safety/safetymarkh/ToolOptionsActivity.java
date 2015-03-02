package com.markh.safety.safetymarkh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static java.lang.Integer.parseInt;

/**
 * Created by Benas on 3/1/2015.
 */
public class ToolOptionsActivity extends Activity {

    private static final Object[] TOOL_SELECTION = new View[4];

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_options);

//        Intent someToolPressed = getIntent();
//        int toolPressed = parseInt(someToolPressed.getStringExtra("toolSelection"));

        final Button locationButton = (Button) findViewById(R.id.button_tool_location);
        final Button safetyButton = (Button) findViewById(R.id.button_tool_safety_info);

        locationButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent locateMe = new Intent(getApplicationContext(), ToolLocationActivity.class);
                startActivity(locateMe);
            }
        });
        safetyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent getSafetyInfo = new Intent(getApplicationContext(), ToolSafetyInfoActivity.class);
                startActivity(getSafetyInfo);
            }
        });
    }

}
