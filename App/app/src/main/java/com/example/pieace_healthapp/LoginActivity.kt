package com.example.pieace_healthapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(){
    private var mFirebaseAnalytics:FirebaseAnalytics? = null

    private var mAuth: FirebaseAuth?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this)
        mAuth = FirebaseAuth.getInstance()

    }

    fun loginLoginbtnClicked() {

        val email = loginEmailText.text.toString()
        val password = loginEmailText.text.toString()
        loginToFirebase(email,password)


    }
    fun loginToFirebase(email:String, password:String){
        mAuth!!.createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener(this){task ->
                if(task.isSuccessful){
                    Toast.makeText(applicationContext,"Successful login",Toast.LENGTH_LONG).show()
                    val currentUser = mAuth!!.currentUser
                    Log.d("Login:",currentUser!!.uid)
                }else{
                    Toast.makeText(applicationContext,"Failed Login",Toast.LENGTH_LONG).show()

                }
            }
    }
    // this is how you connect the second page after you login
    override fun onStart(){
        super.onStart()
        val currentUser= mAuth!!.currentUser
        if (currentUser != null){
            val intent = Intent(this,thirdpage::class.java)
            startActivity(intent)
        }
    }



}
