package com.example.clone.DI

import com.example.clone.ENTITY.CloneCat
import dagger.Module
import dagger.Provides

@Module
class CloneModule {
    @Provides
    fun createCat():CloneCat{
return CloneCat("Hodor", 21)
    }
}