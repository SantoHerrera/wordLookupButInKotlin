package com.examplebeginer.wordlookupbutinkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.view.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchButton = findViewById<TextView>(R.id.searchButton)
        val wordTyped = findViewById<TextView>(R.id.wordTyped)


        val idk = wordTyped.text.toString()


        searchButton.setOnClickListener {
            //String fuck  "fjka";



            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("lost", idk)
            startActivity(intent);

        }


    }

}


