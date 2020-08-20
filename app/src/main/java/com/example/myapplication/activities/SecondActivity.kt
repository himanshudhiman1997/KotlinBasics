package com.example.myapplication.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.Constants
import com.example.myapplication.R
import com.example.myapplication.showToast
import kotlinx.android.synthetic.main.activity_second2.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        val bundle: Bundle? = intent.extras

        bundle?.let {

            val msg = bundle.getString(Constants.USER_MSG_KEY)

            showToast(msg.toString())

            textFromPrevious.text = msg
        }

    }
}