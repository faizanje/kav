package com.hfdevs.kav.ui.clientneworder

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hfdevs.kav.R
import com.hfdevs.kav.data.model.ClientNewOrderItemData
import com.hfdevs.kav.data.model.NewOrderItemData

class ClientNewOrderViewModel(private val app: Application) : AndroidViewModel(app) {
    val data = MutableLiveData<List<ClientNewOrderItemData>>()

    fun fetchData() {
        data.value = listOf(
            ClientNewOrderItemData(R.drawable.count,
                app.getString(R.string.order_item_text_h1),
                app.getString(R.string.order_item_text_t1),
                app.getString(R.string.order_item_text_st1),
            ),
            ClientNewOrderItemData(R.drawable.count_2,
                app.getString(R.string.order_item_text_h2),
                app.getString(R.string.order_item_text_t2),
                app.getString(R.string.order_item_text_st2),
            ),
            ClientNewOrderItemData(R.drawable.count_1,
                "",
                app.getString(R.string.order_item_text_t3),
                app.getString(R.string.order_item_text_st3),
            ),
            ClientNewOrderItemData(R.drawable.count_1,
                "",
                app.getString(R.string.order_item_text_t4),
                app.getString(R.string.order_item_text_st4),
            ),
            ClientNewOrderItemData(R.drawable.count_1,
                "",
                app.getString(R.string.order_item_text_t4),
                app.getString(R.string.order_item_text_st4),
            ),
            ClientNewOrderItemData(R.drawable.count_4,
                "",
                app.getString(R.string.order_item_text_t4),
                app.getString(R.string.order_item_text_st4),
            ),
            ClientNewOrderItemData(R.drawable.count_5,
                "",
                app.getString(R.string.order_item_text_t4),
                app.getString(R.string.order_item_text_st4),
            ),
            ClientNewOrderItemData(R.drawable.count_5,
                "",
                app.getString(R.string.order_item_text_t4),
                app.getString(R.string.order_item_text_st4),
            ),

        )
    }
}