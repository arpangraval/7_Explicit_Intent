package com.example.a7_explicit_intent_stud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        sendBTN.setOnClickListener {
            var sid:String = studentidET.text.toString()
            var snm:String = studentnameET.text.toString()
            var brc:String = branchET.text.toString()

            if(sid != "" && snm !="" && brc !="")
            {

                var intent = Intent(this,MainActivity2::class.java)
                intent.putExtra("id",sid)
                intent.putExtra("nm",snm)
                intent.putExtra("brc",brc)

                startActivity(intent)
            }
            else
            {
                Toast.makeText(this,"Enter All the fields",Toast.LENGTH_SHORT).show()
            }

        }

    }
}