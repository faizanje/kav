package com.hfdevs.kav.ui.fragment.tabneworder

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.hfdevs.kav.R
import com.hfdevs.kav.data.model.TabNewOrderItemData


class TabNewOrderViewModel(private val app: Application) : AndroidViewModel(app) {
    val data = MutableLiveData<List<TabNewOrderItemData>>()
    val numbersList: IntArray = intArrayOf(10, 10, 10, 10,10,10,10,10)

    fun increment(pos:Int){
        numbersList[pos]++
    }
    fun decrement(pos:Int){
        numbersList[pos]--
    }
    val list = (10..40).toList()

    fun fetchData() {
        data.value = listOf(
            TabNewOrderItemData(
                R.drawable.banana,
                app.getString(R.string.initial_item_text_t),
                app.getString(R.string.initial_item_text_st)
            ),
            TabNewOrderItemData(
                R.drawable.banana,
                app.getString(R.string.initial_item_text_t),
                app.getString(R.string.initial_item_text_st)
            ),
            TabNewOrderItemData(
                R.drawable.banana,
                app.getString(R.string.initial_item_text_t),
                app.getString(R.string.initial_item_text_st)
            ),
            TabNewOrderItemData(
                R.drawable.banana,
                app.getString(R.string.initial_item_text_t),
                app.getString(R.string.initial_item_text_st)
            ),

            TabNewOrderItemData(
                R.drawable.fish,
                app.getString(R.string.initial_item_text_t2),
                app.getString(R.string.initial_item_text_st2)
            ),
            TabNewOrderItemData(
                R.drawable.fish,
                app.getString(R.string.initial_item_text_t2),
                app.getString(R.string.initial_item_text_st2)
            ),
            TabNewOrderItemData(
                R.drawable.fish,
                app.getString(R.string.initial_item_text_t2),
                app.getString(R.string.initial_item_text_st2)
            ),
            TabNewOrderItemData(
                R.drawable.fish,
                app.getString(R.string.initial_item_text_t2),
                app.getString(R.string.initial_item_text_st2)
            ),

            )
    }
}