package com.cowok.hijrah.chapter4topic2.dbrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.cowok.hijrah.chapter4topic2.R
import com.cowok.hijrah.chapter4topic2.databinding.ActivityStudentBinding

class StudentActivity : AppCompatActivity() {
    lateinit var binding: ActivityStudentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_student)

        var listStudent = arrayListOf(
            DataStudent("Dwika", "Y7665", R.drawable.quran),
            DataStudent("Faldi", "J8809", R.drawable.quran_dua)
        )

        binding.rvStudent.adapter = StudentAdapter(listStudent)
        binding.rvStudent.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}