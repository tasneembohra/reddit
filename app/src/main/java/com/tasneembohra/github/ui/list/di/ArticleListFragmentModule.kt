package com.tasneembohra.github.ui.list.di

import com.tasneembohra.github.repo.Repository
import com.tasneembohra.github.ui.list.ArticleListFragment
import com.tasneembohra.github.ui.list.ArticleViewModel
import com.tasneembohra.github.util.getActivityViewModel
import com.tasneembohra.github.util.getViewModel
import dagger.Module
import dagger.Provides

@Module
class ArticleListFragmentModule {

    @Provides
    fun provideViewModel(fragment: ArticleListFragment, repo: Repository) =
        fragment.getViewModel { ArticleViewModel(repo) }
}