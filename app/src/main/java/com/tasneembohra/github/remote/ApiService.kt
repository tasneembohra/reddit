package com.tasneembohra.github.remote

import com.tasneembohra.github.remote.model.MovieListResponse
import retrofit2.http.GET

interface ApiService {

    @GET("movie/popular?api_key=78a6a340867805be8573b2ec1789df75")
    suspend fun fetchMovieDetails():MovieListResponse
}