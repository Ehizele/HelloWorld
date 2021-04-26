package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var text =  findViewById<TextView>(R.id.textView)
        var add = findViewById<Button>(R.id.increment)

        add.setOnClickListener {
            count ++
            text.setText("$count")
        }
    }

}