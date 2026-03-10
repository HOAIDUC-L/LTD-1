package com.example.myapp1

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.sqrt

class TamGiacActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tamgiac)

        val a = findViewById<EditText>(R.id.aTG)
        val b = findViewById<EditText>(R.id.bTG)
        val c = findViewById<EditText>(R.id.cTG)
        val btn = findViewById<Button>(R.id.btnTinhTG)
        val kq = findViewById<TextView>(R.id.kqTG)

        btn.setOnClickListener {

            val aa = a.text.toString().toDouble()
            val bb = b.text.toString().toDouble()
            val cc = c.text.toString().toDouble()

            val p = aa + bb + cc

            val s = p/2

            val dienTich = sqrt(s*(s-aa)*(s-bb)*(s-cc))

            kq.text = "Chu vi = $p\nDiện tích = $dienTich"
        }
    }
}