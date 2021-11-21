package com.example.clone.UI

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class BlankViewModel @Inject constructor() : ViewModel () {
 var liveData: MutableLiveData<String> = MutableLiveData<String>()
        init {
            liveData.value = "Hallo"
        }
}