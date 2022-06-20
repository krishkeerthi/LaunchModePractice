package com.example.singletask

import android.content.ContentValues
import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.singletask.databinding.ActivityABinding

class ActivityA : AppCompatActivity() {
    private lateinit var binding: ActivityABinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityABinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.activityaText.text = "Activity A with task id $taskId"

        binding.activityatobButton.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java).apply {
                //flags = Intent.FLAG_ACTIVITY_NEW_TASK not working like "single task"
            }
            startActivity(intent)
        }

        Log.d(TAG, "onCreate: activity A")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(TAG, "onNewIntent: activity A")
    }

    override fun onStart() {
        Log.d(TAG, "onStart: activity A")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "onResume: activity A")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPause: activity A")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop: activity A")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy: activity A")
        super.onDestroy()
    }

}