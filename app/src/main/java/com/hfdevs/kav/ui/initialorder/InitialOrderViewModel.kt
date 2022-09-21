package com.hfdevs.kav.ui.initialorder

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hfdevs.kav.R
import com.hfdevs.kav.data.model.InitialNewOrderItemData
import com.hfdevs.kav.data.model.NewOrderItemData

class InitialOrderViewModel (private val app: Application) : AndroidViewModel(app) {
    val data = MutableLiveData<List<InitialNewOrderItemData>>()


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
            InitialNewOrderItemData(R.drawable.banana,
                app.getString(R.string.initial_item_text_t),
                app.getString(R.string.initial_item_text_st)
            ),
            InitialNewOrderItemData(R.drawable.banana,
                app.getString(R.string.initial_item_text_t),
                app.getString(R.string.initial_item_text_st)
            ),
            InitialNewOrderItemData(R.drawable.banana,
                app.getString(R.string.initial_item_text_t),
                app.getString(R.string.initial_item_text_st)
            ),
            InitialNewOrderItemData(R.drawable.banana,
                app.getString(R.string.initial_item_text_t),
                app.getString(R.string.initial_item_text_st)
            ),

            InitialNewOrderItemData(R.drawable.fish,
                app.getString(R.string.initial_item_text_t2),
                app.getString(R.string.initial_item_text_st2)
            ),
            InitialNewOrderItemData(R.drawable.fish,
                app.getString(R.string.initial_item_text_t2),
                app.getString(R.string.initial_item_text_st2)
            ),
            InitialNewOrderItemData(R.drawable.fish,
                app.getString(R.string.initial_item_text_t2),
                app.getString(R.string.initial_item_text_st2)
            ),
            InitialNewOrderItemData(R.drawable.fish,
                app.getString(R.string.initial_item_text_t2),
                app.getString(R.string.initial_item_text_st2)
            ),

        )
    }
}