package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        btnStart.setOnClickListener {
            if (tvname.text.toString().isEmpty()){
                Toast.makeText(this,"Add name",Toast.LENGTH_LONG).show()
            }else{
                val intent= Intent(this,QuizQActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}