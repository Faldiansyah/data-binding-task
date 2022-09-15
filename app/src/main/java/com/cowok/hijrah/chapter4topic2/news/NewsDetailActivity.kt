package com.cowok.hijrah.chapter4topic2.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.cowok.hijrah.chapter4topic2.R
import com.cowok.hijrah.chapter4topic2.databinding.ActivityNewsDetailBinding

class NewsDetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityNewsDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_news_detail)

        getDataBundle()
    }

    fun getDataBundle(){
        var bund = intent.extras
        binding.detailJudul.text = bund!!.getString("title")
        binding.detailPenulis.text = bund!!.getString("writer")
        binding.detailGambar.setImageResource(bund!!.getInt("image"))
        binding.detailTanggal.text = bund!!.getString("date")
        binding.detailIsi.text = bund!!.getString("content")
    }
}