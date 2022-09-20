package com.hfdevs.kav.ui.clientneworder

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfdevs.kav.data.model.ClientNewOrderItemData
import com.hfdevs.kav.databinding.FragmentClientNewOrderBinding

class ClientNewOrderFragment : Fragment() {

    private lateinit var binding: FragmentClientNewOrderBinding
    private val viewModel by viewModels<ClientNewOrderViewModel>()
    private lateinit var adapter: ClientNewOrderAdapter
    val list = mutableListOf<ClientNewOrderItemData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentClientNewOrderBinding.inflate(inflater,container,false)

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
        adapter = ClientNewOrderAdapter(list)
        binding.recyclerView.adapter = adapter
    }


}