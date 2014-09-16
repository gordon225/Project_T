package com.allenxiao.gordon.repeattimerl;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;



public class Main extends Activity implements AddTimerFragment.SetTimerListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set main layout container
        setContentView(R.layout.activity_main);

        //Check if we returned from a previous state
        if (savedInstanceState == null) {
            //Nothing saved from previous state
            //Create new fragments
            MainDisplayFragment mainFragment = new MainDisplayFragment();
            AddTimerFragment addTimerFragment = new AddTimerFragment();

            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            //Add fragments below to the main layout
            transaction.add(R.id.container, mainFragment);
            transaction.add(R.id.container, addTimerFragment);

            transaction.commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onTimerSet(int min, int sec) {

    }
}
