package com.hfdevs.kav.ui.new_order

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfdevs.kav.R
import com.hfdevs.kav.databinding.FragmentOverviewBinding
import com.hfdevs.kav.ui.data.NewOrderItemData

class NewOrderFragment : Fragment() {

    private lateinit var binding: FragmentOverviewBinding
    private lateinit var viewModel: NewOrderViewModel
    private lateinit var adapter:NewOrderAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(NewOrderViewModel::class.java)
        binding= FragmentOverviewBinding.inflate(inflater,container,false)


        viewModel.list = listOf(

            NewOrderItemData(R.drawable.icon_button_1, this.getString(R.string.order_item_text_1)),
            NewOrderItemData(R.drawable.icon_button_2,this.getString(R.string.order_item_text_2)),
            NewOrderItemData(R.drawable.icon_button_3,this.getString(R.string.order_item_text_3)),
            NewOrderItemData(R.drawable.icon_button_4,this.getString(R.string.order_item_text_4))
        )
        binding.recyclerView.layoutManager = LinearLayoutManager(this.context)
        adapter = NewOrderAdapter( viewModel.list)
        binding.recyclerView.adapter = adapter

        return binding.root
    }


}