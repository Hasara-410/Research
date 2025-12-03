package com.example.lankalens

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EditProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        val btnSave: Button = findViewById(R.id.btnSave)
        val btnCancel: Button = findViewById(R.id.btnCancel)

        btnSave.setOnClickListener {
            // Later: save to Firebase
            finish()
        }

        btnCancel.setOnClickListener {
            finish()
        }
    }
}
