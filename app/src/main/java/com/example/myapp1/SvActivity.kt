package com.example.myapp1


import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class SvActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sinhvien)

        val edtTen = findViewById<EditText>(R.id.edtTen)
        val edtMSSV = findViewById<EditText>(R.id.edtMSSV)
        val edtEmail = findViewById<EditText>(R.id.edtEmail)
        val edtSDT = findViewById<EditText>(R.id.edtSDT)
        val edtLop = findViewById<EditText>(R.id.edtLop)
        val edtKhoa = findViewById<EditText>(R.id.edtKhoa)
        val btnGui = findViewById<Button>(R.id.btnGui)

        btnGui.setOnClickListener {

            val intent = Intent(this, ResultActivity::class.java)

            intent.putExtra("ten", edtTen.text.toString())
            intent.putExtra("mssv", edtMSSV.text.toString())
            intent.putExtra("email", edtEmail.text.toString())
            intent.putExtra("sdt", edtSDT.text.toString())
            intent.putExtra("lop", edtLop.text.toString())
            intent.putExtra("khoa", edtKhoa.text.toString())

            startActivity(intent)
        }
    }
}