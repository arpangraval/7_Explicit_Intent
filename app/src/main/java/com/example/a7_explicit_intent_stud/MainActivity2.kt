package com.example.a7_explicit_intent_stud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var intent = getIntent()
        idTV.text = intent.getStringExtra("id")
        nameTV.text = intent.getStringExtra("nm")
        branchTV.text = intent.getStringExtra("brc")

        backBTN.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))


        }

    }
}