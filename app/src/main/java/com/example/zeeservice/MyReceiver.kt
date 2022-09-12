package com.example.zeeservice

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, p1: Intent?) {
        Toast.makeText(context, "AIRPLANE MODE ...",Toast.LENGTH_LONG).show()
    }
}