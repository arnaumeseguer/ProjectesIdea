package com.example.appsimple

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import android.app.AlertDialog

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)
        enableEdgeToEdge()

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            // Create input fields for A and B
            val inputA = EditText(this)
            inputA.hint = "Enter point A"
            val inputB = EditText(this)
            inputB.hint = "Enter point B"

            val layout = LinearLayout(this)
            layout.orientation = LinearLayout.VERTICAL
            layout.addView(inputA)
            layout.addView(inputB)

            AlertDialog.Builder(this)
                .setTitle("Enter two points")
                .setView(layout)
                .setPositiveButton("Calculate") { _, _ ->
                    val a = inputA.text.toString().toDoubleOrNull()
                    val b = inputB.text.toString().toDoubleOrNull()
                    if (a != null && b != null) {
                        val distance = kotlin.math.abs(a - b)
                        AlertDialog.Builder(this)
                            .setMessage("Distance between A and B: $distance")
                            .setPositiveButton("OK", null)
                            .show()
                    } else {
                        AlertDialog.Builder(this)
                            .setMessage("Please enter valid numbers.")
                            .setPositiveButton("OK", null)
                            .show()
                    }
                }
                .setNegativeButton("Cancel", null)
                .show()
        }
    }
}