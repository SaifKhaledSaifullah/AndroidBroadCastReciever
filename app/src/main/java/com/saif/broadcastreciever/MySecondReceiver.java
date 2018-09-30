package com.saif.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MySecondReceiver extends BroadcastReceiver {
    private static final String TAG=MySecondReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e(TAG,"Hello From Second Receiver");
        //Toast.makeText(context, "Hello 2nd receiver", Toast.LENGTH_SHORT).show();
    }
}
