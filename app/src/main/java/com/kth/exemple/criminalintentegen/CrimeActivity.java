package com.kth.exemple.criminalintentegen;


import android.app.Fragment;

public class CrimeActivity extends SingelFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
