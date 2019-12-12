package com.tiefensuche.motionmate.ui.cards

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.tiefensuche.motionmate.R
import com.tiefensuche.motionmate.ui.MainActivity
import kotlinx.android.synthetic.main.activity_second_page.*

@SuppressLint("Registered")
class secondPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)

        nextbuttonofThird.setOnClickListener {
            val buttonIntent = Intent(this, loginOne::class.java)
            startActivity(buttonIntent)
        }

    }
}