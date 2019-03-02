package com.industrialmaster.funapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //get extra details received from the intent in to a bundle
        Bundle extras=intent.getExtras();
        if(extras!=null){
            String state=extras.getString(TelephonyManager.EXTRA_STATE);
            if(state.equals(TelephonyManager.EXTRA_STATE_RINGING)){
                String phoneNo=extras.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
                Toast.makeText(context,"You got a call from"+phoneNo,Toast.LENGTH_SHORT).show();
            }
        }

    }
}
