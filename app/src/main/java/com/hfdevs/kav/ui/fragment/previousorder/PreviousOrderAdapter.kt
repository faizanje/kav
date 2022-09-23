package com.hfdevs.kav.ui.fragment.previousorder

import android.view.LayoutInflater
import android.view.View

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.hfdevs.kav.data.model.PreviousNewOrderItemData

import com.hfdevs.kav.databinding.PreviousOrderLayoutBinding


class PreviousOrderAdapter (var datalist:List<PreviousNewOrderItemData>, var model: PreviousOrderViewModel) : RecyclerView.Adapter<PreviousOrderAdapter.MyViewHolder>(){


    class MyViewHolder( var binding: PreviousOrderLayoutBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        return MyViewHolder(PreviousOrderLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.tvDate.setText(datalist[position].date)

        if(position==0 || position==4){

            holder.binding.tvHeading.visibility= View.VISIBLE
            if(position==4){
                holder.binding.tvHeading.setText("חודש יוני")
            }
        }

        holder.binding.checkbox.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                model.isTrue(position)
                holder.binding.checkbox.isChecked= model.checkList[position]
            }
            else{
                model.isFalse(position)
                holder.binding.checkbox.isChecked= model.checkList[position]
            }


        }
    }

    override fun getItemCount(): Int {
        return  datalist.size
    }




}