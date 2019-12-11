package com.tiefensuche.motionmate.ui.cards

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.tiefensuche.motionmate.R
import kotlinx.android.synthetic.main.activity_starting.*

@SuppressLint("Registered")
class StartingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_starting)

    getStartedBtn.setOnClickListener { val buttonIntent = Intent(this,firstPage::class.java)
        startActivity(buttonIntent)}


}
}
