package com.hfdevs.kav.ui.neworder

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hfdevs.kav.R
import com.hfdevs.kav.data.model.KavNewOrderItemData
import com.hfdevs.kav.data.model.NewOrderItemData

class KavNewOrderViewModel(private val app: Application) : AndroidViewModel(app) {
    val data = MutableLiveData<List<KavNewOrderItemData>>()

    fun fetchData() {
        data.value = listOf(
            KavNewOrderItemData(R.drawable.icon_button_3,
                app.getString(R.string.order_item_text_t1),
                app.getString(R.string.order_item_text_st1),

                ),
            KavNewOrderItemData(R.drawable.icon_button_3,
                app.getString(R.string.order_item_text_t1),
                app.getString(R.string.order_item_text_st1),

                ),
            KavNewOrderItemData(R.drawable.icon_button_3,
                app.getString(R.string.order_item_text_t1),
                app.getString(R.string.order_item_text_st1),

                ),
            KavNewOrderItemData(R.drawable.icon_button_3,
                app.getString(R.string.order_item_text_t1),
                app.getString(R.string.order_item_text_st1),

                ),
            KavNewOrderItemData(R.drawable.icon_button_3,
                app.getString(R.string.order_item_text_t1),
                app.getString(R.string.order_item_text_st1),

                ),
            KavNewOrderItemData(R.drawable.icon_button_3,
                app.getString(R.string.order_item_text_t1),
                app.getString(R.string.order_item_text_st1),

                ),
            KavNewOrderItemData(R.drawable.icon_button_3,
                app.getString(R.string.order_item_text_t1),
                app.getString(R.string.order_item_text_st1),

                ),
        )

    }
}