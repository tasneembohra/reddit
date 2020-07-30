package com.tasneembohra.github.remote

import com.tasneembohra.github.remote.model.ArticleListResponse
import retrofit2.http.GET

interface ApiService {

    @GET("r/kotlin/.json")
    suspend fun fetchArticles():ArticleListResponse
}