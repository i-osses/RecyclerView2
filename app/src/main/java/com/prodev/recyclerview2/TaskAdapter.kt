package com.prodev.recyclerview2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.task_item.view.*

class TaskAdapter(private val tasks:ArrayList<Task> =ArrayList()) :RecyclerView.Adapter<TaskAdapter.TaskViewHolder>(){

    class TaskViewHolder(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view =LayoutInflater.from(parent.context)
            .inflate(R.layout.task_item, parent, false)
            return(TaskViewHolder(view))
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.itemView.message_box.text =tasks[position].taskName

        holder.itemView.complete_checkBox.isChecked = tasks[position].complete

    }

    override fun getItemCount(): Int {
        return tasks.size
    }
}