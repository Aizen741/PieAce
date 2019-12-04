package com.example.pieace_healthapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        loginLoginbtn.setOnClickListener {
            val loginIntent = Intent(this,secondPage::class.java)
            startActivity(loginIntent)
        }

    }




}
