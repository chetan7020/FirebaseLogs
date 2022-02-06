package com.example.firebaselogs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        val toLogin = findViewById<Button>(R.id.toLogin)
        toLogin.setOnClickListener{
            val intent = Intent(this , LoginActivity::class.java)
            startActivity(intent)
        }
    }

}