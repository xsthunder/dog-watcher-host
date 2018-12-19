package com.example.android.bluetoothchat;

import android.content.Context;

public class Util {
    private static final int NOTI_PRIMARY1 = 1100;
    final private Context activity;
    public Util(Context activity){
        this.activity = activity;
    }
    void notify( String title, String body){
        NotificationHelper notificationHelper = new NotificationHelper(activity);
        notificationHelper.notify(NOTI_PRIMARY1, notificationHelper.getNotification1(title, body));
    }
    void notify( String body){
        this.notify( "通知", body);
    }
}
