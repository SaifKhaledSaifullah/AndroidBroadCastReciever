package com.saif.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MySecondReciever extends BroadcastReceiver {
    private static final String TAG=MySecondReciever.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e(TAG,"Hello From Second Receiver");
    }
}
