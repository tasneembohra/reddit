package com.tasneembohra.github.ui

import com.tasneembohra.github.ui.list.ArticleListFragment
import com.tasneembohra.github.ui.list.di.ArticleListFragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class HomeStructureModule {
    @ContributesAndroidInjector(modules = [ArticleListFragmentModule::class])
    abstract fun bindUserSearchFragment(): ArticleListFragment
}