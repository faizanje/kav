package com.hfdevs.kav.ui.fragment.initialorder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.hfdevs.kav.R
import com.hfdevs.kav.data.model.InitialNewOrderItemData
import com.hfdevs.kav.databinding.InitialNeworderLayoutBinding

class InitialOrderAdapter(var datalist:List<InitialNewOrderItemData>, var model:InitialOrderViewModel) : RecyclerView.Adapter<InitialOrderAdapter.MyViewHolder>(){


    class MyViewHolder( var binding: InitialNeworderLayoutBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        return MyViewHolder(InitialNeworderLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {


        holder.binding.tvTitle.setText(datalist[position].title)
        holder.binding.tvSubTitle.setText(datalist[position].subTitle)
        holder.binding.imIcon.setImageResource(datalist[position].image)

        if(position==0 || position==4){

            holder.binding.tvHeading.visibility= View.VISIBLE
            if(position==4){
                holder.binding.tvHeading.setText("דגים")
            }
        }
        if(position >=4){
            holder.binding.btnIcon.setImageResource(R.drawable.minus)
        }

        holder.binding.btnAdd.setOnClickListener { view->
            model.increment(position)
            holder.binding.tvCount.setText(model.numbersList[position].toString())
            view.findNavController().navigate(R.id.action_initialOrderFragment_to_tabOrderFragment)
        }
        holder.binding.btnMinus.setOnClickListener {
            model.decrement(position)
            holder.binding.tvCount.setText(model.numbersList[position].toString())
        }

        holder.binding.btnLayout.setOnClickListener{ view ->
        }

    }

    override fun getItemCount(): Int {
        return  datalist.size
    }




}