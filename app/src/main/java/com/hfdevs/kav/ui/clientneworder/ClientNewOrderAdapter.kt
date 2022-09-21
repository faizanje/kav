package com.hfdevs.kav.ui.clientneworder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.hfdevs.kav.R
import com.hfdevs.kav.data.model.ClientNewOrderItemData
import com.hfdevs.kav.data.model.NewOrderItemData
import com.hfdevs.kav.databinding.ClientNeworderLayoutBinding

class ClientNewOrderAdapter(var datalist:List<ClientNewOrderItemData>): RecyclerView.Adapter<ClientNewOrderAdapter.MyViewHolder>() {
    class MyViewHolder(var binding: ClientNeworderLayoutBinding): RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        return  MyViewHolder(ClientNeworderLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.tvHeading.setText(datalist[position].heading)
        holder.binding.tvTitle.setText(datalist[position].title)
        holder.binding.tvSubTitle.setText(datalist[position].subTitle)
        holder.binding.imIcon.setImageResource(datalist[position].image)

        holder.binding.btnLayout.setOnClickListener{view->

            view.findNavController().navigate(R.id.action_clientNewOrderFragment_to_initialOrderFragment)
        }
    }

    override fun getItemCount(): Int {
        return  datalist.size
    }
}