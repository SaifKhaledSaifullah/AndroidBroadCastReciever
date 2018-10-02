package com.saif.broadcastreciever;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DynamictBCRActivity extends AppCompatActivity {
    private MyFristReciever myFristReciever;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamicbcr);
        myFristReciever=new MyFristReciever();
    }

    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter intentFilter=new IntentFilter();
        intentFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        registerReceiver(myFristReciever,intentFilter);
    }

    @Override
    protected void onPause() {
        unregisterReceiver(myFristReciever);
        super.onPause();
    }
}
