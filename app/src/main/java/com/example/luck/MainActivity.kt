package com.example.luck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val STRING_KEY = "String Key"
    val TAG = "Main Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate called")

        var textDisplay = findViewById<TextView>(R.id.textView)
        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            textDisplay.text = "Good luck"
        }
        if (savedInstanceState != null){
            textDisplay.text = savedInstanceState.getString(STRING_KEY)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d (TAG, "onSaveInstance called")
        outState.putString(STRING_KEY, "Good Luck")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d (TAG, "onResume called")

    }

    override fun onPause() {
        super.onPause()
        Log.d (TAG, "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d (TAG, "onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d (TAG, "onDestroy called")
    }
}