package com.example.clone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.clone.DI.CloneComponent
import com.example.clone.ENTITY.CloneCat
import com.example.clone.ENTITY.CloneDog
import com.example.clone.ENTITY.CloneParrot
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var cloneComponent: CloneComponent
    @Inject
    lateinit var cloneCat: CloneCat
    @Inject
    lateinit var cloneParrot: CloneParrot
    @Inject
    lateinit var cloneDog: CloneDog
    override fun onCreate(savedInstanceState: Bundle?) {
        cloneComponent = (applicationContext as CloneApp).cloneComponent
        cloneComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}