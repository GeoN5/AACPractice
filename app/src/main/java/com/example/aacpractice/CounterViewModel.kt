package com.example.aacpractice

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    var counter: MutableLiveData<Int> = MutableLiveData()

    init {
        counter.value = 0
    }

    fun increase(){
        counter.value = counter.value?.plus(1)
    }

    fun decrease(){
        counter.value = counter.value?.minus(1)
    }

}