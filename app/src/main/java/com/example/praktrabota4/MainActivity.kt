package com.example.praktrabota4

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val buttonOpen: Button = findViewById(R.id.buttonOpen)
        val imageView: ImageView = findViewById(R.id.imageView)
        val buttonClose: Button = findViewById(R.id.buttonClose)

        buttonOpen.setOnClickListener {
            imageView.visibility = View.VISIBLE
            buttonClose.visibility = View.VISIBLE
            buttonOpen.visibility = View.GONE
        }
        buttonClose.setOnClickListener {
            imageView.visibility = View.GONE
            buttonClose.visibility = View.GONE
            buttonOpen.visibility = View.VISIBLE
        }
    }
}