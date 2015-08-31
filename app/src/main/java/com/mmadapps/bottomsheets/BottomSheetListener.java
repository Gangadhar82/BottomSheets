package com.mmadapps.bottomsheets;

/**
 * Created by gangadhar.g on 8/18/2015.
 */
import android.view.MenuItem;

/**
 * Created by kcampagna on 8/9/15.
 */
public interface BottomSheetListener {

    void onSheetShown();

    void onSheetItemSelected(MenuItem item);

    void onSheetDismissed();
}

