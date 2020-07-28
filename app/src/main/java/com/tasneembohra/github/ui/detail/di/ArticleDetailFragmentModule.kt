package com.tasneembohra.github.ui.detail.di

import com.tasneembohra.github.repo.Repository
import com.tasneembohra.github.ui.detail.ArticleDetailFragment
import com.tasneembohra.github.ui.list.ArticleViewModel
import com.tasneembohra.github.util.getActivityViewModel
import com.tasneembohra.github.util.getViewModel
import dagger.Module
import dagger.Provides

@Module
class ArticleDetailFragmentModule {

    @Provides
    fun provideViewModel(fragment: ArticleDetailFragment, repo: Repository) =
        fragment.getActivityViewModel { ArticleViewModel(repo) }
}