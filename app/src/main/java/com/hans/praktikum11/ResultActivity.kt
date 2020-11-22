package com.hans.praktikum11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    companion object{

        const val EXTRA_STUDENT = "student"
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



        val student = intent.getParcelableExtra<Student>(EXTRA_STUDENT)
        if (student != null) {
            stId.text = student.id
            stName.text = student.name
            stPhone.text = student.phone
        }
        back_button.setOnClickListener{
            finish()
        }
    }
}
