package com.tasneembohra.github.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.tasneembohra.github.R
import com.tasneembohra.github.databinding.FragmentArticleDetailBinding
import com.tasneembohra.github.repo.ArticleDataModel
import kotlinx.android.synthetic.main.fragment_article_detail.*

class BottomSheetDialog : BottomSheetDialogFragment() {

    companion object {
        const val BUNDLE_DATA = "data"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentArticleDetailBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_article_detail, container, false)

        arguments?.getParcelable<ArticleDataModel>(BUNDLE_DATA)?.let { binding.model = it }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonClose.setOnClickListener { dismiss() }
    }
}