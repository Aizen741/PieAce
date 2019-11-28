package com.example.pieace_healthapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second_page.*

class secondPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)
        nextbuttonofThird.setOnClickListener { val buttonIntent = Intent(this,LoginActivity::class.java)
            startActivity(buttonIntent)}

    }
}
