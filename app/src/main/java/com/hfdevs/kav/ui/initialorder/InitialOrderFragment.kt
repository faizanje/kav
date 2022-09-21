package com.hfdevs.kav.ui.initialorder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfdevs.kav.R
import com.hfdevs.kav.data.model.InitialNewOrderItemData
import com.hfdevs.kav.data.model.NewOrderItemData

import com.hfdevs.kav.databinding.FragmentInitialOrderBinding
import com.hfdevs.kav.databinding.FragmentOverviewBinding
import com.hfdevs.kav.ui.neworder.NewOrderAdapter
import com.hfdevs.kav.ui.neworder.NewOrderViewModel

class InitialOrderFragment : Fragment() {

     private lateinit var binding: FragmentInitialOrderBinding
    private val viewModel by viewModels<InitialOrderViewModel>()
    private lateinit var adapter: InitialOrderAdapter
    val list = mutableListOf<InitialNewOrderItemData>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentInitialOrderBinding.inflate(inflater,container,false)
        init()
        observeData()
        viewModel.fetchData()
        binding.btnBack.setOnClickListener{view->
            Navigation.findNavController(view).popBackStack()
        }
        binding.btnOrder.setOnClickListener{view->

            view.findNavController().navigate(R.id.action_initialOrderFragment_to_previousOrderFragment)
        }
        return binding.root
    }

    private fun observeData() {
        viewModel.data.observe(viewLifecycleOwner) {
            list.clear()
            list.addAll(it)
            adapter.notifyDataSetChanged()
        }
    }

    private fun init() {

        binding.recyclerView.layoutManager = LinearLayoutManager(this.context)
        adapter = InitialOrderAdapter(list,viewModel)
        binding.recyclerView.adapter = adapter

    }


}