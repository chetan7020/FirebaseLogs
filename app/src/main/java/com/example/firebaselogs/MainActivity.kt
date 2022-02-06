package com.example.firebaselogs

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        val topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        val bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)
        val logo = findViewById<ImageView>(R.id.imageView)
        val textLogo = findViewById<TextView>(R.id.textView)
        val slogan = findViewById<TextView>(R.id.textView2)
        logo.startAnimation(topAnim)
        textLogo.startAnimation(bottomAnim)
        slogan.startAnimation(bottomAnim)
        Handler().postDelayed({
            val intent = Intent(this , LoginActivity::class.java)
            startActivity(intent)
        }, 2000)


    }
}