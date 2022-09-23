package com.hfdevs.kav.ui.dialog.ordersuccess

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.hfdevs.kav.R
import com.hfdevs.kav.databinding.FragmentOrderSuccessDialogBinding

class OrderSuccessDialogFragment : DialogFragment(){
    lateinit var binding: FragmentOrderSuccessDialogBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentOrderSuccessDialogBinding.inflate(layoutInflater)
        binding.button.setOnClickListener{view->

                findNavController().navigate(R.id.action_orderSuccessDialogFragment_to_orderViewFragment)

//            findNavController().navigate(R.id.action_orderSuccessDialogFragment_to_orderViewFragment)

        }

        getDialog()!!.getWindow()!!.setWindowAnimations(0)

        return binding.root
    }
}