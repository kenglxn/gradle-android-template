package net.glxn.proximus;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main extends ExtendedActivity {

    private static final String TAG = Proximus.class.getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.v(TAG, "Activity State: onCreate()");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        registerListener(findViewById(R.id.setLocationBtn), new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG, "setLocationBtn clicked");
                launchIntent(LocationAdder.class);
            }
        });

        registerListener(findViewById(R.id.addLocationBtn), new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG, "addLocationBtn clicked");
                launchIntent(LocationAdder.class);
            }
        });

        registerListener(findViewById(R.id.manageLocationsBtn), new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG, "manageLocationsBtn clicked");
                launchIntent(LocationAdder.class);
            }
        });

    }

}
