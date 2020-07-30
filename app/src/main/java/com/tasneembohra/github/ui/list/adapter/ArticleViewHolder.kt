package com.tasneembohra.github.ui.list.adapter

import androidx.recyclerview.widget.RecyclerView
import com.tasneembohra.github.databinding.ItemArticleBinding
import com.tasneembohra.github.repo.ArticleDataModel

class ArticleViewHolder(private val binding:ItemArticleBinding,
                        private val onClickListener:(position:Int) -> Unit):RecyclerView.ViewHolder(binding.root) {
    init {
        itemView.setOnClickListener { onClickListener.invoke(adapterPosition) }
    }
    fun bind(model:ArticleDataModel) {
        binding.model = model
    }
}