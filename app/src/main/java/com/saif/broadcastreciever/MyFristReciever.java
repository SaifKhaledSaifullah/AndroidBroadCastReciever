package com.saif.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MyFristReciever extends BroadcastReceiver {

    private static final String TAG=MyFristReciever.class.getSimpleName();
    private static final String DATA_TAG="BCR DATA";
    @Override
    public void onReceive(Context context, Intent intent) {
        // Receiving data from Activity using intent and print in LOG statement;
        //Log.e(DATA_TAG,intent.getStringExtra("name"));
        //Log.e(DATA_TAG,String.valueOf(intent.getIntExtra("age",0)));

        Log.e(TAG,"Hello From First Receiver");

        if(isOrderedBroadcast())
        {
            Bundle b=getResultExtras(true);

            Log.e(TAG,"CODE: "+getResultCode()+", DATA: "+getResultData()+", BundleData: "
                    +b.getString("job"));
            b.putString("job","Product Manager");


            setResult(400,"Finallyyyy",b);


        }

    }
}
