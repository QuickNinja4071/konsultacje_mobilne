package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tekst = "okej"
        var liczba = 2.2f
        findViewById<Button>(R.id.przycisk_1).setOnClickListener {
            tekst = findViewById<TextInputEditText>(R.id.wczytywanie).text.toString()   // wczytywanie tekstu
            findViewById<Button>(R.id.przycisk_1).text = tekst                          // wyświetlanie tekstu
            // findViewById<Button>(R.id.przycisk_1).text = liczba.toString()   ; konwertowanie var(liczby) na string(tekst)
            // liczba = findViewById<Button>(R.id.przycisk_1).text.toString().toFloat()     ; konwersja z var(liczby) na string(tekst) na float(liczba z przecinkami)
        }
        findViewById<RadioButton>(R.id.wybor_zielony).setOnClickListener {
            findViewById<Button>(R.id.przycisk_1).text = "zielony tekst"
        }
    }
}