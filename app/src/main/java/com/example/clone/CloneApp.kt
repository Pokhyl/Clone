package com.example.clone

import android.app.Application
import com.example.clone.DI.CloneComponent
import com.example.clone.DI.DaggerCloneComponent
import com.example.clone.ENTITY.CloneParrot

class CloneApp: Application() {
lateinit var cloneComponent: CloneComponent
    override fun onCreate() {
        super.onCreate()
        cloneComponent = DaggerCloneComponent
            .builder()
            .createParrot(CloneParrot("fuk"))
            .build()
    }
}