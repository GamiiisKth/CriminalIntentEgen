package com.kth.exemple.criminalintentegen;

import android.app.Fragment;

/**
 * Created by joshuapro on 15-07-17.
 */
public class CrimeListActivity extends SingelFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
