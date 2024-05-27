package com.example.dddice

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        

        val rdOutput = findViewById<TextView>(R.id.results)
        val viewOnGithub = findViewById<ImageButton>(R.id.viewOnGithub)
        val btn1to3 = findViewById<Button>(R.id.btn1to3)
        val btn1to4 = findViewById<Button>(R.id.btn1to4)
        val btn1to6 = findViewById<Button>(R.id.btn1to6)
        val btn1to8 = findViewById<Button>(R.id.btn1to8)
        val btn1to10 = findViewById<Button>(R.id.btn1to10)
        val btn1to20 = findViewById<Button>(R.id.btn1to20)
        val btn1to100 = findViewById<Button>(R.id.btn1to100)
        viewOnGithub.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.github.com/1hyzh/DnDDice")) //open source
            startActivity(browserIntent)

        }
        //all buttons functions
        btn1to3.setOnClickListener {
            val rdout = Random.nextInt(3) + 1
            rdOutput.text = rdout.toString()
        }
        btn1to4.setOnClickListener {
            val rdOut = Random.nextInt(4) + 1
            rdOutput.text = rdOut.toString()
        }
        btn1to6.setOnClickListener {
            val rdOut = Random.nextInt(6) + 1
            rdOutput.text = rdOut.toString()
        }
        btn1to8.setOnClickListener {
            val rdOut = Random.nextInt(8) + 1
            rdOutput.text = rdOut.toString()
        }
        btn1to10.setOnClickListener {
            val rdOut = Random.nextInt(10) + 1
            rdOutput.text = rdOut.toString()
        }
        btn1to20.setOnClickListener {
            val rdOut = Random.nextInt(20) + 1
            rdOutput.text = rdOut.toString()
        }
        btn1to100.setOnClickListener {
            val rdOut = Random.nextInt(100) + 1
            rdOutput.text = rdOut.toString()
        }
    }
}