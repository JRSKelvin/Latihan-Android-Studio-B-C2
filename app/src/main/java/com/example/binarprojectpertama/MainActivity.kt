package com.example.binarprojectpertama

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClickMain: Button = findViewById(R.id.button)
        val progressShow = findViewById<ProgressBar>(R.id.loadingSubmit)

        buttonClickMain.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
            progressShow.visibility = View.VISIBLE
        }
    }
}