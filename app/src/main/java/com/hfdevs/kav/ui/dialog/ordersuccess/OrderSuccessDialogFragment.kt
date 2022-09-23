package com.hfdevs.kav.ui.dialog.ordersuccess

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hfdevs.kav.R
import com.hfdevs.kav.databinding.FragmentOrderSuccessDialogBinding

class OrderSuccessDialogFragment : Fragment() {
    lateinit var binding: FragmentOrderSuccessDialogBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentOrderSuccessDialogBinding.inflate(layoutInflater)
        return binding.root
    }
}