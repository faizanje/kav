package com.hfdevs.kav.ui.fragment.neworder

import KavNewOrderAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfdevs.kav.data.model.KavNewOrderItemData
import com.hfdevs.kav.databinding.FragmentClientNewOrderBinding

class KavNewOrderFragment : Fragment() {

    private lateinit var binding: FragmentClientNewOrderBinding
    private val viewModel by viewModels<KavNewOrderViewModel>()
    private lateinit var adapter: KavNewOrderAdapter
    val list = mutableListOf<KavNewOrderItemData>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentClientNewOrderBinding.inflate(inflater, container, false)
        binding.btnBack.setOnClickListener{view->
            Navigation.findNavController(view).popBackStack()
        }
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
        adapter = KavNewOrderAdapter(list)
        binding.recyclerView.adapter = adapter
    }


}