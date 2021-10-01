package com.example.livedata.uti

import com.example.livedata.database.Database
import com.example.livedata.repository.CheckListItemRepository
import com.example.livedata.viewmodel.CheckListViewModelFactory

object Injection {
    fun ChecklistItemViewModelFactory() : CheckListViewModelFactory {
        val listItemRepository =
            CheckListItemRepository.getInstance(Database.getInstance().checkListDao)
        return CheckListViewModelFactory(listItemRepository)
    }
}