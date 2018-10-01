package com.saif.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MySecondReceiver extends BroadcastReceiver {
    private static final String TAG=MySecondReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e(TAG,"Hello From Second Receiver");
        if(isOrderedBroadcast())
        {
            // Retrieving bundle and printing data on log
            Bundle b=getResultExtras(true);

            Log.e(TAG,"CODE: "+getResultCode()+", DATA: "+getResultData()+", BundleData: "
            +b.getString("job"));
            b.putString("job","Senior Dev");

            // Set up initial data for next BCR
            setResultCode(200);
            setResultData("Why So Serious");
            setResultExtras(b);


        }
        //Toast.makeText(context, "Hello 2nd receiver", Toast.LENGTH_SHORT).show();
    }
}
