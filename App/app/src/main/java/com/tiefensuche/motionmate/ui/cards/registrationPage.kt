package com.tiefensuche.motionmate.ui.cards

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.tiefensuche.motionmate.R
import com.tiefensuche.motionmate.ui.MainActivity

class registrationPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val mnextBtn = findViewById<Button>(R.id.nextmapbtn)

        mnextBtn.setOnClickListener {
            startActivity(Intent(this@registrationPage, MainActivity::class.java))
        }


    }




}
