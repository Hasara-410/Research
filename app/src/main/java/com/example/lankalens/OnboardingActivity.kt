package com.example.lankalens

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OnboardingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        val btnNext: Button = findViewById(R.id.btnNext)
        val tvSkip: TextView = findViewById(R.id.tvSkip)

        btnNext.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }

        tvSkip.setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
        }
    }
}
