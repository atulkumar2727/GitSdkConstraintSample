package com.example.constraintLaySample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import java.util.concurrent.atomic.AtomicLong
import kotlin.concurrent.thread

class FileSdkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

  /*      val c = AtomicLong()

        for (i in 1..1_000_000L)
            thread(start = true) {
                c.addAndGet(i)
            }

        println(c.get())*/

    }

    fun addTwoNo() {
        Toast.makeText(this, "Hi, sdk  add function  called", Toast.LENGTH_SHORT).show()
    }

    fun addSubNo() {
        Toast.makeText(this, "Hi, sdk  subtract function  called", Toast.LENGTH_SHORT).show()
    }
}
