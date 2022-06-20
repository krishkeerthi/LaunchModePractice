package com.example.singletask

import android.content.ContentValues
import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.singletask.databinding.ActivityBBinding
import com.example.singletask.databinding.ActivityDBinding

class ActivityD : AppCompatActivity() {
    private lateinit var binding: ActivityDBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.activitydText.text = "Activity D with task id $taskId"

        binding.activitydtodButton.setOnClickListener {
            val intent = Intent(this, ActivityD::class.java).apply {
                //flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }
            startActivity(intent)
        }

        binding.activitydtobButton.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java).apply {
                //flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }
            startActivity(intent)
        }

        Log.d(TAG, "onCreate: activity D")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(TAG, "onNewIntent: activity D")
    }

    override fun onStart() {
        Log.d(TAG, "onStart: activity D")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "onResume: activity D")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPause: activity D")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop: activity D")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy: activity D")
        super.onDestroy()
    }
}