package com.saif.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MyFourthReceiver extends BroadcastReceiver {
    private static final String TAG=MyFourthReceiver.class.getSimpleName();
    @Override
    public void onReceive(Context context, Intent intent) {

        Log.e(TAG,"Hello From Fourth Receiver");
        if(isOrderedBroadcast())
        {
            Bundle b=getResultExtras(true);

            Log.e(TAG,"CODE: "+getResultCode()+", DATA: "+getResultData()+", BundleData: "
                    +b.getString("job"));



        }
    }
}
