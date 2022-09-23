package com.hfdevs.kav.ui.fragment.neworder

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.hfdevs.kav.R
import com.hfdevs.kav.data.model.KavNewOrderItemData

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