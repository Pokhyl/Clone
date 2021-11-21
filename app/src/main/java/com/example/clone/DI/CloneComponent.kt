package com.example.clone.DI

import com.example.clone.ENTITY.CloneParrot
import com.example.clone.MainActivity
import com.example.clone.UI.BlankFragment
import com.example.clone.UI.BlankFragment1
import dagger.BindsInstance
import dagger.Component

@Component(modules = [ViewModelModule::class, CloneModule::class])
interface CloneComponent {
    @Component.Builder
    interface Builder {
      @BindsInstance
      fun createParrot(cloneParrot: CloneParrot): Builder
      fun build():CloneComponent
    }
    fun inject(mainActivity: MainActivity)
    fun inject(blankFragment1: BlankFragment1)
    fun inject(blankFragment: BlankFragment)
}