package com.doxua.www.faceinternaldbr3;

import android.app.NotificationManager;

import android.graphics.Bitmap;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;


public class DetailsActivity extends AppCompatActivity {
    //When the notification is clicked on the phone, a new screen will appear

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Log.d("PLAYGROUND", "Details ID: " + getIntent().getIntExtra("EXTRA_DETAILS_ID", -1));

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.cancel(MainActivity.NOTIFICATION_ID);


    }

    @Override
    protected void onStart() {
        super.onStart();


    }
}
