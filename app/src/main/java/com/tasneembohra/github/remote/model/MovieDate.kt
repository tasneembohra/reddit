package com.tasneembohra.github.remote.model

import com.google.gson.annotations.JsonAdapter
import com.tasneembohra.github.remote.util.MovieDateDeserializer

@JsonAdapter(MovieDateDeserializer::class)
class MovieDate(val date:String)