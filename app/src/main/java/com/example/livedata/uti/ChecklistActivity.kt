package com.example.livedata.uti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.livedata.viewmodel.CheckListItemViewModel
import com.example.livedata.R
import com.example.livedata.database.CheckList
import kotlinx.android.synthetic.main.activity_checklist.*
import java.lang.StringBuilder

class ChecklistActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checklist)
        setup()
    }

    private fun setup() {
        val factory = Injection.ChecklistItemViewModelFactory()
        val viewModel = ViewModelProviders.of(this,factory).get(CheckListItemViewModel::class.java)
        viewModel.getCheckListItem().observe(this, Observer { quotes ->
            val stringBuilder = StringBuilder()
            quotes.forEach{ quote->stringBuilder.append("$quote\n\n")}
            textView_quotes.text = stringBuilder.toString()
        })
        button_add_quote.setOnClickListener{
            val quote = CheckList(editText_quote.text.toString(),editText_author.text.toString())
            viewModel.addItemCheckList(quote)
            editText_author.setText("")
            editText_quote.setText("")
        }
    }
}