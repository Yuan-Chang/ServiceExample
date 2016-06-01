package com.teeoda.serviceexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by home on 6/1/16.
 */
public class BootBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        context.startService(new Intent(context,MyService.class));
    }
}
