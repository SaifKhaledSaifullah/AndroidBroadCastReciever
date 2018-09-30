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

        Intent intent=new Intent("my.first.receiver");

        // Sending Data from Activity to BCR using Intent
        intent.putExtra("name","Saif Khaled Saifullah");
        intent.putExtra("age",29);
        sendBroadcast(intent);
    }

    public void sendThirdBroadcastMassage(View view) {


        Intent intent=new Intent(MainActivity.this,ThirdReceiver.class);

        // Sending Data from Activity to BCR using Bundle
        Bundle bundle=new Bundle();
        bundle.putString("name","Khaled Saifullah");
        bundle.putInt("age",29);
        intent.putExtras(bundle);

        sendBroadcast(intent);
        /*Intent intent=new Intent("my.third.receiver");
        sendBroadcast(intent);*/

        /*Intent intent=new Intent("my.own.receiver");
        sendBroadcast(intent);*/
    }


    /* ========================   Inner class for THIRD RECEIVER ======================== */

    public static class ThirdReceiver extends BroadcastReceiver{
        private static String TAG=ThirdReceiver.class.getCanonicalName();
        private static final String DATA_TAG="BCR3 DATA";

        @Override
        public void onReceive(Context context, Intent intent) {
            // Receiving data from Activity using intent and print in LOG statement;

            Log.e(DATA_TAG,intent.getStringExtra("name"));
            Log.e(DATA_TAG,String.valueOf(intent.getIntExtra("age",0)));

            Log.e(TAG,"Hello From Third Receiver");
            //Toast.makeText(context, "Hello From Third Receiver", Toast.LENGTH_SHORT).show();

        }
    }
}
