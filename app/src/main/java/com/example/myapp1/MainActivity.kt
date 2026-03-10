package com.example.myapp1

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val so1 = findViewById<EditText>(R.id.so1)
        val so2 = findViewById<EditText>(R.id.so2)
        val btn = findViewById<Button>(R.id.btnTinh)
        val kq = findViewById<TextView>(R.id.kq)

        btn.setOnClickListener {

            val a = so1.text.toString()
            val b = so2.text.toString()

            if (a.isEmpty() || b.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập đủ dữ liệu", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val tong = a.toInt() + b.toInt()

            kq.text = "Kết quả: $tong"
        }

        val btnPT = findViewById<Button>(R.id.btnPT)
        val btnTamGiac = findViewById<Button>(R.id.btnTamGiac)

        btnPT.setOnClickListener {
            val i = Intent(this, GiaiPTActivity::class.java)
            startActivity(i)
        }

        btnTamGiac.setOnClickListener {
            val i = Intent(this, TamGiacActivity::class.java)
            startActivity(i)
        }
    }
}