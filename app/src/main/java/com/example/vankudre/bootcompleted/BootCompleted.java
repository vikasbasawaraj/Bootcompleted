package com.example.vankudre.bootcompleted;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by VANKUDRE on 15-01-2017.
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootCompleted extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {

            Intent i = new Intent();
            i.setAction(" com.example.vankudre.bootcompleted.AndroidStartServiceOnBoot");
            context.startService(i);
        }
    }
}