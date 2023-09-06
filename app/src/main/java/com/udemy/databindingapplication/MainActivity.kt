package com.udemy.databindingapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.udemy.databindingapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = DataBindingUtil.setContentView(
            this, R.layout
                .activity_main
        )

        bind.apply {
            btn.setOnClickListener {
                var enteredtext: String = editText.text.toString()
                textView.setText("Hello $enteredtext")
            }


        }
    }
}
