package com.hfdevs.kav.ui.fragment.ordersummary

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hfdevs.kav.data.model.OrderSummaryItemData
import com.hfdevs.kav.databinding.SummaryItemLayoutBinding

class OrderSummaryAdapter (var datalist:List<OrderSummaryItemData>, var model: OrderSummaryViewModel) : RecyclerView.Adapter<OrderSummaryAdapter.MyViewHolder>(){


    class MyViewHolder( var binding: SummaryItemLayoutBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        return MyViewHolder(SummaryItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {


        holder.binding.tvFirst.setText(datalist[position].firstColText)



    }

    override fun getItemCount(): Int {
        return  datalist.size
    }

}