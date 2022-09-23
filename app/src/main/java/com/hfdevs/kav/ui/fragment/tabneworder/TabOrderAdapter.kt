package com.hfdevs.kav.ui.fragment.tabneworder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hfdevs.kav.R
import com.hfdevs.kav.data.model.TabNewOrderItemData
import com.hfdevs.kav.databinding.TabNeworderLayoutBinding

class TabOrderAdapter(var datalist:List<TabNewOrderItemData>, var model: TabNewOrderViewModel) : RecyclerView.Adapter<TabOrderAdapter.MyViewHolder>(){


    class MyViewHolder( var binding: TabNeworderLayoutBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        return MyViewHolder(TabNeworderLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))

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
        }
        holder.binding.btnMinus.setOnClickListener { view->
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