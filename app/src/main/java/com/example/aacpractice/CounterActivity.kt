package com.example.aacpractice

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.aacpractice.databinding.ActivityCounterBinding

class CounterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //데이터 바인딩
        val binding : ActivityCounterBinding = DataBindingUtil.setContentView(this,R.layout.activity_counter)
        //뷰모델
        val viewModel = ViewModelProviders.of(this).get(CounterViewModel::class.java)

        binding.countTextView.text = viewModel.counter.toString()

        binding.addFab.setOnClickListener {
            viewModel.counter++
            binding.countTextView.text = viewModel.counter.toString()
        }

        binding.subFab.setOnClickListener {
            viewModel.counter--
            binding.countTextView.text = viewModel.counter.toString()
        }

    }
}
