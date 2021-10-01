package com.example.livedata.repository

import com.example.livedata.database.CheckList
import com.example.livedata.database.CheckListDao

class CheckListItemRepository private constructor(private val checkListDao: CheckListDao){

    fun addItem(quote: CheckList){
        checkListDao.addItem(quote)
    }
    fun getItem() = checkListDao.getItem()

    companion object{
        @Volatile private var instance: CheckListItemRepository? = null

        fun getInstance(listDao: CheckListDao) = instance ?: synchronized(this){
            instance ?: CheckListItemRepository(listDao).also { instance = it }
        }
    }
}