package com.example.material_design

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var usernameInput: TextInputEditText
    private lateinit var passwordInput: TextInputEditText
    private lateinit var contactNumberInput: TextInputEditText
    private lateinit var resetButton: Button
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameInput = findViewById(R.id.edit_text_username)
        passwordInput = findViewById(R.id.edit_text_password)
        contactNumberInput = findViewById(R.id.edit_text_Number)
        resetButton = findViewById(R.id.button2)
        submitButton = findViewById(R.id.button)

        // Reset button functionality
        resetButton.setOnClickListener {
            passwordInput.text?.clear()
            Toast.makeText(this, "Password reset", Toast.LENGTH_SHORT).show()
        }

        // Submit button functionality
        submitButton.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()
            val contactNumber = contactNumberInput.text.toString()

            if (username.isNotEmpty() && password.isNotEmpty() && contactNumber.isNotEmpty()) {
                Toast.makeText(this, "Details submitted successfully", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please fill in all the details", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
