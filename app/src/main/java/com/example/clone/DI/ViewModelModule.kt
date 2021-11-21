package com.example.clone.DI

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.clone.UI.BlankViewModel
import com.example.clone.UI.CloneViewModel
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
    @Binds
    @IntoMap
    @ViewModelKey(CloneViewModel::class)
    abstract fun  bindsBaseSetupViewModel(baseSetupViewModel: CloneViewModel):ViewModel
    @Binds
    @IntoMap
    @ViewModelKey(BlankViewModel::class)
    abstract fun  bindsBaseSetup1ViewModel(baseSetupViewModel: BlankViewModel):ViewModel
}