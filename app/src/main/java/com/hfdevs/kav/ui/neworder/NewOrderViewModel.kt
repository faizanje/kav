package com.hfdevs.kav.ui.neworder

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hfdevs.kav.R
import com.hfdevs.kav.data.model.NewOrderItemData

class NewOrderViewModel(private val app: Application) : AndroidViewModel(app) {
    val data = MutableLiveData<List<NewOrderItemData>>()

    fun fetchData() {
        data.value = listOf(
            NewOrderItemData(R.drawable.icon_button_1, app.getString(R.string.order_item_text_1)),
            NewOrderItemData(R.drawable.icon_button_2,app.getString(R.string.order_item_text_2)),
            NewOrderItemData(R.drawable.icon_button_3,app.getString(R.string.order_item_text_3)),
            NewOrderItemData(R.drawable.icon_button_4,app.getString(R.string.order_item_text_4))
        )
    }
}