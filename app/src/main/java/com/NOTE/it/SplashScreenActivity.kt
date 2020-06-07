package com.NOTE.it

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT:Long=1500 // 3 sec
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            // This method will be executed once the timer is over
            // Start your app main activity

            startActivity(Intent(this,MainActivity::class.java))

            // close this activity
            finish()
        }, SPLASH_TIME_OUT)
    }
}
