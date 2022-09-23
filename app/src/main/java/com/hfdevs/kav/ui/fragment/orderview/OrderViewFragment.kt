package com.hfdevs.kav.ui.fragment.orderview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hfdevs.kav.R
import com.hfdevs.kav.databinding.FragmentOrderViewBinding

class OrderViewFragment : Fragment() {
    lateinit var binding: FragmentOrderViewBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOrderViewBinding.inflate(layoutInflater)
        return binding.root
    }
}