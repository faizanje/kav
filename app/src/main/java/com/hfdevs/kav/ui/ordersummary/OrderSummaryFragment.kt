package com.hfdevs.kav.ui.ordersummary

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfdevs.kav.R
import com.hfdevs.kav.data.model.OrderSummaryItemData
import com.hfdevs.kav.data.model.TabNewOrderItemData
import com.hfdevs.kav.databinding.FragmentOrderSummaryBinding
import com.hfdevs.kav.ui.dialogs.SummaryDialogFragment
import com.hfdevs.kav.ui.tabneworder.TabNewOrderViewModel
import com.hfdevs.kav.ui.tabneworder.TabOrderAdapter

class OrderSummaryFragment : Fragment() {



    private lateinit var binding:FragmentOrderSummaryBinding
    private val viewModel by viewModels<OrderSummaryViewModel>()
    private lateinit var adapter: OrderSummaryAdapter
    val list = mutableListOf<OrderSummaryItemData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentOrderSummaryBinding.inflate(inflater,container,false)
        init()
        observeData()
        viewModel.fetchData()
        binding.btnOrder.setOnClickListener { view ->
//            findNavController().

            var dialog= SummaryDialogFragment()

            // make dialog itself transparent
//            context.applicationContext.g.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//
//            // remove background dim
//            getDialog().getWindow().setDimAmount(0);

             dialog.show(parentFragmentManager,"custom dialog")


//            findNavController()
//                .(R.id.action_orderSummaryFragment_to_summaryDialogFragment)

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
        adapter = OrderSummaryAdapter(list, viewModel)
        binding.recyclerView.adapter = adapter
    }
}