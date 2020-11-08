package com.hans.praktikum11

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val iEmail = findViewById<EditText>(R.id.textMail)
        val iPassword = findViewById<EditText>(R.id.textPassword)
        val Login = findViewById<Button>(R.id.loginBt)

        loginBt.setOnClickListener{
            val Email = iEmail.text.toString().trim()
            val Password = iPassword.text.toString()
            Toast.makeText(this,Email, Toast.LENGTH_SHORT).show()

        }


    }
}
