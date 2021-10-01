package com.example.livedata.database

class Database  private constructor(){
    var checkListDao = CheckListDao()
    private set

    companion object{
        @Volatile private var instance: Database? = null
        fun getInstance() =
            instance ?: synchronized(this){
                instance ?: Database().also { instance = it }
            }
    }
}