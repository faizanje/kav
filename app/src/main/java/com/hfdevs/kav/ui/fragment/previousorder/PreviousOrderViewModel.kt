package com.hfdevs.kav.ui.fragment.previousorder

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.hfdevs.kav.R
import com.hfdevs.kav.data.model.PreviousNewOrderItemData

class PreviousOrderViewModel(private val app: Application) : AndroidViewModel(app) {
    val data = MutableLiveData<List<PreviousNewOrderItemData>>()

    val checkList: BooleanArray = booleanArrayOf(false,false,false,false,false,false,false,false,false)

    fun isTrue(pos:Int){
        checkList[pos]=true
    }
    fun isFalse(pos:Int){
        checkList[pos]=false
    }



    fun fetchData() {
        data.value = listOf(
            PreviousNewOrderItemData(app.getString(R.string.tab_text_date)),
            PreviousNewOrderItemData(app.getString(R.string.tab_text_date)),
            PreviousNewOrderItemData(app.getString(R.string.tab_text_date)),
            PreviousNewOrderItemData(app.getString(R.string.tab_text_date)),
            PreviousNewOrderItemData(app.getString(R.string.tab_text_date)),
            PreviousNewOrderItemData(app.getString(R.string.tab_text_date)),
            PreviousNewOrderItemData(app.getString(R.string.tab_text_date)),
            PreviousNewOrderItemData(app.getString(R.string.tab_text_date)),
            PreviousNewOrderItemData(app.getString(R.string.tab_text_date)),


            )
    }
}