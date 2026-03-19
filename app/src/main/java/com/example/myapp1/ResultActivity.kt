package com.example.myapp1

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvTen = findViewById<TextView>(R.id.tvTen)
        val tvMSSV = findViewById<TextView>(R.id.tvMSSV)
        val tvEmail = findViewById<TextView>(R.id.tvEmail)
        val tvSDT = findViewById<TextView>(R.id.tvSDT)
        val tvLop = findViewById<TextView>(R.id.tvLop)
        val tvKhoa = findViewById<TextView>(R.id.tvKhoa)
        val btnBack = findViewById<Button>(R.id.btnBack)

        val intent = intent

        tvTen.text = "Tên: " + intent.getStringExtra("ten")
        tvMSSV.text = "MSSV: " + intent.getStringExtra("mssv")
        tvEmail.text = "Email: " + intent.getStringExtra("email")
        tvSDT.text = "SDT: " + intent.getStringExtra("sdt")
        tvLop.text = "Lớp: " + intent.getStringExtra("lop")
        tvKhoa.text = "Khoa: " + intent.getStringExtra("khoa")

        btnBack.setOnClickListener {
            finish()
        }
    }
}