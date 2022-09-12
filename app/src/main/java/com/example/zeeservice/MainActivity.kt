package com.example.zeeservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonStart = findViewById<Button>(R.id.buttonStart)
        var buttonStop = findViewById<Button>(R.id.buttonStop)


        buttonStart.setOnClickListener {

            var myIntent = Intent(this, MyService::class.java)
            startService(myIntent)

        }

        buttonStop.setOnClickListener {
            var myIntent = Intent(this, MyService::class.java)
            stopService(myIntent)
        }
    }

    override fun onBackPressed() {
        //super.onBackPressed()
        Toast.makeText(this, "BACK WIL NOT WORK", Toast.LENGTH_SHORT).show()
    }
}