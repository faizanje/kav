package com.hfdevs.kav.ui.neworder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hfdevs.kav.databinding.NeworderLayout1Binding
import com.hfdevs.kav.data.model.NewOrderItemData

class NewOrderAdapter(var datalist:List<NewOrderItemData>) : RecyclerView.Adapter<NewOrderAdapter.MyViewHolder>(){

    class MyViewHolder( var binding: NeworderLayout1Binding) :RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NewOrderAdapter.MyViewHolder {
        return MyViewHolder(NeworderLayout1Binding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: NewOrderAdapter.MyViewHolder, position: Int) {
            var itemView = datalist[position];

           holder.binding.tvItem.setText(datalist[position].text.toString())
           holder.binding.tvItem.setCompoundDrawablesWithIntrinsicBounds(0,0,datalist[position].image,0)
           holder.binding.btnLayout.setOnClickListener{

           }

    }

    override fun getItemCount(): Int {
        return  datalist.size
    }

}