package com.example.launchmodepractice

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.launchmodepractice.databinding.ActivityABinding
import com.example.launchmodepractice.databinding.ActivityBBinding

class ActivityB : AppCompatActivity() {
    private lateinit var binding: ActivityBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.activitybText.text = "Activity B with task id $taskId"

    }
}