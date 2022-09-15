package com.cowok.hijrah.chapter4topic2.news

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cowok.hijrah.chapter4topic2.databinding.ItemNewsBinding

class NewsAdapter(var listNews: ArrayList<News>): RecyclerView.Adapter<NewsAdapter.ViewHolder>() {
    var onClick : ((News) -> Unit)? = null

    class ViewHolder(val binding: ItemNewsBinding): RecyclerView.ViewHolder(binding.root) {

        fun dataBind(itemData: News){
            binding.news = itemData
            binding.cardViewItem.setOnClickListener(object: View.OnClickListener{
                override fun onClick(view: View?) {
                    var bundle = Bundle()
                    bundle.putString("title",itemData.title)
                    bundle.putString("date",itemData.date)
                    bundle.putInt("image",itemData.image)
                    bundle.putString("writer",itemData.writer)
                    bundle.putString("content",itemData.content)
                    val intent = Intent(view!!.context,NewsDetailActivity::class.java)
                    intent.putExtras(bundle)
                    view.context.startActivity(intent)
                }

            })
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = ItemNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.dataBind(listNews[position])
    }

    override fun getItemCount(): Int {
        return listNews.size
    }
}