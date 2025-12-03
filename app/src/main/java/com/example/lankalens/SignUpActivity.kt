package com.example.lankalens

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btnSignUp: Button = findViewById(R.id.btnSignUp)
        val tvAlready: TextView = findViewById(R.id.tvAlready)

        btnSignUp.setOnClickListener {
            // Later: validate + Firebase sign up
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        tvAlready.setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
            finish()
        }
    }
}
