package com.hfdevs.kav.ui.ordersummary

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hfdevs.kav.R
import com.hfdevs.kav.databinding.FragmentOrderSummaryBinding

class OrderSummaryFragment : Fragment() {


    private lateinit var viewModel: OrderSummaryViewModel
    private lateinit var binding:FragmentOrderSummaryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentOrderSummaryBinding.inflate(inflater,container,false)

        return binding.root
    }

}