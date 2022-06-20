package com.example.singletask

import android.content.ContentValues
import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.singletask.databinding.ActivityBBinding
import com.example.singletask.databinding.ActivityCBinding

class ActivityC : AppCompatActivity() {
    private lateinit var binding: ActivityCBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.activitycText.text = "Activity C with task id $taskId"

        binding.activityctodButton.setOnClickListener {
            val intent = Intent(this, ActivityD::class.java).apply {
                //flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }
            startActivity(intent)
        }

        Log.d(TAG, "onCreate: activity C")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(TAG, "onNewIntent: activity C")
    }

    override fun onStart() {
        Log.d(TAG, "onStart: activity C")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "onResume: activity C")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPause: activity C")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop: activity C")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy: activity C")
        super.onDestroy()
    }
}