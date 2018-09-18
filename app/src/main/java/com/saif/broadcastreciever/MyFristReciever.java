package com.saif.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyFristReciever extends BroadcastReceiver {

    private static final String TAG=MyFristReciever.class.getSimpleName();
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e(TAG,"Hello Reciever");

    }
}
