package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.birthdaygreet.BirthdayGreetingActivity.Companion.NAME_EXTRA
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayButton(view: View) {

        val name = nameInput.editableText.toString()
//        val text = findViewById<EditText>(R.id.nameInput)
//        val name = text.editableText.toString()
//
//        Toast.makeText(this, "Name is $name", Toast.LENGTH_LONG).show()

        val intent = Intent(this, BirthdayGreetingActivity::class.java)
        intent.putExtra(NAME_EXTRA, name)
        startActivity(intent)

    }
}