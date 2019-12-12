package com.tiefensuche.motionmate.ui.cards

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.tiefensuche.motionmate.R
import com.tiefensuche.motionmate.ui.MainActivity

@SuppressLint("Registered")
class LoginOne : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_one)

        val mloginBtn = findViewById<Button>(R.id.loginBtn)
        val mSignupBtn= findViewById<Button>(R.id.signupBtn)

        mloginBtn.setOnClickListener {
            startActivity(Intent(this@LoginOne, MainActivity::class.java))
        }
        mSignupBtn.setOnClickListener {
            startActivity(Intent(this@LoginOne,registrationPage::class.java))
        }
        }


}

