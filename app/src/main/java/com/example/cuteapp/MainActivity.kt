package com.example.cuteapp

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var clearTextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        textView = findViewById(R.id.textView)
        clearTextButton = findViewById(R.id.clearTextBtn)
        clearTextButton.visibility = View.GONE // Hide the clear text button initially

        // Set up button click listeners
        findViewById<ImageButton>(R.id.dogBtn).setOnClickListener {
            textView.text = "You clicked on the cute dog!"
            textView.setTextColor(Color.GREEN)
            clearTextButton.setBackgroundColor(Color.GREEN)
            clearTextButton.visibility = View.VISIBLE
        }

        findViewById<ImageButton>(R.id.imageButton5).setOnClickListener {
            textView.text = "You clicked on the capybara with a bird on it!"
            textView.setTextColor(Color.RED)
            clearTextButton.setBackgroundColor(Color.RED)
            clearTextButton.visibility = View.VISIBLE
        }

        findViewById<ImageButton>(R.id.imageButton3).setOnClickListener {
            textView.text = "You clicked on the group of cute cats!"
            textView.setTextColor(Color.BLUE)
            clearTextButton.setBackgroundColor(Color.BLUE)
            clearTextButton.visibility = View.VISIBLE
        }

        // Clear text button listener
        clearTextButton.setOnClickListener {
            textView.text = getString(R.string.please_touch_on_one_of_the_animal_icon)
            textView.setTextColor(Color.GRAY)
            clearTextButton.visibility = View.GONE
        }
    }
}
