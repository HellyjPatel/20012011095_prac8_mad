package com.example.a20012011095_mad_practical_8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.drawable.AnimationDrawable
import androidx.core.view.WindowCompat
import com.example.a20012011095_mad_practical_8.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    lateinit var alarmframebyframeanimation : AnimationDrawable
    lateinit var heartframebyframeanimation : AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        val imageAlarmFrame = binding.imageAlarmFrame
        imageAlarmFrame.setBackgroundResource(R.drawable.alarm_animation_list)
        alarmframebyframeanimation = imageAlarmFrame.background as AnimationDrawable
        alarmframebyframeanimation.start()
        val imageHeartFrame = binding.imageHeartFrame
        imageHeartFrame.setBackgroundResource(R.drawable.heart_animation)
        heartframebyframeanimation = imageHeartFrame.background as AnimationDrawable
        heartframebyframeanimation.start()
    }
}