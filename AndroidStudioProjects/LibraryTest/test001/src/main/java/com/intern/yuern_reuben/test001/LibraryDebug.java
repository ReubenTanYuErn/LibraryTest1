package com.intern.yuern_reuben.test001;

import android.util.Log;

/**
 * Created by yuern_000 on 2/6/2017.
 */

public class LibraryDebug {
    private static final String TAG = "This_is_an_app_library";

    public static void d(String message){
        Log.d(TAG, message);
    }
}

