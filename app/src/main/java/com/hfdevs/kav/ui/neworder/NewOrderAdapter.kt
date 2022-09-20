package com.hfdevs.kav.ui.neworder

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.hfdevs.kav.R
import com.hfdevs.kav.databinding.NeworderLayout1Binding
import com.hfdevs.kav.data.model.NewOrderItemData

class NewOrderAdapter(var datalist:List<NewOrderItemData>) : RecyclerView.Adapter<NewOrderAdapter.MyViewHolder>(){

    class MyViewHolder( var binding: NeworderLayout1Binding) :RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        return MyViewHolder(NeworderLayout1Binding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {


           holder.binding.tvItem.setText(datalist[position].text)
           holder.binding.tvItem.setCompoundDrawablesWithIntrinsicBounds(0,0,datalist[position].image,0)


        holder.binding.btnLayout.setOnClickListener{ view ->
                 if(position==0){
                    view.findNavController().navigate(R.id.action_overviewFragment_to_clientNewOrderFragment)
//                  Navigation.createNavigateOnClickListener(R.id.clientNewOrderFragment,null)
                 }

           }

    }

    override fun getItemCount(): Int {
        return  datalist.size
    }

}