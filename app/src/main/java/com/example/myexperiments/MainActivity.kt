package com.example.myexperiments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(), MyView {
    private var list:ListView? = null
    private val presenter:Presenter = PresenterImpl(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list = findViewById(R.id.list_item)
        val fab:FloatingActionButton = findViewById(R.id.fab)

        presenter.setView()

        fab.setOnClickListener {
            presenter.addItem()
        }
    }

    override fun updateItems(items: List<String>) {
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)
        list?.adapter = adapter
    }
}
