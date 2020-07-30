package com.tasneembohra.github.ui.list.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tasneembohra.github.databinding.ItemArticleBinding
import com.tasneembohra.github.repo.ArticleDataModel

// TODO use diff util
class ArticleAdapter(private val list:MutableList<ArticleDataModel> = mutableListOf(),
                     private val onClickListener:(position:Int) -> Unit):RecyclerView.Adapter<ArticleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        return ArticleViewHolder(ItemArticleBinding.inflate(LayoutInflater.from(parent.context), parent, false), onClickListener)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
       holder.bind(list[position])
    }

    override fun onViewRecycled(holder: ArticleViewHolder) {
        super.onViewRecycled(holder)
    }

    fun update(newList: List<ArticleDataModel>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }
}