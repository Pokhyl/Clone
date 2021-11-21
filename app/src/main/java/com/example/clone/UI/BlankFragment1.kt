package com.example.clone.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.clone.CloneApp
import com.example.clone.ENTITY.CloneCat
import com.example.clone.ENTITY.CloneDog
import com.example.clone.ENTITY.CloneParrot
import com.example.clone.MainActivity
import com.example.clone.R
import javax.inject.Inject


class BlankFragment1 : Fragment() {
    @Inject
    lateinit var cloneCat: CloneCat
    @Inject
    lateinit var cloneParrot: CloneParrot
    @Inject
    lateinit var cloneDog: CloneDog
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel: CloneViewModel by viewModels {
        viewModelFactory
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        (requireContext() as MainActivity).cloneComponent.inject(this)
        var view = inflater.inflate(R.layout.fragment_blank1, container, false)
        viewModel.liveData.observe(viewLifecycleOwner){ println("$it ?????????????????")}
        return view
    }

}