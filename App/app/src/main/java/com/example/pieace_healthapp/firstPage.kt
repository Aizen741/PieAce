package com.example.pieace_healthapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first_page.*

class firstPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_page)
        nextBtn.setOnClickListener { val buttonIntent = Intent(this,secondPage::class.java)
            startActivity(buttonIntent)}

    }
}
