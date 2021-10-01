package com.example.livedata.viewmodel

import androidx.lifecycle.ViewModel
import com.example.livedata.database.CheckList
import com.example.livedata.repository.CheckListItemRepository

class CheckListItemViewModel(private val listItemRepository: CheckListItemRepository) : ViewModel() {
    fun getCheckListItem() = listItemRepository.getItem()
    fun addItemCheckList(list: CheckList) = listItemRepository.addItem(list)

}