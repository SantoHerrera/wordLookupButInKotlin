package com.examplebeginer.wordlookupbutinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchBar = findViewById<TextView>(R.id.searchBar)

        searchBar.setOnClickListener {



            val builder = AlertDialog.Builder(this)

            builder.setTitle("console.log.alert")

            Toast.makeText(this@MainActivity, "worked", Toast.LENGTH_LONG).show()

            builder.setMessage("fuck")

            builder.setPositiveButton("Ight", null)


            //Create the alertDialog
            val alertDialog: AlertDialog = builder.create()

            //set other dialog properties
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }
}
