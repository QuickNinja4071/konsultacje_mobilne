package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tekst = "okej"
        findViewById<Button>(R.id.przycisk_1).setOnClickListener {
            tekst = findViewById<TextInputEditText>(R.id.wczytywanie).text.toString()   // wczytywanie tekstu
            findViewById<Button>(R.id.przycisk_1).text = tekst                          // wyświetlanie tekstu
        }
    }
}