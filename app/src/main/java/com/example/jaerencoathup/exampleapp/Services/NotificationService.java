package com.example.jaerencoathup.exampleapp.Services;

/**
 * Created by jaerencoathup on 05/08/2017.
 */

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import android.support.v4.content.LocalBroadcastManager;


public class NotificationService extends NotificationListenerService {

    Context context;

    @Override

    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {

        int x = 0;

        //Big text will get you full email on normal emails.
        //sbn.getNotification().extras.get(Notification.EXTRA_BIG_TEXT)
//        String pack = sbn.getPackageName();
//        String ticker = sbn.getNotification().tickerText;
//        Bundle extras = sbn.getNotification().extras;
//        ß title = extras.getString("android.title");
//        String text = "";
        //extras.getCharSequence("android.text");
        //sbn.getNotification().extras.get(Notification.EXTRA_TEXT_LINES)
//
//        Log.i("Package",pack);
//        Log.i("Ticker",ticker);
//        Log.i("Title",title);
//        Log.i("Text",text);
//
//        Intent msgrcv = new Intent("Msg");
//        msgrcv.putExtra("package", pack);
//        msgrcv.putExtra("ticker", ticker);
//        msgrcv.putExtra("title", title);
//        msgrcv.putExtra("text", text);
//
//        LocalBroadcastManager.getInstance(context).sendBroadcast(msgrcv);
    }

    @Override

    public void onNotificationRemoved(StatusBarNotification sbn) {
        Log.i("Msg","Notification Removed");

    }
}
