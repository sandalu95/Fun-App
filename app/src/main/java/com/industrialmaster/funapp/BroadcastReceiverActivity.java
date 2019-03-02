package com.industrialmaster.funapp;

import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class BroadcastReceiverActivity extends AppCompatActivity {

    MyReceiver receiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_receiver);
    }

    public void register(View view){
        IntentFilter filter=new IntentFilter();
        filter.addAction("android.intent.action.PHONE_STATE");
        receiver=new MyReceiver();
        registerReceiver(receiver,filter);
        Toast.makeText(this,"Registered!",Toast.LENGTH_SHORT).show();
    }

    public void unregister(View view){
        receiver=new MyReceiver();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(receiver);
        Toast.makeText(this,"Unregistered!",Toast.LENGTH_SHORT).show();
    }
}
