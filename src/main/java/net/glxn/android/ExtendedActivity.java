package net.glxn.android;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

public abstract class ExtendedActivity extends Activity {

    protected void registerListener(View setLocBtn, View.OnClickListener onClickListener) {
        setLocBtn.setOnClickListener(onClickListener);
    }

    protected void launchIntent(Class<?> clazz) {
        Intent i = new Intent(this, clazz);
        startActivity(i);
    }

}
