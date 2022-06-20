package com.example.singleinstancepertask

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.singleinstancepertask.databinding.ActivityDBinding

class ActivityD : AppCompatActivity() {
    private lateinit var binding: ActivityDBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.activitydText.text = "Activity D with task id $taskId"

        binding.activitydtobButton.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java).apply {
                //flags = Intent.FLAG_ACTIVITY_MULTIPLE_TASK creates same activity in new task
            }
            startActivity(intent)
        }

        binding.activitydtodButton.setOnClickListener {
            val intent = Intent(this, ActivityD::class.java).apply {
            }
            startActivity(intent)
        }

        Log.d(ContentValues.TAG, "onCreate: activity D")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(ContentValues.TAG, "onNewIntent: activity D")
    }

    override fun onStart() {
        Log.d(ContentValues.TAG, "onStart: activity D")
        super.onStart()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(ContentValues.TAG, "onRestart: activity D")
    }

    override fun onResume() {
        Log.d(ContentValues.TAG, "onResume: activity D")
        super.onResume()
    }

    override fun onPause() {
        Log.d(ContentValues.TAG, "onPause: activity D")
        super.onPause()
    }

    override fun onStop() {
        Log.d(ContentValues.TAG, "onStop: activity D")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(ContentValues.TAG, "onDestroy: activity D")
        super.onDestroy()
    }
}