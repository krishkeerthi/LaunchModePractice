package com.example.singleinstancepertask

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.singleinstancepertask.databinding.ActivityBBinding

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

        Log.d(ContentValues.TAG, "onCreate: activity B")

    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(ContentValues.TAG, "onNewIntent: activity B")
    }

    override fun onStart() {
        Log.d(ContentValues.TAG, "onStart: activity B")
        super.onStart()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(ContentValues.TAG, "onRestart: activity B")
    }

    override fun onResume() {
        Log.d(ContentValues.TAG, "onResume: activity B")
        super.onResume()
    }

    override fun onPause() {
        Log.d(ContentValues.TAG, "onPause: activity B")
        super.onPause()
    }

    override fun onStop() {
        Log.d(ContentValues.TAG, "onStop: activity B")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(ContentValues.TAG, "onDestroy: activity B")
        super.onDestroy()
    }
}