package com.tasneembohra.github.remote

import com.tasneembohra.github.repo.ArticleDataModel

class ApiProvider(private val api: ApiService) {

    suspend fun fetchArticles():Result<List<ArticleDataModel>> {
        kotlin.runCatching {
            api.fetchArticles()
        }.onSuccess {
            return SuccessState(it.build())
        }.onFailure {
            return ErrorState(ErrorModel())
        }
        return LoadingState()
    }
}