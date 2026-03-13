package com.example.myapp1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class KetQuaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ketqua)

        val tv = findViewById<TextView>(R.id.tvKetQua)
        val btnBack = findViewById<Button>(R.id.btnBack)

        val kq = intent.getStringExtra("ketqua")

        tv.text = "Kết quả là:\n$kq"

        btnBack.setOnClickListener {
            Toast.makeText(this,"Đã hoàn thành",Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}