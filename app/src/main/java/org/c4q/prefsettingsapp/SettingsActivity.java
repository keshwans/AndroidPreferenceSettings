package org.c4q.prefsettingsapp;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by keshwans on 7/11/15.
 */
public class SettingsActivity extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
