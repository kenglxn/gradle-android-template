package net.glxn.android;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main extends ExtendedActivity {

    private final String TAG = this.getClass().getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.v(TAG, "Activity State: onCreate()");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        registerListener(findViewById(R.id.launchSubBtn), new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG, "launchSubBtn clicked");
                launchIntent(Sub.class);
            }
        });

    }

}
