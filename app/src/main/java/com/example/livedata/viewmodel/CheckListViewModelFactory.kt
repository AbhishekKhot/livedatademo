package com.example.livedata.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.livedata.repository.CheckListItemRepository

class CheckListViewModelFactory(private val listItemRepository: CheckListItemRepository) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return CheckListItemViewModel(listItemRepository) as T
    }

}