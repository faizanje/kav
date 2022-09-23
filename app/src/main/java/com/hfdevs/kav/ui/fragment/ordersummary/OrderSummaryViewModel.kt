package com.hfdevs.kav.ui.fragment.ordersummary

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.hfdevs.kav.data.model.OrderSummaryItemData

class OrderSummaryViewModel (private val app: Application) : AndroidViewModel(app) {
    val data = MutableLiveData<List<OrderSummaryItemData>>()
    var flag:Boolean = false
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