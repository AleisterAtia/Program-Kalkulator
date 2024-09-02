package com.fadhiil2010.latihan3layout

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.ButtonBarLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class KalkkulatorSederhana : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_kalkkulator_sederhana)

        val etAngka1 = findViewById<EditText>(R.id.etAngka1)
        val etAngka2 = findViewById<EditText>(R.id.etAngka2)
        val btnTambah = findViewById<Button>(R.id.btnTambah)
        val btnKurang = findViewById<Button>(R.id.btnKurang)
        val btnkali = findViewById<Button>(R.id.btnkali)
        val txthasil = findViewById<TextView>(R.id.txthasil)

        fun stringToInt(value: String): Int {
            return value.toIntOrNull() ?: 0
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnTambah.setOnClickListener {
            val Angka1 = stringToInt(etAngka1.text.toString())
            val Angka2 = stringToInt(etAngka2.text.toString())
            val Hasil = Angka1 + Angka2
            txthasil.text = " Hasil : $Hasil"
        }
        btnKurang.setOnClickListener {
            val Angka1 = stringToInt(etAngka1.text.toString())
            val Angka2 = stringToInt(etAngka2.text.toString())
            val Hasil = Angka1 - Angka2
            txthasil.text = " Hasil : $Hasil"
        }
        btnkali.setOnClickListener {
            val Angka1 = stringToInt(etAngka1.text.toString())
            val Angka2 = stringToInt(etAngka2.text.toString())
            val Hasil = Angka1 * Angka2
            txthasil.text = " Hasil : $Hasil"
        }
    }
}