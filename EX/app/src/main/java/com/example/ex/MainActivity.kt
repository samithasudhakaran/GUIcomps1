package com.example.guiapp

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val TextView:TextView
        TextView=findViewById(R.id.textView)
        val btnView:Button
        val btnFont:Button
        btnFont=findViewById(R.id.btnFont)
        var fontcolor:Int=0
        var fontsize:Float=5f
        btnView=findViewById<Button>(R.id.btnView)
        btnView.setOnClickListener {
            when (fontcolor) {
                0 -> TextView.setTextColor(Color.RED)
                1 -> TextView.setTextColor(Color.GREEN)
                2 -> TextView.setTextColor(Color.BLUE)
            }
            fontcolor++
            Toast.makeText(applicationContext,"Colour Changed",Toast.LENGTH_SHORT).show()
        }
        btnFont.setOnClickListener{
            TextView.setTextSize(fontsize)
            fontsize=(fontsize+5)%50
            Toast.makeText(applicationContext,"Font Size Changed",Toast.LENGTH_SHORT).show()
        }

    }
}