package com.example.picasso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val iv = findViewById<ImageView>(R.id.imageView)
        Picasso.get()
            .load("https://developeroleg.ucoz.ru/Images/Article/android-wins.jpg")
            .error(R.drawable.ic_launcher_background)
            .placeholder(R.drawable.ic_launcher_background)
            .resize(250, 250)
            .into(iv)
    }
}