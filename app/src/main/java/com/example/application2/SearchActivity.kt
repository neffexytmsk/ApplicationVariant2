package com.example.application2

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_main)
        initBack()
        activity_back()
    }
    fun initBack(){
        var btnBack = findViewById<ImageView>(R.id.imageViewBack)
        var btnClear = findViewById<ImageView>(R.id.clearimg)
        var textSearch = findViewById<EditText>(R.id.editTextSearch)
        btnBack.setOnClickListener(){
            val intent = Intent(this@SearchActivity,GeneralActivity::class.java)
            startActivity(intent)
        }
        btnClear.setOnClickListener(){
            textSearch.setText("")
        }
    }
    fun activity_back(){
        var btnBack = findViewById<ImageView>(R.id.imageViewBack)
        var btnClear = findViewById<ImageView>(R.id.clearimg)
        btnBack.setBackground(getResources().getDrawable(R.drawable.activity_one))
        btnClear.setBackground(getResources().getDrawable(R.drawable.activity_three))
    }
}