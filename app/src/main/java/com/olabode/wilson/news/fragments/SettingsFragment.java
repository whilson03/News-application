package com.olabode.wilson.news.fragments;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

import com.olabode.wilson.news.R;

public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.settings_main);
    }

//    @Override
//    public void onActivityCreated(Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        // To get a preference
//        PreferenceScreen preferenceScreen = getPreferenceScreen();
//        Preference preference = preferenceScreen.findPreference("preference_ key_defined_in_the_xml");
//
//        //You can set a listener
//        preference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
//            @Override
//            public boolean onPreferenceClick(Preference preference) {
//                return false;
//            }
//        });
//
//        //change title
//        //preference.setTitle("my_title");
//
//        // etc
//    }
}