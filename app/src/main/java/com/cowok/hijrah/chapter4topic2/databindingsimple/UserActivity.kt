package com.cowok.hijrah.chapter4topic2.databindingsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.cowok.hijrah.chapter4topic2.R
import com.cowok.hijrah.chapter4topic2.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_user)

//        binding.textViewFirst.text = "Muhammad"
//        binding.textViewLast.text = "Fadhil"
        binding.userdata = DataUser("Fadhil", "Akmal")
    }
}