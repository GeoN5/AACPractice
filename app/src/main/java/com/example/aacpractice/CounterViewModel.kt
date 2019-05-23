package com.example.aacpractice

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    var counter: MutableLiveData<Int> = MutableLiveData()

    init {
        counter.value = 0
    }

    fun increase(view: View) {
        counter.value = counter.value?.plus(1)
    }

    fun decrease(view: View) {
        counter.value = counter.value?.minus(1)
    }

}