package net.glxn.android;

import android.os.Bundle;
import android.util.Log;


public class Sub extends ExtendedActivity {
    private final String TAG = this.getClass().getSimpleName();

    public void onCreate(Bundle savedInstanceState) {
        Log.v(TAG, "Activity State: onCreate()");

        super.onCreate(savedInstanceState);
    }
}