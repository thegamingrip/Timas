package com.arielviolla.timasfinal

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var resultTextView: TextView
    private lateinit var compareButton: Button

    private lateinit var viewModel: TicmasViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         editText1 = findViewById(R.id.editText1)
         editText2 = findViewById(R.id.editText2)
         resultTextView = findViewById(R.id.resultTextView)
         compareButton = findViewById(R.id.compareButton)

        compareButton.setOnClickListener {

            compareStrings()

        }



    }


    private fun compareStrings() {
        val str1 = editText1.text.toString()
        val str2 = editText2.text.toString()

        val viewModel = ViewModelProvider(this).get(TicmasViewModel::class.java)
        viewModel.compareStrings(str1, str2)

        viewModel.comparisonResult.observe(this) { areEqual ->
            if (areEqual) {
                resultTextView.text = "Las cadenas son iguales"
            } else {
                resultTextView.text = "Las cadenas son diferentes"
            }
        }
    }
}