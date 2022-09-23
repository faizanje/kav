package com.hfdevs.kav.ui.fragment.ordersummary

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
import com.hfdevs.kav.databinding.FragmentOrderSummaryBinding
import com.hfdevs.kav.ui.dialog.ordersuccess.OrderSuccessDialogFragment
import com.hfdevs.kav.ui.dialog.social.SocialDialogFragment
import com.hfdevs.kav.ui.dialog.summary.SummaryDialogFragment

class OrderSummaryFragment : Fragment() {


    private lateinit var binding: FragmentOrderSummaryBinding
    private val viewModel by viewModels<OrderSummaryViewModel>()
    private lateinit var adapter: OrderSummaryAdapter
    val list = mutableListOf<OrderSummaryItemData>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOrderSummaryBinding.inflate(inflater, container, false)
        init()
        observeData()
        viewModel.fetchData()
        binding.btnOrder.setOnClickListener { view ->
            if (viewModel.flag == false) {
                val dialog = SummaryDialogFragment()

                // make dialog itself transparent
//            context.applicationContext.g.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//
//            // remove background dim
//            getDialog().getWindow().setDimAmount(0);

                dialog.show(parentFragmentManager, "custom dialog")
            } else {

                findNavController()
                    .navigate(R.id.action_orderSummaryFragment_to_orderSuccessDialogFragment)
//                var dialog = OrderSuccessDialogFragment()

                // make dialog itself transparent
//            context.applicationContext.g.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//
//            // remove background dim
//            getDialog().getWindow().setDimAmount(0);

//                dialog.show(parentFragmentManager, "custom dialog")
            }
            viewModel.flag = true
//            findNavController().


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