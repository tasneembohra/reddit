package com.tasneembohra.github.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.stayopn.di.application.DaggerFragment
import com.tasneembohra.github.R
import com.tasneembohra.github.databinding.FragmentArticleListBinding
import com.tasneembohra.github.ui.list.adapter.ArticleAdapter
import com.tasneembohra.github.util.hide
import com.tasneembohra.github.util.show
import kotlinx.android.synthetic.main.fragment_article_list.*
import javax.inject.Inject


class ArticleListFragment : DaggerFragment() {

    @Inject lateinit var viewModel: ArticleViewModel
    private lateinit var binding:FragmentArticleListBinding
    private lateinit var adapter:ArticleAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_article_list, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = viewLifecycleOwner

        binding.setRetryOnClickListener {
            viewModel.fetchArticles()
        }

        setRecyclerView()
        setObservers()
    }

    private fun setObservers() {
        viewModel.dataLiveData.observe(viewLifecycleOwner, Observer {
            adapter.update(it)
        })

        viewModel.loadingLiveData.observe(viewLifecycleOwner, Observer {
            if (it) {
                viewLoader.show()
            } else {
                viewLoader.hide()
            }
        })

        viewModel.errorLiveData.observe(viewLifecycleOwner, Observer {
            if (it) {
                viewError.show()
            } else {
                viewError.hide()
            }
        })
    }

    private fun setRecyclerView() {
        adapter = ArticleAdapter {position ->
            viewModel.getSelectedArticle(position)?.let {
                Bundle().apply {
                    putParcelable(BottomSheetDialog.BUNDLE_DATA, it)
                }.let {
                    findNavController().navigate(R.id.action_articleListFragment_to_bottomSheetDialog, it)

                }
            }
        }

        recyclerview.adapter = adapter
        recyclerview.setHasFixedSize(true)
        val layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        layoutManager.gapStrategy = StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS
        recyclerview.layoutManager = layoutManager
    }
}