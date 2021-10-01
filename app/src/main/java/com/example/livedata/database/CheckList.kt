package com.example.livedata.database

data class CheckList(val ItemText: String, val author: String) {

    override fun toString(): String {
        return "$ItemText - $author"
    }
}