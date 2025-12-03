package com.example.lankalens

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ResetPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)

        val btnReset: Button = findViewById(R.id.btnResetPassword)
        btnReset.setOnClickListener {
            // Later: update password in Firebase
            startActivity(Intent(this, SignInActivity::class.java))
            finish()
        }
    }
}
