package com.example.clone.UI

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class CloneViewModel @Inject constructor(var repository: CloneRepository): ViewModel() {
    var liveData = MutableLiveData<String>()
    init {
        liveData.value = repository.s
    }
}