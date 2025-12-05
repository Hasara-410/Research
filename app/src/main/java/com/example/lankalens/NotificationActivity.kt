package com.example.lankalens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView


class NotificationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)
        val ivBack: ImageView = findViewById(R.id.ivBack)

        ivBack.setOnClickListener {
            finish()   // 🔙 Go back to HomeActivity
        }

    }
}
