package com.hfdevs.kav.ui.fragment.tabneworder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels

import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfdevs.kav.R

import com.hfdevs.kav.data.model.TabNewOrderItemData
import com.hfdevs.kav.databinding.FragmentTabNewOrderBinding


class TabNewOrderFragment : Fragment() {

    private lateinit var binding: FragmentTabNewOrderBinding
    private val viewModel by viewModels<TabNewOrderViewModel>()
    private lateinit var adapter: TabOrderAdapter
    val list = mutableListOf<TabNewOrderItemData>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTabNewOrderBinding.inflate(inflater, container, false)


        init()
        observeData()
        viewModel.fetchData()
        binding.btnOrder.setOnClickListener { view ->

            findNavController()
                .navigate(R.id.action_tabOrderFragment_to_orderSummaryFragment)

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
        adapter = TabOrderAdapter(list, viewModel)
        binding.recyclerView.adapter = adapter
    }


}