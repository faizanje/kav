package com.hfdevs.kav.ui.fragment.orderview

import android.R.layout
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.hfdevs.kav.R
import com.hfdevs.kav.data.model.PreviousNewOrderItemData
import com.hfdevs.kav.databinding.FragmentOrderViewBinding
import com.hfdevs.kav.ui.fragment.previousorder.PreviousOrderAdapter
import com.hfdevs.kav.ui.fragment.previousorder.PreviousOrderViewModel


class OrderViewFragment : Fragment() {

    private val viewModel by viewModels<PreviousOrderViewModel>()
    private lateinit var adapter: PreviousOrderAdapter
    val list = mutableListOf<PreviousNewOrderItemData>()

    lateinit var binding: FragmentOrderViewBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOrderViewBinding.inflate(layoutInflater)

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

    fun showCustomSnackBar(){
        val snackbar: Snackbar = Snackbar.make(binding.root, "הזמנה בוצעה בהצלחה!", Snackbar.LENGTH_LONG)
        val snackbarLayout = snackbar.view
        val textView =
            snackbarLayout.findViewById<View>(com.google.android.material.R.id.snackbar_text) as TextView
        textView.setCompoundDrawablesWithIntrinsicBounds(com.hfdevs.kav.R.drawable.checked, 0, 0, 0)
//        textView.compoundDrawablePadding =
//            resources.getDimensionPixelOffset(com.google.android.material.R.snackbar_icon_padding)
        snackbar.show()
    }
}