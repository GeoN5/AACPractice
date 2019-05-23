package com.example.aacpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.aacpractice.databinding.ActivityCounterBinding

class CounterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //데이터 바인딩
        val binding: ActivityCounterBinding = DataBindingUtil.setContentView(this, R.layout.activity_counter)
        binding.lifecycleOwner = this
        //뷰모델
        val viewModel = ViewModelProviders.of(this).get(CounterViewModel::class.java)
        binding.viewModel = viewModel

    }
}
