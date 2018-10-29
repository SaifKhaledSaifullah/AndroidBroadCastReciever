package com.saif.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class DynamictBCRActivity extends AppCompatActivity {
    private MyFristReciever myFristReciever;
    private TextView textView;
    private int counter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamicbcr);
        textView = (TextView) findViewById(R.id.textView);
        myFristReciever = new MyFristReciever();
    }

    @Override
    protected void onResume() {
        super.onResume();
        /*IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        registerReceiver(myFristReciever, intentFilter);*/
    }

    @Override
    protected void onPause() {
        //unregisterReceiver(myFristReciever);
        super.onPause();
    }

    public void registerReceiver(View view) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Intent.ACTION_TIME_TICK);
        registerReceiver(bcr, intentFilter);
    }

    public void unregisterReceiver(View view) {
        unregisterReceiver(bcr);
    }

    private BroadcastReceiver bcr = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            textView.setText(counter+" minute has  gone ");
            counter++;
        }
    };
}
