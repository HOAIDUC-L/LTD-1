package com.example.myapp1


import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
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

            val sa = a.text.toString()
            val sb = b.text.toString()
            val sc = c.text.toString()

            if(sa.isEmpty() || sb.isEmpty() || sc.isEmpty()){
                Toast.makeText(this,"Nhập đủ dữ liệu",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            try{

                val aa = sa.toDouble()
                val bb = sb.toDouble()
                val cc = sc.toDouble()

                val delta = bb*bb - 4*aa*cc

                var kq = ""

                if(delta < 0)
                    kq = "Phương trình vô nghiệm"
                else if(delta == 0.0){
                    val x = -bb/(2*aa)
                    kq = "Nghiệm kép x = $x"
                }
                else{
                    val x1 = (-bb + kotlin.math.sqrt(delta))/(2*aa)
                    val x2 = (-bb - kotlin.math.sqrt(delta))/(2*aa)
                    kq = "x1 = $x1\nx2 = $x2"
                }

                val i = Intent(this, KetQuaActivity::class.java)
                i.putExtra("ketqua",kq)
                startActivity(i)

            }catch (e:Exception){
                Toast.makeText(this,"Dữ liệu sai",Toast.LENGTH_SHORT).show()
            }
        }
    }
}