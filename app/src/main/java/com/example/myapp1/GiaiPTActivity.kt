package com.example.myapp1


import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.sqrt

class GiaiPTActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pt)

        val a = findViewById<EditText>(R.id.a)
        val b = findViewById<EditText>(R.id.b)
        val c = findViewById<EditText>(R.id.c)
        val btn = findViewById<Button>(R.id.btnGiai)
        val kq = findViewById<TextView>(R.id.kqPT)

        btn.setOnClickListener {

            val aa = a.text.toString().toDouble()
            val bb = b.text.toString().toDouble()
            val cc = c.text.toString().toDouble()

            val delta = bb*bb - 4*aa*cc

            if(delta < 0){
                kq.text = "Phương trình vô nghiệm"
            }
            else if(delta == 0.0){
                val x = -bb/(2*aa)
                kq.text = "Nghiệm kép x = $x"
            }
            else{
                val x1 = (-bb + sqrt(delta))/(2*aa)
                val x2 = (-bb - sqrt(delta))/(2*aa)

                kq.text = "x1 = $x1\nx2 = $x2"
            }
        }
    }
}