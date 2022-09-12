package com.example.zeeservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import kotlin.concurrent.thread

class SplashSvcreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_svcreen)
        var res = findViewById<TextView>(R.id.textViewSplashCounter)

        var handler = Handler()
        thread {
                for(i in 1..5){
                    Thread.sleep(1000)
                    handler.post {
                        res.setText("$i")
                    }
                }

            var i = Intent(this, MainActivity::class.java)
            startActivity(i)

        }
    }
}