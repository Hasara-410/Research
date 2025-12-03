package com.example.lankalens

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OtpVerifyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp_verify)

        val btnVerify: Button = findViewById(R.id.btnVerify)
        btnVerify.setOnClickListener {
            // Later: check code
            startActivity(Intent(this, ResetPasswordActivity::class.java))
            finish()
        }
    }
}
