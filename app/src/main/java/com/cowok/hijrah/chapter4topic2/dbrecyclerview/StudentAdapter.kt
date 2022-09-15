package com.cowok.hijrah.chapter4topic2.dbrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cowok.hijrah.chapter4topic2.databinding.ItemStudentBinding

class StudentAdapter(var listStudent: ArrayList<DataStudent>)
    : RecyclerView.Adapter<StudentAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemStudentBinding): RecyclerView.ViewHolder(binding.root) {
        fun dataBind(itemData: DataStudent){
            binding.student = itemData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = ItemStudentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.dataBind(listStudent[position])
    }

    override fun getItemCount(): Int {
        return listStudent.size
    }
}