package com.tiefensuche.motionmate.ui.cards

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.tiefensuche.motionmate.R
import com.tiefensuche.motionmate.ui.MainActivity
import kotlinx.android.synthetic.main.activity_login_one.*

class loginOne : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_one)

        loginBtn.setOnClickListener {
            val loginIntent = Intent(this, MainActivity::class.java)
            startActivity(loginIntent)
        }
        signupBtn.setOnClickListener {
            val signupIntent = Intent(this,registration::class.java)
            startActivity(signupIntent)
        }
        }


}

