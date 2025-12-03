package com.example.lankalens

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val btnSendCode: Button = findViewById(R.id.btnSendCode)
        btnSendCode.setOnClickListener {
            // Later: send email via Firebase
            startActivity(Intent(this, OtpVerifyActivity::class.java))
        }
    }
}
