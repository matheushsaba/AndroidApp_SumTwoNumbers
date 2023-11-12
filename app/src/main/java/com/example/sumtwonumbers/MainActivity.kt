package com.example.sumtwonumbers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.sumtwonumbers.ui.theme.SumTwoNumbersTheme
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNumberEditText = findViewById<EditText>(R.id.firstNumberEditText)
        val secondNumberEditText = findViewById<EditText>(R.id.secondNumberEditText)
        val sumButton = findViewById<Button>(R.id.sumButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        sumButton.setOnClickListener {
            val firstNumber = firstNumberEditText.text.toString().toDoubleOrNull() ?: 0.0
            val secondNumber = secondNumberEditText.text.toString().toDoubleOrNull() ?: 0.0
            val sum = firstNumber + secondNumber
            resultTextView.text = "Result: $sum"
        }

        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show()
    }



    override fun onStart() {
        super.onStart()

        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()

        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()

        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show()
    }



}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello aloha $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SumTwoNumbersTheme {
        Greeting("Android")
    }
}