package com.prodev.recyclerview2

import android.icu.lang.UCharacter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tasks = ArrayList<Task>()
        tasks.add(Task("first one", true))
        tasks.add(Task("Second one ", true))
        tasks.add(Task("Third one ", true))

        task_recycler_view.adapter = TaskAdapter(tasks)
        task_recycler_view.layoutManager = LinearLayoutManager(this)
        task_recycler_view.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))

    }
}