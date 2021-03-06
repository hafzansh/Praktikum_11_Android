package com.hans.praktikum11

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.provider.Settings
import kotlinx.android.synthetic.main.activity_student.*

class StudentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        val stId = findViewById<EditText>(R.id.student_id)
        val stName = findViewById<EditText>(R.id.student_name)
        val stPhone = findViewById<EditText>(R.id.student_phone)
        val save = findViewById<Button>(R.id.save_button)
        val call = findViewById<Button>(R.id.call_button)



        save.setOnClickListener{
            val id = stId.text.toString()
            val name = stName.text.toString()
            val phone = stPhone.text.toString()

            val student = Student(id,name,phone)
            val i = Intent(this,ResultActivity::class.java)
            i.putExtra(ResultActivity.EXTRA_STUDENT,student)

            startActivity(i)
        }
        call.setOnClickListener {
            val phone = stPhone.text.toString()
            val i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phone"))
            startActivity(i)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.change_language_settings){
            val i = Intent(Settings.ACTION_LOCALE_SETTINGS)
            startActivity(i)
        }
        return super.onOptionsItemSelected(item)
    }
}
