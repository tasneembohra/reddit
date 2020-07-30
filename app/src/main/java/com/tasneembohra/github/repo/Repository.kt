package com.tasneembohra.github.repo

import com.tasneembohra.github.remote.ApiProvider
import com.tasneembohra.github.remote.Result

class Repository(private val apiProvider: ApiProvider) {

    suspend fun fetchArticles():Result<List<ArticleDataModel>> {
        return apiProvider.fetchArticles()
    }

}