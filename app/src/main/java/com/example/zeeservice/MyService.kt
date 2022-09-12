package com.example.zeeservice

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.util.Log

class MyService : Service() {

    lateinit var mp : MediaPlayer

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    override fun onCreate() {
        super.onCreate()
        Log.i("mytag", "service created")
        mp = MediaPlayer.create(this, R.raw.abc)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i("mytag", "service started")
        return super.onStartCommand(intent, flags, startId)
        mp.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("mytag", "service destryoed")

        mp.stop()
    }
}