package com.hfdevs.kav.ui.neworder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfdevs.kav.databinding.FragmentOverviewBinding
import com.hfdevs.kav.data.model.NewOrderItemData

class NewOrderFragment : Fragment() {

    private lateinit var binding: FragmentOverviewBinding
    private val viewModel by viewModels<NewOrderViewModel>()
    private lateinit var adapter: NewOrderAdapter
    private val list = mutableListOf<NewOrderItemData>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOverviewBinding.inflate(inflater, container, false)
        init()
        observeData()
        viewModel.fetchData()
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
        adapter = NewOrderAdapter(list)
        binding.recyclerView.adapter = adapter
    }


}