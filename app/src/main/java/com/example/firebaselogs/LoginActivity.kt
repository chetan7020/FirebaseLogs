package com.example.firebaselogs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Transition
import android.view.View
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        val toSignup = findViewById<Button>(R.id.toSignup)
        toSignup.setOnClickListener{
            val intent = Intent(this , SignupActivity::class.java)
            startActivity(intent)
        }
    }
}