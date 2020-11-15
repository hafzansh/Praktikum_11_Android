package com.hans.praktikum11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_ID = "id_student"
        const val EXTRA_NAME = "name_student"
        const val EXTRA_PHONE = "phone_student"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val stId = findViewById<TextView>(R.id.r_student_id)
        val stName = findViewById<TextView>(R.id.r_student_name)
        val stPhone = findViewById<TextView>(R.id.r_student_phone)

        stId.text = intent.getStringExtra(EXTRA_ID)
        stName.text = intent.getStringExtra(EXTRA_NAME)
        stPhone.text = intent.getStringExtra(EXTRA_PHONE)

        back_button.setOnClickListener{
            finish()
        }
    }
}
