package com.hfdevs.kav.ui.ordersummary

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hfdevs.kav.R
import com.hfdevs.kav.data.model.OrderSummaryItemData
import com.hfdevs.kav.data.model.TabNewOrderItemData

class OrderSummaryViewModel (private val app: Application) : AndroidViewModel(app) {
    val data = MutableLiveData<List<OrderSummaryItemData>>()
    fun fetchData() {
        data.value = listOf(
            OrderSummaryItemData(

                "בננה"
            ),
            OrderSummaryItemData(

                "בננה"
            ),
            OrderSummaryItemData(

                "בננה"
            ),
            OrderSummaryItemData(

                "בננה"
            ),



            )
    }
}