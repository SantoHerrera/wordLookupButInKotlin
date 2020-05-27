package com.examplebeginer.wordlookupbutinkotlin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val wordTyped = findViewById<TextView>(R.id.textView)

        //val pleaseWork = intent.getStringArrayExtra("lost")

        val intent = intent
        val bundle = intent.extras

        wordTyped.text = bundle.toString()

        //wordTyped.text = pleaseWork
//        val lostasf = Intent(this, Main2Activity::class.java)
//        Intent intent = getIntent(lostasf)
    }

}
