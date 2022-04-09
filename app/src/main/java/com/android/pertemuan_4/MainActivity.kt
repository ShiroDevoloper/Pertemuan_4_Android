package com.android.pertemuan_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnDisplayMessage.setOnClickListener {
            Toast.makeText(applicationContext, "Hello world", Toast.LENGTH_SHORT).show()
        }

        btnDisplayMessage.setOnLongClickListener {
            Snackbar.make(root_layout,"Long click", Snackbar.LENGTH_LONG).show()
            true
        }
    }
}