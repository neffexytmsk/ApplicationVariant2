package com.example.application2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GeneralActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.general_main)
        initBack()
        activityobj()
    }
    fun initBack() {
        var btnimg = findViewById<ImageView>(R.id.imageView2)
        var btnSearch = findViewById<ImageView>(R.id.imageSearch)
        btnimg.setOnClickListener() {
            val intent = Intent(this@GeneralActivity, MainActivity::class.java)
            startActivity(intent)
        }
        btnSearch.setOnClickListener() {
            val intent = Intent(this@GeneralActivity, SearchActivity::class.java)
            startActivity(intent)
        }
    }
    fun activityobj(){
        var btnimg = findViewById<ImageView>(R.id.imageView2)
        var btnSearch = findViewById<ImageView>(R.id.imageSearch)
        btnimg.setBackground(getResources().getDrawable(R.drawable.activity_one))
        btnSearch.setBackground(getResources().getDrawable(R.drawable.activity_two))
    }
}