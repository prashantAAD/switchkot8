package com.example.switchkot8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val swit=findViewById<Switch>(R.id.switch1)
        swit.setOnClickListener {
            if (swit.isChecked){
                Toast.makeText(this@MainActivity,"switch on",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this@MainActivity,"switch off",Toast.LENGTH_LONG).show()
            }
        }
    }
}