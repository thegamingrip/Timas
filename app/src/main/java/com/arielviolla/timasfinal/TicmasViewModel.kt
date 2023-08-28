package com.arielviolla.timasfinal

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TicmasViewModel : ViewModel() {

    private val _comparisonResult = MutableLiveData<Boolean>()
    val comparisonResult: LiveData<Boolean> = _comparisonResult

    fun compareStrings(str1: String, str2: String) {
        _comparisonResult.value = str1 == str2
    }
}