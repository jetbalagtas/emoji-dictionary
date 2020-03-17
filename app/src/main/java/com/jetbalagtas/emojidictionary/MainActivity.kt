package com.jetbalagtas.emojidictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var layoutManager : GridLayoutManager
    lateinit var adapter : EmojiAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager = GridLayoutManager(this, 3)
        recyclerView.layoutManager = layoutManager

        adapter = EmojiAdapter()
        recyclerView.adapter = adapter
    }
}
