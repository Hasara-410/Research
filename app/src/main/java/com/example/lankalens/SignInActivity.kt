package com.example.lankalens

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val btnSignIn: Button = findViewById(R.id.btnSignIn)
        val tvForgot: TextView = findViewById(R.id.tvForgot)
        val tvNoAccount: TextView = findViewById(R.id.tvNoAccount)

        btnSignIn.setOnClickListener {
            // Later: Firebase sign in
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        tvForgot.setOnClickListener {
            startActivity(Intent(this, ForgotPasswordActivity::class.java))
        }

        tvNoAccount.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}
