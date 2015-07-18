package com.kth.exemple.criminalintentegen;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by joshuapro on 15-07-17.
 */
public abstract class SingelFragmentActivity extends FragmentActivity {

    protected abstract Fragment createFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fragment);

        FragmentManager manager=getFragmentManager();

        Fragment fragment= manager.findFragmentById(R.id.fragmentContainer);

        if (fragment== null){
            fragment=createFragment();
            manager.beginTransaction().add(R.id.fragmentContainer,fragment).commit();
        }

    }
}
