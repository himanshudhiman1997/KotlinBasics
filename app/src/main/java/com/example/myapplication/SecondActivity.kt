package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second2.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        val bundle: Bundle? = intent.extras

        val msg = bundle!!.getString("value")

        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()

        textFromPrevious.text = msg

    }
}