package com.example.myapp1

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
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

                if(aa + bb <= cc || aa + cc <= bb || bb + cc <= aa){
                    Toast.makeText(this,"Không phải tam giác",Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                val p = aa + bb + cc
                val s = p/2
                val dt = kotlin.math.sqrt(s*(s-aa)*(s-bb)*(s-cc))

                val i = Intent(this, KetQuaActivity::class.java)
                i.putExtra("ketqua","Chu vi = $p\nDiện tích = $dt")
                startActivity(i)

            }catch (e:Exception){
                Toast.makeText(this,"Dữ liệu sai",Toast.LENGTH_SHORT).show()
            }
        }
    }
}