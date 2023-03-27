package com.example.application2

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        click()
    }
    fun init(){
        var btnContinue = findViewById<Button>(R.id.button)
        var passwordOne = findViewById<EditText>(R.id.editTextPassword)
        var passwordConfirm = findViewById<EditText>(R.id.editTextPasswordConfirm)
        btnContinue.setOnClickListener()
        {
            if ((passwordOne.text.length>0&&passwordConfirm.text.length>0)&&(passwordOne.text.toString()==passwordConfirm.text.toString()))
            {
                val intent = Intent(this@MainActivity,GeneralActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this@MainActivity,"Un correct",Toast.LENGTH_LONG).show()
            }
        }
    }
    fun click(){
        var btnContinue = findViewById<Button>(R.id.button)
        var passwordOne = findViewById<EditText>(R.id.editTextPassword)
        var passwordConfirm = findViewById<EditText>(R.id.editTextPasswordConfirm)
        passwordOne.addTextChangedListener(object : TextWatcher
        {
            @RequiresApi(Build.VERSION_CODES.M)
            override fun afterTextChanged(s: Editable) {
                if(passwordOne.text.length>0&&passwordConfirm.text.length>0)
                {
                    btnContinue.setTextColor(this@MainActivity.getColor(R.color.white))
                    btnContinue.background = this@MainActivity.getDrawable(R.drawable.button_continue_password_activity)

                }
                if(passwordOne.text.length==0&&passwordConfirm.text.length==0)
                {
                    btnContinue.setTextColor(this@MainActivity.getColor(R.color.white))
                    btnContinue.background = this@MainActivity.getDrawable(R.drawable.button_continue_password)

                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

            }
        })
        passwordConfirm.addTextChangedListener(object : TextWatcher
        {
            @RequiresApi(Build.VERSION_CODES.M)
            override fun afterTextChanged(s: Editable) {
                if(passwordOne.text.length>0&&passwordConfirm.text.length>0)
                {
                    btnContinue.setTextColor(this@MainActivity.getColor(R.color.white))
                    btnContinue.background = this@MainActivity.getDrawable(R.drawable.button_continue_password_activity)

                }
                if(passwordOne.text.length==0&&passwordConfirm.text.length==0)
                {
                    btnContinue.setTextColor(this@MainActivity.getColor(R.color.white))
                    btnContinue.background = this@MainActivity.getDrawable(R.drawable.button_continue_password)

                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

            }
        })
    }
}