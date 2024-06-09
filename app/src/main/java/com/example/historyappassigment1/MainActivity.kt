package com.example.historyappassigment1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val famousPeople = listOf(
        "Nelson Mandela", 95,
        "William Shakespeare", 52,
       "Alexander the Great", 33,
        "Albert Einstein", 88,
        "Cleopatra", 50,
        "George Washington", 63,
        "Benjamin Franklin", 76,
        "Steve Jobs", 56,
        "Leonardo da Vinci", 80,
        "Charles Darwin", 82
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        setContentView(R.layout.activity_main)



        val TextView = findViewById<TextView>(R.id.TextView)
        val EnterYourAge = findViewById<EditText>(R.id.EnterYourAge)
        val ButtonGenerate = findViewById<Button>(R. id.ButtonGenerate)
        val ButtonClear = findViewById<Button>(R.id.ButtonClear)


        ButtonGenerate.setOnClickListener {
            val age = EnterYourAge.text.toString().toIntOrNull()
            if (age != null) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("AGE", age)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please enter a valid age", Toast.LENGTH_SHORT).show()
            }
        }

        ButtonClear.setOnClickListener {
            EnterYourAge.text.clear()
        }
    }
}

class ResultActivity {

}



