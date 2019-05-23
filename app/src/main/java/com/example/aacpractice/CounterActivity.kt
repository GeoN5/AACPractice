package com.example.aacpractice

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.aacpractice.databinding.ActivityCounterBinding

class CounterActivity : AppCompatActivity() {

    private var counter:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityCounterBinding = DataBindingUtil.setContentView(this,R.layout.activity_counter)

        binding.countTextView.text = "0"

        binding.addFab.setOnClickListener {
            binding.countTextView.text = counter++.toString()
        }

        binding.subFab.setOnClickListener {
            binding.countTextView.text = counter--.toString()
        }

    }
}
