package com.yjg.demopendingintent;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnSendFirst;
    private Button btnSendSecond;
    private User user1;
    private User user2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSendFirst = (Button) findViewById(R.id.btn_send_first);
        btnSendSecond = (Button) findViewById(R.id.btn_send_second);

        btnSendFirst.setOnClickListener(this);
        btnSendSecond.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_send_first:
                user1 = new User("1","name1","info1");
                Intent intentFirst = new Intent(this, MoreInfoActivity.class);
                intentFirst.putExtra("user",user1);
                NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
                PendingIntent pi = PendingIntent.getActivity(this, 1, intentFirst, PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(pi);
                long[] vibrates = {0, 500};
                Notification notification = builder
                        .setContentTitle("Title First")
                        .setContentText("Content First")
                        .setWhen(System.currentTimeMillis())
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setVibrate(vibrates)
                        .build();
                NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                manager.notify(11, notification);
                break;
            case R.id.btn_send_second:
                user2 = new User("2","name2","info2");
                Intent intentSecond = new Intent(this, MoreInfoActivity.class);
                intentSecond.putExtra("user",user2);
                NotificationCompat.Builder builder2 = new NotificationCompat.Builder(this);
                PendingIntent pi2 = PendingIntent.getActivity(this, 2, intentSecond, PendingIntent.FLAG_UPDATE_CURRENT);
                builder2.setContentIntent(pi2);
                long[] vibrates2 = {0, 500};
                Notification notification2 = builder2
                        .setContentTitle("Title Second")
                        .setContentText("Content Second")
                        .setWhen(System.currentTimeMillis())
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setVibrate(vibrates2)
                        .build();
                NotificationManager manager2 = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                manager2.notify(22, notification2);
                break;
        }
    }
}