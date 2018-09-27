package com.saif.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG= MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendBroadcastMassage(View view) {
       // Intent intent=new Intent(MainActivity.this,MyFristReciever.class);

        Intent intent=new Intent("my.own.receiver");
        sendBroadcast(intent);
    }

    public void sendThirdBroadcastMassage(View view) {
        //Intent intent=new Intent(MainActivity.this,ThirdReceiver.class);
        /*Intent intent=new Intent("my.third.receiver");
        sendBroadcast(intent);*/
    }


    /* ========================   Inner class for THIRD RECEIVER ======================== */

    public static class ThirdReceiver extends BroadcastReceiver{
        private static String TAG=ThirdReceiver.class.getCanonicalName();

        @Override
        public void onReceive(Context context, Intent intent) {
            Log.e(TAG,"Hello From Third Receiver");
            //Toast.makeText(context, "Hello From Third Receiver", Toast.LENGTH_SHORT).show();

        }
    }
}
