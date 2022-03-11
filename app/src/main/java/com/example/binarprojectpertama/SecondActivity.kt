package com.example.binarprojectpertama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val buttonClick = findViewById<Button>(R.id.button2)
        val buttonClick2 = findViewById<Button>(R.id.button3)

        buttonClick.setOnClickListener {
            val intent = Intent(this@SecondActivity, ThirdActivity::class.java)
            startActivity(intent)
//            val url = "http://www.binaracademy.com"
//            val i = Intent(Intent.ACTION_VIEW)
//            i.data = Uri.parse(url)
//            startActivity(i)
        }

        buttonClick2.setOnClickListener {
            val intent = Intent(this@SecondActivity, FourthActivity::class.java)
            startActivity(intent)
        }
    }
}