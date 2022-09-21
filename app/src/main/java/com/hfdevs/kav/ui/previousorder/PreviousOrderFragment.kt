package com.hfdevs.kav.ui.previousorder

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfdevs.kav.R
import com.hfdevs.kav.data.model.PreviousNewOrderItemData
import com.hfdevs.kav.data.model.TabNewOrderItemData
import com.hfdevs.kav.databinding.FragmentPreviousOrderBinding
import com.hfdevs.kav.ui.tabneworder.TabNewOrderViewModel
import com.hfdevs.kav.ui.tabneworder.TabOrderAdapter

class PreviousOrderFragment : Fragment() {



    private lateinit var binding:FragmentPreviousOrderBinding
    private val viewModel by viewModels<PreviousOrderViewModel>()
    private lateinit var adapter: PreviousOrderAdapter
    val list = mutableListOf<PreviousNewOrderItemData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentPreviousOrderBinding.inflate(inflater,container,false)

        init()
        observeData()
        viewModel.fetchData()
        binding.btnBack.setOnClickListener{view->
            Navigation.findNavController(view).popBackStack()
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
        adapter = PreviousOrderAdapter(list,viewModel)
        binding.recyclerView.adapter = adapter
    }
}