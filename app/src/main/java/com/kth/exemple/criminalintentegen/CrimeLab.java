package com.kth.exemple.criminalintentegen;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by joshuapro on 15-07-17.
 */
public class CrimeLab  {

    private static CrimeLab mCrimeLab;
    private Context mAppContext;
    private ArrayList<Crime> mCrimes;

    private CrimeLab(Context appContext){
        mAppContext=appContext;
        mCrimes = new ArrayList<Crime>();
        for (int i=0; i< 100; i++){
            Crime c= new Crime();
            c.setmTitle("Crime #"+ i);
            c.setmSolved(i % 2 == 0);
            mCrimes.add(c);
        }
    }

    public static CrimeLab get(Context c){
        if (mCrimeLab==null){
            mCrimeLab= new CrimeLab(c.getApplicationContext());
        }
        return mCrimeLab;
    }
    public Crime getCrime(UUID id) {
        for (Crime c : mCrimes) {
            if (c.getmId().equals(id))
                return c;
        }
        return null;
    }
    public ArrayList<Crime> getCrimes() {
        return mCrimes;
    }
}
