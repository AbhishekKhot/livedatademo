package com.example.livedata.database

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class CheckListDao {
    private val itemList = mutableListOf<CheckList>()
    private val item = MutableLiveData<List<CheckList>>()

    init {
        item.value = itemList
    }

    fun addItem(ItemList: CheckList){
        itemList.add(ItemList)
        item.value = itemList
    }

    fun getItem() = item as LiveData<List<CheckList>>

}