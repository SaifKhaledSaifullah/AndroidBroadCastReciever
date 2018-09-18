package com.saif.broadcastreciever;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG= MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendBroadcastMassage(View view) {
        Intent intent=new Intent(MainActivity.this,MyFristReciever.class);
        sendBroadcast(intent);
    }
}
