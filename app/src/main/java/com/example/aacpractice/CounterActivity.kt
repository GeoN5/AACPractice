package com.example.aacpractice

import android.arch.lifecycle.Observer
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

        binding.addFab.setOnClickListener {
            viewModel.increase()
        }

        binding.subFab.setOnClickListener {
            viewModel.decrease()
        }

        //데이터 변경 관찰
        viewModel.counter.observe(this, Observer<Int> {
            //Override onChanged(): Ui 갱신
            binding.countTextView.text = it.toString()
        })

    }
}
