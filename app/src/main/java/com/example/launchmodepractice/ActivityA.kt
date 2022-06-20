package com.example.launchmodepractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.launchmodepractice.databinding.ActivityABinding

class ActivityA : AppCompatActivity() {
    private lateinit var binding: ActivityABinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityABinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.activityaText.text = "Activity A with task id $taskId"

        binding.activityaButton.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
        }
    }
}