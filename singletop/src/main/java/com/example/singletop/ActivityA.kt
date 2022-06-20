package com.example.singletop

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.singletop.databinding.ActivityABinding

class ActivityA : AppCompatActivity() {
    private lateinit var binding: ActivityABinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityABinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.activityaText.text = "Activity A with task id $taskId"

        binding.activityatoaButton.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
            }
            startActivity(intent)
        }

        binding.activityatobButton.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: single top Activity A")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(TAG, "onNewIntent: single top Activity A")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: single top Activity A")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: single top Activity A")
    }
}