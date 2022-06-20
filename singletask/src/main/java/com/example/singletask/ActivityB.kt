package com.example.singletask

import android.content.ContentValues
import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.singletask.databinding.ActivityBBinding

class ActivityB : AppCompatActivity() {
    private lateinit var binding: ActivityBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.activitybText.text = "Activity B with task id $taskId"

        binding.activitybtocButton.setOnClickListener {
            val intent = Intent(this, ActivityC::class.java)
            startActivity(intent)
        }

        binding.activitybtobButton.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java).apply {
                // flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }
            startActivity(intent)
        }

        Log.d(TAG, "onCreate: activity B")

    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(TAG, "onNewIntent: activity B")
    }

    override fun onStart() {
        Log.d(TAG, "onStart: activity B")
        super.onStart()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: activity B")
    }

    override fun onResume() {
        Log.d(TAG, "onResume: activity B")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPause: activity B")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop: activity B")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy: activity B")
        super.onDestroy()
    }
}